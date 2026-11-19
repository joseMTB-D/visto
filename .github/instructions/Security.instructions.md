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