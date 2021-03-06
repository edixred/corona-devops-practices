
[ **[Volver al Menú Principal](MAIN.md)** ]


La estructura de directorios y paquetes del proyecto va acorde a la razón de ser del archivo y su contenido, el dominio por defecto para los proyectos: package **(com.corona.app.nmda.{proyect})**

***

### Lógica de enrutamiento

- **Beans :**
Clases utilitarias que permiten hacer pequeños cambios o abstraer logica de negocio requerida para la ruta, tal como calculos matematicos o el validar especifico objeto para tomar una desicion, generalmente utiliza el exchange message de camel (header/body).
- **Models :**
Clases que mapean una estructura de datos de una entidad, generalmente se usa para definir las datos de entrada y salida del servicio, tal como un recurso (persona, producto, etc), este modelo irá ligado al modelo canonico.
- **Processors :**
Clases que abstraen logica de procesamiento donde se requeire un esfuerzo más alto a diferencia de un bean, para leer, validar, transformar una petición o una respuesta, generalmente utiliza el exchange message de camel (header/body).
- **Agreggators :**
Clases que permiten agregar o enriquecer el contenido de un objeto o mensaje, generalmente utiliza el exchange message de camel (header/body).
- **Routes :**
Clases que continen la logica del servicio y estan basadas en camel, ademas de hacer uso de los diferentes tipos de clases previamente mencionados


***

### Recursos del proyecto

- **Camel Context** : Archivo XML que define el contexto para el arranque del proyecto en jboss fuse.

- **Plantillas (Velocity)** : Archivos que permiten definir una plantilla re-utilizable.

<img src="../sources/resources.png?raw=true"/>

***

### Recursos fabric8
En el directorio src/main/fabric8, se dejan todos los archivos .properties, esto con el fin de aprovechar las caracteristicas de fabric al momento de desplegar los profile.

- **Archivos de Propiedades (Properties)** : Archivos donde se define una serie parámetros                                    (llave-valor) con el fin de centralizar datos para configuraciones.

<img src="../sources/fabric8.png?raw=true"/>

***

### Lógica y Recursos de Pruebas Unitarias

Para el desarrollo y ejecución de pruebas unitarias, las clases java y recursos requeridos se deben alojar en el directorio src/main/test:


***

### Proyectos dependientes

- **Fuse Parent Pom**: Este proyecto **"com.corona.app.nmda.core.parent-pom"** centraliza las dependencias para la creación de API's Rest, de este modo se mantiene un marco de versiones y dependencias estandarizado y desacoplado.

- **Fuse Utils**: Este proyecto **"com.corona.app.nmda.core.utils"** centraliza logica general de los servicios en forma de processor y beans, para que sean reutilizados y no escritos repetidamente en cada proyecto.

- **Fuse Netty Server**: Este proyecto **"com.corona.app.nmda.netty-http-proxy"** centraliza el server y puerto donde se exponen las APi.

- **Fuse DataSource**: Este proyecto **"com.corona.app.nmda.datasources"** centraliza la conexión al datasource de banner para la consulta hacia la Base de Datos.

***

### Archivos complementarios

Ubicados en la raiz del proyecto

- **POM.xml** : Archivo XML con la definición del proyecto maven, dependencias & plugins.
- **README.md** : Archivo con la documentación especifica del proyecto y de servicios.
- **Dockerfile** : Archivo de texto plano que contiene una serie de instrucciones necesarias para crear una imagen que, posteriormente, se convertirá en una sola aplicación utilizada para un determinado propósito.


***

[ **[Volver al Menú Principal](MAIN.md)** ]