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