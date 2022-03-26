# Generador de cartas al azar

<p align="center">
<img src="https://www.sofka.com.co/wp-content/uploads/2021/02/sofkau-logo-horizontal.png">
</p>


*Base de datos incorporada desde MongoDB atlas, en donde se encuentran las cartas con sus respectivas imagenes URL*

Solucion implementando Backend(Java-SpringBoot, MongoAtlas) y FrontEnd(ReactJs, Redux, Bootstrap)

<p align="center">
<img src="https://user-images.githubusercontent.com/59320487/160247394-9bff2b1e-8628-45c4-bf8f-939b28ebc3b0.png">
</p>


**Se puede generar consultas aleatorias con parametros distintos sin tener que recargar la pagina**

Seleccione la opcion solonumeros para traer una carta aleatoria de solo numeros, de lo contrario deje esta opcion desmarcada para traer cartas aleatorias

ACTUALIZACIONES: se puede escoger solo cartas con numeros


Primero se debe ejecutar el back end basado en SpringBoot-Mongo, para ello se debe desplazar hacia la carpeta back, y realizar:

    Para servidores Linux, el codigo se ejecuta desde el archivo mvnw
    Para servidores con distrubuciones Windows, el codigo se ejecuta desde el archivo mvnw.cmd desde una consola de comandos (cmd) o ventana PowerShell atravez del comando "./mvnw.cmd spring-boot:run"

seguidamente debe inicar el servidor front ejecutado por React, para ello se debe desplazar hacia la carpeta front, y ejecutar:


- npm install

- npm start



### TEMARIO: 

Para Reactjs (/front)
- React con Redux
- Estructura de Redux y Diseño

Para de Spring Boot (/back)
- CRUD con mongodb
- Reactividad con web flux
- Hacer pruebas del controlador


### PROBLEMA

Crear una ventana en ReactJS que me permite renderizar una lista aleatoria que se le pase por una caja de texto dentro de un formulario, ingresar una lista separadas por coma y hacer submit de esa lista. El dato random se debe consultar a través de una API REST reactiva que esta diseñada con Spring Boot + Webflux. 





