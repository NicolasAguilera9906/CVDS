# Laboratorio2-CVDS
Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn.

* **Compila la aplicacion de java en torno a las dependencias declaradas en el POM**\

Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass". Tip: https://www.mojohaus.org/exec-maven-plugin/usage.html

* **mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App"**
* **Se obtiene como respuesta hello world!**



Realice el cambio en la clase App.java para crear un saludo personalizado, basado en los parámetros de entrada a la aplicación. Utilizar la primera posición del parámetro que llega al método "main" para realizar el saludo personalizado, en caso que no sea posible, se debe mantener el saludo como se encuentra actualmente:
Buscar cómo enviar parámetros al plugin "exec".
* Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: Hello World!
* Ejecutar la clase desde línea de comandos enviando su nombre como parámetro y verificar la salida. Ej: Hello Pepito!
* Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?
**Sigue imprimiendo hello world!**
* Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido.
* Ejecutar nuevamente y verificar la salida en consola. Ej: Hello Pepito Perez!
**Al realizar los cambios correspondientes para que el archivo leyera la entrada e imprimiera los elementos en pantalla obtenemos que al entrar los parametros los imprime**


Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:

* Sin parámetros
* Parámetro: qwerty
* Parámetro: pentagon
* Parámetro Hexagon

¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?\

* **El codigo responde bien a todas las entradas, ya que tambien contempla los input que no se denominan como figuras regulares o errores de sintaxis, el resto de los casos generan las respuestas esperadas**


Investigue para qué sirve "gitignore" y cómo se usa. Para futuras entregas, debe estar configurado.\

* **Git ignore es un archivo.gitignore que permite escribir las extenciones de los archivos que no deseo en el repositorio, por ejemplo los .class de mi proyecto**
