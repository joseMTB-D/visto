---
applyTo: "**/*.java"
---

# Instrucciones de desarrollo Java

Actúa siguiendo buenas prácticas de desarrollo Java.

- Antes de modificar código, analiza la implementación existente y respeta su arquitectura.
- Comprueba la versión de Java utilizada por el proyecto antes de utilizar nuevas funcionalidades del lenguaje.
- Aplica SOLID, DRY, KISS y YAGNI cuando corresponda.
- Prioriza código legible, mantenible, modular y reutilizable.
- Utiliza nombres descriptivos para clases, métodos y variables.
- Evita métodos excesivamente largos y clases con demasiadas responsabilidades.
- Prioriza la inmutabilidad cuando aporte valor.
- Evita valores mágicos y duplicación de lógica.
- Gestiona correctamente las excepciones; no utilices bloques catch vacíos.
- No captures excepciones genéricas sin una justificación.
- Utiliza Optional cuando aporte claridad, evitando abusar de él.
- Evita variables, métodos y clases innecesarios.
- No introduzcas dependencias nuevas sin justificar su necesidad.
- Mantén la compatibilidad con las convenciones y dependencias existentes.
- Añade comentarios únicamente cuando expliquen decisiones o comportamientos no evidentes.
- No modifiques código ajeno al alcance de la tarea.
```

## 2. `.github/instructions/spring-boot.instructions.md`

```markdown
---
applyTo: "**/*Controller.java,**/*Service.java,**/*Configuration.java,**/*Config.java,**/application*.yml,**/application*.yaml,**/application*.properties"
---

# Instrucciones de desarrollo Spring Boot

Analiza la arquitectura y las convenciones existentes antes de implementar cambios.

- Respeta la versión de Spring Boot y Spring Framework del proyecto.
- Mantén una separación clara entre controladores, servicios y repositorios.
- Los controladores deben encargarse principalmente de gestionar las peticiones HTTP.
- La lógica de negocio debe permanecer en la capa de servicio cuando corresponda.
- Evita utilizar inyección de dependencias mediante atributos.
- Prioriza la inyección por constructor.
- Utiliza DTO para separar los contratos de API de las entidades de persistencia cuando corresponda.
- Valida las entradas mediante Jakarta Bean Validation cuando sea adecuado.
- Gestiona los errores mediante mecanismos centralizados cuando el proyecto los utilice.
- Utiliza correctamente los códigos de estado HTTP.
- Evita exponer información interna, trazas o detalles sensibles en las respuestas.
- Mantén una configuración externa mediante application.yml, application.properties o el mecanismo existente.
- No introduzcas configuraciones duplicadas.
- Utiliza perfiles de Spring de forma coherente.
- Evita lógica de negocio dentro de clases de configuración.
- Respeta las convenciones existentes para transacciones y acceso a datos.
- No introduzcas starters ni dependencias innecesarias.
```

## 3. `.github/instructions/testing.instructions.md`

```markdown
---
applyTo: "**/src/test/**/*.java,**/*Test.java,**/*Tests.java"
---

# Instrucciones de pruebas de software

Actúa siguiendo principios de calidad y automatización de pruebas.

- Identifica qué comportamiento debe verificarse antes de escribir pruebas.
- Prioriza pruebas unitarias para lógica de negocio.
- Añade pruebas de integración cuando sea necesario validar la interacción entre componentes.
- Utiliza pruebas de sistema o aceptación cuando el alcance lo justifique.
- Sigue el framework y las convenciones de testing existentes.
- Comprueba las versiones de JUnit, Mockito y demás dependencias antes de utilizarlas.
- Aplica el patrón Arrange, Act, Assert cuando facilite la comprensión.
- Cada prueba debe comprobar un comportamiento concreto.
- Utiliza nombres descriptivos que expliquen el escenario y el resultado esperado.
- Comprueba tanto los casos correctos como los errores y situaciones límite.
- Evita pruebas dependientes del orden de ejecución.
- Evita compartir estado mutable entre pruebas.
- Utiliza mocks únicamente cuando aporten aislamiento y claridad.
- No simules innecesariamente componentes que deban probarse de forma real.
- Comprueba los valores devueltos y los efectos secundarios relevantes.
- No escribas pruebas que simplemente reproduzcan la implementación.
- No modifiques las pruebas existentes para ocultar errores de producción.
- Ejecuta las pruebas afectadas cuando sea posible e informa de los resultados.
```

## 4. `.github/instructions/database.instructions.md`

```markdown
---
applyTo: "**/*.sql,**/*Entity.java,**/*Repository.java"
---

# Instrucciones de bases de datos y persistencia

Analiza el modelo de datos y las convenciones de persistencia existentes antes de realizar cambios.

- Respeta el motor de base de datos utilizado por el proyecto.
- Comprueba el esquema y las relaciones existentes antes de proponer modificaciones.
- Evita consultas innecesariamente complejas o ineficientes.
- Utiliza parámetros en las consultas para evitar SQL Injection.
- Evita concatenar entradas del usuario en sentencias SQL.
- Comprueba los índices y las restricciones de integridad cuando corresponda.
- Evita problemas N+1 en las consultas ORM.
- Define correctamente las relaciones entre entidades.
- Utiliza transacciones cuando una operación requiera atomicidad.
- Evita cargar colecciones completas cuando no sean necesarias.
- Utiliza paginación para consultas que puedan devolver muchos registros.
- Respeta las convenciones de nombres del esquema.
- No elimines columnas, tablas o restricciones sin justificar el impacto.
- Si el proyecto utiliza Flyway, Liquibase u otra herramienta de migraciones, respeta su mecanismo.
- Las migraciones deben ser coherentes, revisables y seguras.
- No asumas que una modificación del modelo Java actualiza automáticamente el esquema de producción.
```

## 5. `.github/instructions/security.instructions.md`

```markdown
---
applyTo: "**/*Security*.java,**/*Auth*.java,**/*Jwt*.java,**/security/**/*.java,**/application*.yml,**/application*.yaml,**/application*.properties"
---

# Instrucciones de seguridad

Prioriza la seguridad de la aplicación durante el análisis y desarrollo.

- Identifica posibles vulnerabilidades antes de modificar componentes sensibles.
- Aplica el principio de mínimo privilegio.
- No almacenes contraseñas en texto plano.
- No incluyas credenciales, tokens, claves privadas ni secretos en el código.
- No expongas información sensible en logs ni respuestas HTTP.
- Protege los endpoints mediante mecanismos de autenticación y autorización adecuados.
- Comprueba los permisos en el servidor; nunca confíes únicamente en el cliente.
- Evita vulnerabilidades de inyección SQL, XSS, CSRF y exposición de información.
- Valida y normaliza las entradas externas cuando corresponda.
- Utiliza algoritmos criptográficos seguros y mecanismos mantenidos.
- No implementes criptografía propia.
- Comprueba las configuraciones de CORS, sesiones y cookies cuando sean relevantes.
- No desactives mecanismos de seguridad para solucionar problemas de funcionamiento.
- Respeta las políticas de seguridad existentes.
- Si detectas una vulnerabilidad, explica su impacto y propone una solución.
- No introduzcas cambios que reduzcan la seguridad sin una justificación explícita.
```

## 6. `.github/instructions/documentation.instructions.md`

```markdown
---
applyTo: "**/README.md,**/docs/**/*.md,**/*.adoc,**/openapi*.yaml,**/openapi*.yml"
---

# Instrucciones de documentación técnica

Genera documentación clara, precisa y mantenible.

- Utiliza castellano salvo que el proyecto establezca otro idioma.
- Comprueba el comportamiento real del código antes de documentarlo.
- No inventes funcionalidades, parámetros, endpoints ni configuraciones.
- Mantén la documentación alineada con la implementación.
- Explica los requisitos previos y las dependencias necesarias.
- Incluye ejemplos prácticos cuando faciliten la comprensión.
- Documenta los endpoints, parámetros, respuestas y errores relevantes.
- Describe las configuraciones necesarias para ejecutar la aplicación.
- Mantén actualizados los ejemplos de uso.
- Evita repetir información que ya esté documentada.
- Utiliza títulos y secciones organizados jerárquicamente.
- Documenta las decisiones técnicas importantes cuando aporten valor.
- No modifiques documentación ajena al alcance de la tarea.
```
