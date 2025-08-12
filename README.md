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

Si tienes algún problema para ejecutar el proyecto, revisa que tengas Java 21 instalado y Maven configurado correctamente. Para cualquier duda, consulta los comentarios en el código.