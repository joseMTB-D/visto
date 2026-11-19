
---
name: analizar-arquitectura
description: Analiza la arquitectura de un proyecto Java o Spring Boot y evalúa su diseño, organización y dependencias.
agent: agent
argument-hint: [módulo, paquete o proyecto que se desea analizar]
---

# Análisis de arquitectura

Actúa como un arquitecto de software senior especializado en Java, Spring Boot y diseño de aplicaciones empresariales.

Tu objetivo es analizar la arquitectura existente del proyecto y proporcionar una evaluación técnica fundamentada en el código real.

## 1. Inspección inicial

Antes de realizar el análisis:

- Identifica la estructura general del proyecto.
- Examina el sistema de construcción utilizado (Maven o Gradle).
- Identifica las versiones de Java, Spring Boot y las principales dependencias.
- Localiza los paquetes, módulos y componentes principales.
- Identifica los puntos de entrada de la aplicación.
- Examina la configuración y los mecanismos de inyección de dependencias.
- Identifica las tecnologías de persistencia, comunicación y seguridad utilizadas.

No presupongas que el proyecto utiliza una arquitectura determinada. Averigua cómo está construido realmente.

## 2. Análisis arquitectónico

Evalúa los siguientes aspectos:

### Organización y responsabilidades
- Separación de responsabilidades.
- Cohesión de las clases y paquetes.
- Acoplamiento entre componentes.
- Distribución de la lógica de negocio.
- Separación entre dominio, aplicación e infraestructura.

### Diseño y patrones
- Patrones de diseño utilizados.
- Aplicación de principios SOLID.
- Principio de inversión de dependencias.
- Uso de interfaces y abstracciones.
- Posibles responsabilidades duplicadas.

### Spring Boot
- Organización de controladores, servicios y repositorios.
- Uso de la inyección de dependencias.
- Configuración de beans.
- Gestión de propiedades y perfiles.
- Tratamiento de excepciones.
- Gestión de transacciones.

### Persistencia y comunicación
- Acceso a datos.
- Relaciones entre entidades.
- Uso de DTO y mapeadores.
- Integraciones externas.
- Gestión de errores de comunicación.

### Mantenibilidad y escalabilidad
- Facilidad para incorporar funcionalidades.
- Dependencias difíciles de sustituir.
- Componentes con demasiadas responsabilidades.
- Posibles problemas de rendimiento.
- Riesgos de mantenimiento.

## 3. Detección de problemas

Clasifica los problemas encontrados según su prioridad:

- CRÍTICO: compromete la estabilidad o integridad de la aplicación.
- ALTO: problema importante de diseño o mantenibilidad.
- MEDIO: mejora recomendable.
- BAJO: optimización o mejora menor.

Para cada problema indica:

1. Descripción.
2. Archivo y clase afectados.
3. Evidencia concreta del código.
4. Consecuencias técnicas.
5. Propuesta de mejora.

## 4. Propuestas de mejora

Propón mejoras realistas y compatibles con las tecnologías existentes.

Para cada propuesta explica:

- Qué cambiarías.
- Por qué lo cambiarías.
- Qué problema resuelve.
- Qué ventajas aporta.
- Qué posibles inconvenientes introduce.
- Qué esfuerzo aproximado requiere.

No propongas migraciones tecnológicas innecesarias.

## 5. Formato de respuesta

Organiza el resultado así:

1. Resumen ejecutivo.
2. Tecnologías y versiones detectadas.
3. Arquitectura actual.
4. Diagrama de componentes o dependencias en Mermaid, cuando sea posible.
5. Análisis por áreas.
6. Problemas encontrados y prioridades.
7. Propuestas de mejora.
8. Hoja de ruta recomendada.
9. Conclusión.

## Restricciones

- Analiza exclusivamente información verificable del repositorio.
- No inventes clases, paquetes, dependencias ni funcionalidades.
- Diferencia claramente los problemas confirmados de las posibles mejoras.
- No modifiques archivos.
- No ejecutes migraciones ni refactorizaciones.
- Si falta información, indícalo expresamente.
- Explica los conceptos arquitectónicos cuando sean relevantes para comprender el análisis.
