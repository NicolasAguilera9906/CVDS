# Laboratorio5-CVDS
# Nicolas Aguilera Contreras
# Carlos Andres Ramirez

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/47d6c06c8d5b4885b9cc3a9a9eda0fdb)](https://app.codacy.com/manual/CAndresRa/Laboratorio5-CVDS?utm_source=github.com&utm_medium=referral&utm_content=CAndresRa/Laboratorio5-CVDS&utm_campaign=Badge_Grade_Dashboard)
[![CircleCI](https://circleci.com/gh/CAndresRa/Laboratorio5-CVDS.svg?style=svg)](https://circleci.com/gh/CAndresRa/Laboratorio5-CVDS)

# PARTE UNO
3. Antes de que el servidor cierre la conexión por falta de comunicación:
Revise la página 36 del RFC del protocolo HTTP, sobre cómo realizar una petición GET. Con esto, solicite al servidor el recurso ‘sssss/abc.html’, usando la versión 1.0 de HTTP.
Asegúrese de presionar ENTER dos veces después de ingresar el comando.
Revise el resultado obtenido. ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.

**Error 301: Se refiere a un error de tipo REDIRECCIONAMIENTO utilizando la version HTTP 1.0** 
**Resultado**

~~~
HTTP/1.1 301 Moved Permanently 
Date: Thu, 20 Feb 2020 11:47:19 GMT
Server: Apache/2.2.22 (Fedora)
Location: https://www.escuelaing.edu.co/sssss/abc.html
Content-Length: 339
Connection: close
Content-Type: text/html; charset=iso-8859-1
~~~

~~~
<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>301 Moved Permanently</title>
</head><body>
<h1>Moved Permanently</h1>
<p>The document has moved <a href="https://www.escuelaing.edu.co/sssss/abc.html">here</a>.</p>
<hr>
<address>Apache/2.2.22 (Fedora) Server at www.escuelaing.edu.co Port 80</address>
</body></html>
Connection closed by foreign host.
~~~

¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?
**Error 400: Se refiere a un error de tipo cliente utilizando la version HTTP 1.1** 
**Resultado**

~~~
HTTP/1.1 400 Bad Request
Date: Thu, 20 Feb 2020 11:39:23 GMT
Server: Apache/2.2.22 (Fedora)
Content-Length: 313
Connection: close
Content-Type: text/html; charset=iso-8859-1

<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>400 Bad Request</title>
</head><body>
<h1>Bad Request</h1>
<p>Your browser sent a request that this server could not understand.<br />
</p>
<hr>
<address>Apache/2.2.22 (Fedora) Server at www.escuelaing.edu.co Port 80</address>
</body></html>
~~~


4. Realice una nueva conexión con telnet, esta vez a:
Host: www.httpbin.org
Puerto: 80
Versión HTTP: 1.1
Ahora, solicite (GET) el recurso /html. ¿Qué se obtiene como resultado?

**RESULTADO**

~~~
HTTP/1.1 400 Bad Request
Server: awselb/2.0
Date: Thu, 20 Feb 2020 12:35:43 GMT
Content-Type: text/html
Content-Length: 138
Connection: close`

`<html>
<head><title>400 Bad Request</title></head>
<body bgcolor="white">
<center><h1>400 Bad Request</h1></center>
</body>
</html>
~~~

5. Seleccione el contenido HTML de la respuesta y copielo al cortapapeles CTRL-SHIFT-C. Ejecute el comando wc (word count) para contar palabras con la opción -c para contar el número de caracteres:
**Resultado de la cantidad de caracteres **

➜  ~ wc -c resultado.txt      
3742 resultado.txt

![Texto alternativo](https://github.com/CAndresRa/CVDS/blob/master/Laboratorio5-CVDS/imagenes/0.png)

6. En la practica no se utiliza telnet para hacer peticiones a sitios web sino el comando curl con ayuda de la linea de comandos:

**UTILIZANDO curl -v www.httpbin.org**

~~~
* Rebuilt URL to: www.httpbin.org/
*   Trying 52.202.2.199...
* TCP_NODELAY set
* Connected to www.httpbin.org (52.202.2.199) port 80 (#0)
> GET / HTTP/1.1
> Host: www.httpbin.org
> User-Agent: curl/7.58.0
> Accept: */*
~~~

**UTILIZANDO curl -i www.httpbin.org**

~~~
HTTP/1.1 200 OK
Date: Thu, 20 Feb 2020 12:58:46 GMT
Content-Type: text/html; charset=utf-8
Content-Length: 9593
Connection: keep-alive
Server: gunicorn/19.9.0
Access-Control-Allow-Origin: *
Access-Control-Allow-Credentials: true
~~~

# PARTE DOS

![Texto alternativo](https://github.com/CAndresRa/CVDS/blob/master/Laboratorio5-CVDS/imagenes/1.jpeg)
![Texto alternativo](https://github.com/CAndresRa/CVDS/blob/master/Laboratorio5-CVDS/imagenes/2.jpeg)
![Texto alternativo](https://github.com/CAndresRa/CVDS/blob/master/Laboratorio5-CVDS/imagenes/3.jpeg)

# PARTE TRES y CUATRO 

### Usando GET 

![Texto alternativo](https://github.com/CAndresRa/CVDS/blob/master/Laboratorio5-CVDS/imagenes/4.jpeg)

### Usando POST

![Texto alternativo](https://github.com/CAndresRa/CVDS/blob/master/Laboratorio5-CVDS/imagenes/5.jpeg)

* La diferencia principal se encuentra en las url de cada solicitud 

10. Si todo funcionó correctamente, realice las siguientes pruebas:
a. Abra la aplicación en un explorador. Realice algunas pruebas con el juego e intente adivinar el número.

b. Abra la aplicación en dos computadores diferentes. Si no dispone de uno, hágalo en dos navegadores diferentes (por ejemplo Chrome y Firefox; incluso se puede en un único navegador usando una ventana normal y una ventana de incógnito / privada). Haga cinco intentos en uno, y luego un intento en el otro. ¿Qué valor tiene cada uno?

5 intentos en CHROME

![Texto alternativo](https://github.com/CAndresRa/CVDS/blob/master/Laboratorio5-CVDS/imagenes/6.png)

1 INTENTO EN FIREFOX

![Texto alternativo](https://github.com/CAndresRa/CVDS/blob/master/Laboratorio5-CVDS/imagenes/7.png)


c. Aborte el proceso de Tomcat-runner haciendo Ctrl+C en la consola, y modifique el código del backing-bean de manera que use la anotación @SessionScoped en lugar de @ApplicationScoped. Reinicie la aplicación y repita el ejercicio anterior.
¿Coinciden los valores del premio?.
No. En CHROME es de 500000 y en FIREFOX es de 900000
Dado la anterior, ¿Cuál es la diferencia entre los backing-beans de sesión y los de aplicación?
Los backing-beans de session crean una nueva instancia del bean por cada dispositivo que se conecte al servicio. Los de aplicación crean solo un bean independientemente de los dispositivos que se conecten al servicio


5 INTENTOS EN CHROME

![Texto alternativo](https://github.com/CAndresRa/CVDS/blob/master/Laboratorio5-CVDS/imagenes/8.png)

5 INTENTOS EN FIREFOX


![Texto alternativo](https://github.com/CAndresRa/CVDS/blob/master/Laboratorio5-CVDS/imagenes/9.png)

d. Por medio de las herramientas de desarrollador del explorador (Usando la tecla "F12" en la mayoría de exploradores):
  •	Ubique el código HTML generado por el servidor.
  •	Busque el elemento oculto, que contiene el número generado aleatoriamente.
  •	En la sección de estilos, deshabilite el estilo que oculta el elemento para que sea visible.
  •	Observe el cambio en la página, cada vez que se realiza un cambio en el estilo.
  •	Revise qué otros estilos se pueden agregar a los diferentes elementos y qué efecto tienen en la visualización de la página.
  •	Actualice la página. Los cambios de estilos realizados desaparecen, pues se realizaron únicamente en la visualización, la respuesta del servidor sigue siendo la misma, ya que el contenido de los archivos allí almacenados no se ha modificado.
  •	Revise qué otros cambios se pueden realizar y qué otra información se puede obtener de las herramientas de desarrollador.

![Texto alternativo](https://github.com/CAndresRa/CVDS/blob/master/Laboratorio5-CVDS/imagenes/10.png)
![Texto alternativo](https://github.com/CAndresRa/CVDS/blob/master/Laboratorio5-CVDS/imagenes/11.png)


11. Para facilitar los intentos del usuario, se agregará una lista de los últimos intentos fallidos realizados:
a.	Agregue en el Backing-Bean, una propiedad que contenga una lista de intentados realizados.
b.	Agregue cada intento a la lista, cuando se ejecute el método guess.
c.	Cuando se reinicie el juego, limpie el contenido de la lista.
d.	Busque cómo agregar una tabla a la página, cuyo contenido sea los últimos intentos realizados.


![Texto alternativo](https://github.com/CAndresRa/CVDS/blob/master/Laboratorio5-CVDS/imagenes/12.png)

