# Proyecto 1 Pruebas de Software

## Nombre
Jean-Franco Zárate
## Descripción
El proyecto consiste en programar una pila que fuera capaz de recibir entradas de texto y poder operar con ellas, como por ejemplo comparar tamaños entre ellos, imprimir textos a elección y ver cuál es el texto más largo o más corto.
Todas las acciones deben quedar registradas en un archivo log para lograr persistencia, además de manejar las excepciones.
## Instalación
Para instalar el programa basta con descargar los archivos encontrados en esta carpeta y usar un IDE de Java para lograr escribir y ejecutar el programa. Para la construcción de este programa se utilizó el IDE Eclipse (versión Neon.3 Release 4.6.3 listada más abajo). Para usar con Eclipse, designar como workspace la carpeta Proyecto1.
Para el uso de logs, descargar la versión 2.18.0 y agregar los archivos log4j-api-2.18.0.jar y log4j-core-2.18.0.jar al classpath del proyecto (En Eclipse, propiedades del proyecto -> Java Build Path -> pestaña libraries y la opción Add External JAR) (link descarga: https://logging.apache.org/log4j/2.x/download.html)
## Cómo usar
Para usar este programa se debe ejecutar y navegar por el pequeño menú a través de las opciones. Primero se empieza ingresando dos textos (la cantidad mínima para empezar a operar con ellos) y luego aparecerán las opciones para navegar y ejecutar acciones. Un ejemplo de uso es: El programa pedirá dos inputs, para este caso será "long" y "short". Si se escoge la opción de comparación de textos (opción 4), se deberán escoger los textos a comparar en una lista que se mostrará por pantalla. Si se escoge "long" y luego "short", el programa arroajará como resultado que el texto "long" es más corto que "short".
## Cómo contribuir
Para ayudar a la contribución de este programa, se agradecería que se ejecutara este programa con distintos casos de prueba para poder detectar posibles fallos que no fueron detectados en la construcción y testing temprano de este software. Además se aceptan contribuciones que ayuden al mejoramiento del proyecto, como optimizar código, proponer mejores opciones, etc.
## Licencia
* Eclipse IDE for Java Developers versión Neon.3 Release (4.6.3)
* Apache Log4j versión 2.18.0
* Java 8 (JDK versión 1.8)
