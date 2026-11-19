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