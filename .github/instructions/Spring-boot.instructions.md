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