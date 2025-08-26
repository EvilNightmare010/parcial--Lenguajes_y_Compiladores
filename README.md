# Glow Up Revenge API

Proyecto de Lenguajes y Compiladores - Java 21, Spring Boot 3, Spring Data JPA, H2, Lombok, Spring Security

## Descripción
Glow Up Revenge es una API REST que permite a Line rastrear a sus antiguos acosadores, crear planes de venganza, adjuntar multimedia, reflexionar sobre su estado de ánimo y agrupar acosadores en camarillas.

## Requisitos
- Java 21 o superior
- Maven 3.8+
- IDE recomendado: IntelliJ IDEA, Eclipse, VS Code

## Instalación y ejecución
1. **Clonar el repositorio**
   ```
   git clone <URL_DEL_REPOSITORIO>
   cd glow-up-revenge
   ```
2. **Compilar el proyecto**
   ```
   mvn clean install
   ```
3. **Ejecutar la aplicación**
   ```
   mvn spring-boot:run
   ```
   O ejecuta la clase `ParcialApplication.java` desde tu IDE.

## Acceso a la API
- Todos los endpoints REST requieren autenticación HTTP Basic.
- Usuario: `EIA`
- Contraseña: `EIA`

## Endpoints principales
- `/api/acosadores` - Gestión de acosadores
- `/api/planes-venganza` - Gestión de planes de venganza
- `/api/multimedia` - Gestión de multimedia
- `/api/monitor-estado-animo` - Registro de estado de ánimo
- `/api/cliques` - Gestión de camarillas
- `/api/comerciantes` - Gestión de comerciantes

## Consola H2
- URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- JDBC URL: `jdbc:h2:mem:glowupdb`
- Usuario: `sa`
- Contraseña: *(dejar vacío)*

## Pruebas rápidas
Puedes usar Postman, Insomnia o curl para probar los endpoints. Recuerda ingresar las credenciales cuando lo solicite.

## Estructura del proyecto
- `src/main/java/com/trabajo/parcial/model` - Entidades JPA
- `src/main/java/com/trabajo/parcial/controller` - Controladores REST
- `src/main/java/com/trabajo/parcial/service` - Servicios
- `src/main/java/com/trabajo/parcial/repository` - Repositorios JPA
- `src/main/java/com/trabajo/parcial/config` - Configuración de seguridad
- `src/main/resources/application.properties` - Configuración de la base de datos

## Notas
- El proyecto está protegido con Spring Security.
- La base de datos es en memoria (H2), por lo que los datos se pierden al reiniciar.
- El código está comentado para facilitar la revisión.

---

## Ejecución con Docker

Si tienes Docker instalado, puedes ejecutar la aplicación de forma sencilla y aislada. Sigue estos pasos:

1. **Compila el proyecto con Maven**
   ```sh
   mvn clean package
   ```
   Esto generará el archivo `target/parcial-1.0-SNAPSHOT.jar` necesario para la imagen Docker.

2. **Construye la imagen Docker**
   Ejecuta en la raíz del proyecto:
   ```sh
   docker build -t glowup-revenge .
   ```
   Esto creará una imagen llamada `glowup-revenge` usando el Dockerfile incluido.

3. **Ejecuta el contenedor**
   ```sh
   docker run -p 8080:8080 glowup-revenge
   ```
   Esto levantará la API en el puerto 8080 de tu máquina local.

4. **Accede a la API y la consola H2**
   - API: [http://localhost:8080](http://localhost:8080)
   - Consola H2: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

## Explicación del Dockerfile

El archivo `Dockerfile` incluido realiza los siguientes pasos:
- Usa una imagen base ligera de Java 17 (`openjdk:17-jdk-alpine`).
- Define `/app` como directorio de trabajo.
- Copia el JAR generado por Maven al contenedor.
- Expone el puerto 8080 para la API.
- Ejecuta el JAR usando el comando `java -jar`.

## Solución de problemas comunes
- **El JAR no se encuentra**: Asegúrate de ejecutar `mvn clean package` antes de construir la imagen Docker.
- **El puerto 8080 está ocupado**: Cambia el puerto en el comando `docker run` o en `application.properties`.
- **Variables de entorno**: Si necesitas configurar variables, puedes agregarlas con el parámetro `-e` en `docker run`.

## Notas adicionales
- El archivo `.dockerignore` está configurado para evitar copiar archivos innecesarios al contexto de Docker, optimizando la construcción de la imagen.
- Puedes extender el Dockerfile para agregar dependencias, cambiar el puerto o conectar con bases de datos externas.
- Si usas Docker Compose, puedes crear un archivo `docker-compose.yml` para levantar la API junto a otros servicios (por ejemplo, una base de datos persistente).

---

Para cualquier duda sobre la dockerización, consulta la documentación oficial de Docker: [https://docs.docker.com/](https://docs.docker.com/)

Si tienes algún problema para ejecutar el proyecto, revisa que tengas Java 21 instalado y Maven configurado correctamente. Para cualquier duda, consulta los comentarios en el código.