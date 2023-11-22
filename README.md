## Guía de Uso: Aplicación de Precio de Productos

Esta guía proporciona instrucciones para desarrolladores sobre cómo configurar y ejecutar la aplicación de precio de productos, así como cómo interactuar con la API a través de Swagger.

### 1. Herramientas de Desarrollo

- **IDE:** Utiliza IntelliJ para el desarrollo del proyecto.
- **Versión de Java:** Asegúrate de tener instalada la versión 11 de Java.
- **Gestión de Dependencias:** Maven.

### 2. Arquitectura del Proyecto

El proyecto ha sido desarrollado utilizando una adaptación de la arquitectura hexagonal con capas de aplicación (Application) e infraestructura (Infrastructure) para proyectos pequeños. Esta arquitectura permite una mejor separación de preocupaciones y facilita el mantenimiento y la escalabilidad del código.

- **Capa de Aplicación (Application):** Contiene la lógica de aplicación y las interfaces de usuario. Aquí se manejan las solicitudes del usuario y se comunican con la capa de dominio.

- **Capa de Infraestructura (Infrastructure):** Contiene implementaciones concretas de los detalles técnicos, como la base de datos, servicios externos y API. Esta capa se encarga de interactuar con las tecnologías externas.

### 3. Configuración y Ejecución de la Aplicación

1. **Clonar el Repositorio y Navegar al Directorio del Proyecto:**
- git clone [URL_DEL_REPOSITORIO] && cd nombre-del-repositorio

2. **Compilar y Ejecutar la Aplicación:**
- Asegúrate de que el puerto 8080 esté libre en tu sistema.
- Abre una terminal en el directorio del proyecto y ejecuta los siguientes comandos:
  ```
  mvn clean install
  mvn spring-boot:run
  ```
- La aplicación se ejecutará en: [http://localhost:8090/](http://localhost:8090/)

### 4. Acceder a Swagger

Para probar y documentar la API, se utiliza Swagger, una interfaz interactiva.

- **Accede a Swagger:** [http://localhost:8090/api/swagger-ui/index.html#/](http://localhost:8090/api/swagger-ui/index.html#/)

### 5. Notas
    - Para el factorial todo número no valido para calcularlo retorna -1
    - Para el cliente en el puto 1 se utilizo la base de datos embebida H2 para mockear el cliente por defecto


#### Ejemplo de Petición usando cURL

```bash
curl -X POST "http://localhost:8090/api/factorial/1" -H "accept: */*" -d ""




