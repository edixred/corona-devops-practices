# Manejo de ambientes
En esta sección se explica el manejo de las ambientes para el desarrollo, pruebas y despliegue de aplicaciones de la Dirección de Servicios de Información y Tecnologías DSIT de la Universidad de Los Andes.

## Ambientes
Los ambientes definidos para el desarrollo de aplicaciones son:


| Ambiente         | Rama Despliegue              | Ramas permitidas
| ---------------  |:----------------------------:|:----------------:|
| Desarrollo       | develop ([crear PR](https://www.youtube.com/watch?v=ZlPHGsojfaI))| develop - feature - issue
| Calidad          | develop (usando versión del PR)| develop
| Pre-productivo   | release (usando versión del PR)| release - hotfix
| Productivo       | master| master

La correspondencia entre ambientes y ramas es la siguiente:

![Branches and environments](../assets/img/branches_envs2.PNG "Ramas y ambientes")



Es responsabilidad del equipo en su totalidad el correcto uso de los ambientes y las ramas asociadas a cada uno.

__________
### 1. Desarrollo
Este ambiente es local para los desarrolladores, donde cada uno puede trabajar de forma independiente, teniendo como punto de encuentro únicamente las ramas. Este ambiente tiene las siguientes reglas:
  * El ambiente debe manejar las mismas versiones de herramientas, lenguajes, frameworks y bases de datos que los ambientes productivos.
__________
### 2. Pruebas
Este ambiente es homólogo a nivel de configuración del ambiente productivo. Está destinado para pruebas únicamente las cuales son realizadas por el tester del proyecto. Las reglas de este ambiente son:
  * El ambiente debe cumplir con una configuración identica al productivo, es decir a nivel de sistema operativo, servidor, permisos, roles, puertos, variables de ambiente, etc.
  * El equipo de pruebas es responsable de mantener este ambiente estable
__________
### 3. Pre-productivo
Este ambiente es homólogo a todo nivel con el ambiente productivo. Está destinado para realizar pruebas de aceptación con el líder funcional y el usuario final. Las reglas de este ambiente son:
  * El ambiente debe cumplir con una configuración identica al productivo, es decir a nivel de sistema operativo, servidor, permisos, roles, puertos, variables de ambiente, etc.
  * El ambiente no debe diferir en cuanto a arquitectura ni componentes frente al ambiente productivo.
  * El equipo de operaciones es responsable de mantener este ambiente estable
__________
### 4. Productivo
Este ambiente es el de producción de la aplicación. Las reglas de este ambiente son:
  * Siempre debe tener una versión estable de la aplicación en ejecución  
  * El equipo de operaciones es responsable de mantener este ambiente estable y son lo únicos que pueden desplegar una versión anterior de la aplicación si se considera necesario

