
---
name: analizar-clase
description: Analiza detalladamente una clase Java, sus responsabilidades, dependencias, métodos y comportamiento.
agent: agent
argument-hint: [nombre de clase o ruta del archivo]
---

# Análisis de clase Java

Actúa como un desarrollador Java senior especializado en análisis de código y diseño orientado a objetos.

Analiza la clase indicada utilizando el código real del proyecto y explica detalladamente cómo funciona.

## 1. Contexto de la clase

Identifica:

- Nombre completo de la clase.
- Paquete al que pertenece.
- Propósito principal.
- Responsabilidad dentro de la aplicación.
- Interfaces que implementa.
- Clases de las que hereda.
- Anotaciones utilizadas.
- Dependencias inyectadas.
- Componentes del proyecto con los que se relaciona.

## 2. Análisis de atributos

Para cada atributo relevante explica:

- Nombre y tipo.
- Finalidad.
- Modificadores de acceso.
- Si es estático o de instancia.
- Cómo se inicializa.
- Cómo se utiliza.
- Si existen posibles problemas de encapsulación o mutabilidad.

## 3. Análisis de métodos

Examina todos los métodos relevantes.

Para cada uno indica:

- Nombre y propósito.
- Parámetros recibidos.
- Tipo de retorno.
- Responsabilidad.
- Dependencias utilizadas.
- Lógica interna.
- Excepciones que puede lanzar.
- Efectos secundarios.
- Métodos de otras clases que invoca.

Cuando sea necesario, explica la ejecución paso a paso.

## 4. Análisis de anotaciones

Si utiliza Spring o cualquier otro framework, explica las anotaciones presentes.

Presta especial atención a:

- @Component
- @Service
- @Repository
- @Controller
- @RestController
- @Autowired
- @Qualifier
- @Transactional
- @Value
- @Configuration
- @Bean
- Anotaciones de Lombok.
- Anotaciones de persistencia JPA.

No atribuyas comportamientos a una anotación sin comprobar su significado y contexto.

## 5. Dependencias y relaciones

Analiza:

- Qué clases utiliza.
- Qué clases dependen de ella.
- Cómo se comunica con otros componentes.
- Si existen dependencias innecesarias.
- Si presenta un acoplamiento elevado.
- Si cumple con el principio de inversión de dependencias.

## 6. Calidad del código

Evalúa:

- Principios SOLID.
- Cohesión.
- Acoplamiento.
- Legibilidad.
- Complejidad.
- Duplicidad de código.
- Gestión de excepciones.
- Posibles problemas de concurrencia.
- Facilidad de mantenimiento y testing.

## 7. Propuestas de mejora

Identifica posibles refactorizaciones.

Para cada una indica:

1. Problema detectado.
2. Motivo por el que es un problema.
3. Solución propuesta.
4. Ejemplo de código antes y después cuando aporte valor.
5. Beneficio esperado.

No modifiques la clase.

## 8. Formato de respuesta

Organiza el análisis en:

1. Resumen de la clase.
2. Responsabilidad dentro del proyecto.
3. Atributos.
4. Métodos.
5. Anotaciones.
6. Dependencias.
7. Flujo de ejecución.
8. Calidad del código.
9. Problemas detectados.
10. Mejoras recomendadas.

## Restricciones

- No inventes métodos ni dependencias.
- Utiliza las implementaciones reales para explicar el comportamiento.
- Consulta otras clases cuando sea necesario para comprender una llamada.
- Indica los archivos y métodos que respaldan tus conclusiones.
- Diferencia los problemas reales de las recomendaciones opcionales.
- No modifiques archivos.
- Utiliza explicaciones didácticas y ejemplos cuando ayuden a comprender el código.
