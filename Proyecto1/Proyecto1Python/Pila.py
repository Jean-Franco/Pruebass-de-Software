from collections import deque
from fileinput import close
import math

stack = deque()
file = open("logs.txt", "w")

print("Bienvenido!")

while(True):
    if(len(stack) >= 2):
        print("-------------------------------------\n")
        print("\nTamano de la pila: " + str(len(stack)) + " elementos \n")
        print("Seleccione una opcion (del 0 al 4) \n")
        print("\n(1) Ingresar un texto")
        print("\n(2) Ver texto mas largo o mas corto")
        print("\n(3) Imprimir un texto")
        print("\n(4) Comparar tamanos")
        print("\n(0) Cerrar programa")
        print("-------------------------------------\n")
        try:
            option = int(input("Ingrese opcion: \n"))
        except:
            option = 5
            print("Ingrese una opcion valida\n")
        if(option == 1):
            print("-------------------------------------\n")
            print("Ingrese un texto: \n")
            string = input()
            stack.append(string)
            print("Entrada " + string + " obtenida y agregada al stack\n")
            print("-------------------------------------\n")
        elif(option == 2):
            print("-------------------------------------\n")
            print("Seleccione una opcion: \n")
            print("(1) Ver texto mas largo\n")
            print("(2) Ver texto mas corto\n")
            option2 = int(input("Ingrese opcion: \n"))
            print("-------------------------------------\n")
            if(option2 == 1):
                max = 0
                maxText = ""
                for item in stack:
                    if(len(item) > max):
                        max = len(item)
                        maxText = item
                print("El texto mas largo es: " + maxText + "\n")
            elif(option2 == 2):
                min = math.inf
                minText = ""
                for item in stack:
                    if(len(item) < min):
                        min = len(item)
                        minText = item
                print("El texto mas corto es: " + minText + "\n")
            else:
                print("Por favor ingrese una opcion valida\n")
        elif(option == 3):
            print("-------------------------------------\n")
            print("Los elementos en la pila son los siguientes: " + str(stack) + "\n")
            print("Seleccione la posicion de la cual quiere obtener el elemento (empezando por el 1)\n")
            option3 = int(input("Ingrese opcion \n"))
            try:
                print(stack[option3 - 1])
            except:
                print("Error en el input, por favor seleccione una posicion valida\n")
        elif(option == 4):
            string1 = ""
            string2 = ""
            print("Los elementos en la pila son los siguientes: " + str(stack) + "\n")
            try:
                print("Seleccione la posicion del primer elemento a comparar (empezando por el 1): \n")
                option41 = int(input("Ingrese opcion: \n"))
                string1 = stack[option41 - 1]
                print("Elemento seleccionado: " + string1 + "\n")
            except:
                print("Error en el input, por favor seleccione una posicion valida\n")
            try:
                print("Seleccione la posicion del segundo elemento a comparar (empezando por el 1): \n")
                option42 = int(input("Ingrese opcion: \n"))
                string2 = stack[option42 - 1]
                print("Elemento seleccionado: " + string2 + "\n")
            except:
                print("Error en el input, por favor seleccione una posicion valida\n")
            if(len(string1) == len(string2)):
                print("Los elementos son del mismo tamano\n")
            elif(len(string1) < len(string2)):
                print("El elemento " + string1 + " es mas corto que " + string2 + "\n")
            else:
                print("El elemento " + string1 + " es mas largo que " + string2 + "\n")
        elif(option == 0):
            print("Adios!\n")
            break
        else:
            print("Por favor ingrese una opcion valida\n")
    else:
        print("-------------------------------------\n")
        print("Ingrese un texto: \n")
        string = input()
        stack.append(string)
        print("-------------------------------------\n")
        print("Entrada " + string + " obtenida y agregada al stack\n")
file.close()