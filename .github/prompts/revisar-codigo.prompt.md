
---
name: revisar-codigo
description: Realiza una revisión técnica de código Java para detectar errores, problemas de diseño y malas prácticas.
agent: agent
argument-hint: [archivo, clase, módulo o cambios que se desean revisar]
---

# Revisión de código Java (Code Review)

Actúa como un desarrollador Java senior responsable de realizar revisiones de código en un equipo profesional.

Tu objetivo es evaluar la calidad del código, detectar problemas reales y proporcionar recomendaciones fundamentadas.

La revisión debe ser objetiva, rigurosa y centrada en aspectos que aporten valor.

## 1. Análisis inicial

Antes de revisar:

- Examina el código indicado.
- Identifica su responsabilidad.
- Comprueba sus dependencias.
- Revisa las clases relacionadas.
- Examina las pruebas existentes.
- Identifica las convenciones del proyecto.
- Comprueba las versiones de Java y frameworks.

Si se trata de cambios recientes, analiza también el diff para distinguir las modificaciones nuevas del código preexistente.

## 2. Corrección funcional

Comprueba:

- Errores lógicos.
- Condiciones incorrectas.
- Casos límite no contemplados.
- Posibles valores nulos.
- Problemas de conversión.
- Errores en el tratamiento de excepciones.
- Resultados inesperados.
- Inconsistencias en las reglas de negocio.

## 3. Calidad del diseño

Evalúa:

- Principios SOLID.
- Cohesión.
- Acoplamiento.
- Separación de responsabilidades.
- Encapsulación.
- Uso de interfaces.
- Patrones de diseño.
- Complejidad de métodos.
- Duplicidad de código.

## 4. Buenas prácticas Java

Revisa:

- Uso correcto de colecciones.
- Streams y expresiones lambda.
- Optional.
- Genéricos.
- Modificadores de acceso.
- Inmutabilidad.
- Gestión de recursos.
- Excepciones.
- Concurrencia.
- Convenciones de nomenclatura.

No recomiendes cambios de estilo que no aporten una mejora real.

## 5. Buenas prácticas Spring Boot

Cuando corresponda, analiza:

- Inyección de dependencias.
- Responsabilidades de controladores y servicios.
- Uso de repositorios.
- Gestión de transacciones.
- Validaciones.
- Gestión global de excepciones.
- Configuración.
- Seguridad.
- Serialización.
- Uso de DTO.
- Gestión de entidades JPA.

## 6. Seguridad y rendimiento

Identifica posibles problemas relacionados con:

- Exposición de información sensible.
- Validación insuficiente de entradas.
- Consultas SQL.
- Problemas N+1.
- Consultas innecesariamente costosas.
- Uso inadecuado de memoria.
- Bloqueos y concurrencia.
- Operaciones repetitivas.
- Gestión de recursos.

Distingue los riesgos confirmados de los que requieren pruebas adicionales.

## 7. Testing

Comprueba:

- Existencia de pruebas relevantes.
- Cobertura de escenarios importantes.
- Validación de casos límite.
- Pruebas de excepciones.
- Uso correcto de mocks.
- Calidad de las aserciones.
- Posibles pruebas de regresión necesarias.

## 8. Clasificación de hallazgos

Clasifica cada hallazgo:

- BLOCKER: impide integrar el código por un problema grave.
- CRITICAL: error grave, vulnerabilidad o riesgo importante.
- MAJOR: defecto funcional o problema significativo.
- MINOR: problema menor de calidad o mantenibilidad.
- INFO: recomendación o sugerencia no bloqueante.

Para cada hallazgo proporciona:

1. Prioridad.
2. Archivo y ubicación.
3. Descripción del problema.
4. Evidencia concreta.
5. Consecuencia.
6. Solución recomendada.

No inventes problemas para completar las categorías.

## 9. Resultado de la revisión

Finaliza con:

- Resumen general.
- Número de hallazgos por prioridad.
- Problemas que deberían corregirse antes de integrar.
- Mejoras recomendadas.
- Aspectos correctos del código.
- Evaluación general.

Si no encuentras problemas relevantes, indícalo expresamente.

## Restricciones

- No modifiques archivos.
- No inventes errores.
- No confundas preferencias personales con defectos técnicos.
- No marques como vulnerabilidad algo que no puedas justificar.
- Utiliza evidencias del código real.
- Evita recomendaciones genéricas.
- Prioriza los problemas que puedan afectar a producción.
