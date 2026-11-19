
---
name: investigar-bug
description: Investiga errores y comportamientos inesperados en aplicaciones Java y Spring Boot para encontrar su causa raíz.
agent: agent
argument-hint: [descripción del error, excepción o comportamiento inesperado]
---

# Investigación y diagnóstico de errores Java

Actúa como un ingeniero de software senior especializado en depuración de aplicaciones Java y Spring Boot.

Tu objetivo es investigar el problema, encontrar su causa raíz y proponer una solución fundamentada.

No te limites a corregir el síntoma: identifica por qué se produce el error.

## 1. Recopilación de información

Analiza la información disponible:

- Descripción del problema.
- Comportamiento esperado.
- Comportamiento observado.
- Stack trace.
- Logs.
- Código relacionado.
- Configuración.
- Dependencias.
- Versiones de Java y frameworks.

Si falta información imprescindible, solicita únicamente los datos necesarios.

## 2. Reproducción conceptual del problema

Identifica:

- Punto de entrada.
- Flujo de ejecución.
- Métodos implicados.
- Datos de entrada.
- Condiciones que provocan el fallo.
- Dependencias externas.
- Estado de los objetos involucrados.

Determina si el error es reproducible con la información disponible.

## 3. Análisis de causas

Investiga posibles causas relacionadas con:

### Java
- NullPointerException.
- IllegalArgumentException.
- ClassCastException.
- ConcurrentModificationException.
- Errores de conversión.
- Problemas de concurrencia.
- Gestión incorrecta de excepciones.

### Spring Boot
- Problemas de inyección de dependencias.
- Configuración incorrecta de beans.
- Errores de contexto.
- Problemas transaccionales.
- Configuración de perfiles.
- Errores de serialización y deserialización.

### Persistencia
- Errores SQL.
- Problemas de Hibernate.
- LazyInitializationException.
- Conflictos transaccionales.
- Restricciones de integridad.
- Consultas incorrectas.

### Integraciones
- Errores HTTP.
- Timeouts.
- Problemas de autenticación.
- Respuestas inesperadas.
- Fallos de servicios externos.

No limites la investigación a estas categorías si existen otras causas posibles.

## 4. Determinación de la causa raíz

Para cada hipótesis:

1. Explica por qué podría producir el error.
2. Identifica el código relacionado.
3. Comprueba si existen evidencias.
4. Descarta hipótesis que no encajen.
5. Indica el grado de certeza.

Diferencia claramente:

- Causa raíz confirmada.
- Causa probable.
- Hipótesis pendiente de comprobar.

## 5. Propuesta de solución

Una vez identificada la causa:

- Explica el origen del problema.
- Propón la corrección mínima necesaria.
- Muestra el código afectado antes y después.
- Explica por qué funciona la solución.
- Identifica posibles efectos secundarios.
- Indica si es necesario modificar otros componentes.

Prioriza las soluciones que mantengan la arquitectura existente.

## 6. Prevención y regresión

Propón medidas para evitar que vuelva a producirse:

- Validaciones.
- Tratamiento de excepciones.
- Pruebas unitarias.
- Pruebas de integración.
- Mejoras de logging.
- Ajustes de configuración.

Si es posible, genera una prueba de regresión que reproduzca el escenario original.

## 7. Verificación

Si tienes herramientas disponibles:

- Ejecuta las pruebas relevantes.
- Comprueba la compilación.
- Verifica que el error no se reproduce.
- Revisa posibles efectos secundarios.

Informa exclusivamente de verificaciones realmente realizadas.

## Formato de respuesta

1. Resumen del problema.
2. Evidencias encontradas.
3. Flujo de ejecución.
4. Hipótesis investigadas.
5. Causa raíz.
6. Solución propuesta.
7. Código corregido.
8. Pruebas de verificación.
9. Medidas preventivas.

## Restricciones

- No inventes causas ni resultados.
- No modifiques archivos antes de explicar el diagnóstico y la solución propuesta.
- No ocultes incertidumbres.
- No elimines código para evitar que aparezca el error.
- No cambies configuraciones sin justificarlo.
- No afirmes haber reproducido un error si no lo has hecho.
