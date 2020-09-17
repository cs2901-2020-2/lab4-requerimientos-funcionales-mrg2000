# Lab 04 & 04-B

### Instrucciones
- Individual
- Tiempo 50 minutos

### Objetivos
- Interpretar e implementar Requerimientos NO Funcionales.

### Contexto

La secuenciación de un genoma humano completo (material genético codificado en el ADN) representa uno de los mayores logros científicos del siglo. Los esfuerzos comenzaron hace algunas décadas.


Ahora, estás trabajando en un laboratorio que busca secuenciar el genoma. Una secuencia de ADN está representada por una cadena de caracteres (de ```A```, ```C```, ```T``` y ```G```) como ```GATTACA```. El problema es que los biólogos solo pueden extraer subsecuencias de la secuencia completa. Tu función es combinar estas subsecuencias parciales para recuperar la secuencia original.

Por ejemplo, para las tres subsecuencias ```AGATTA```, ```GATTACA``` y ```TACAGA```. La secuencia ```AGATTACAGA``` es la secuencia más corta que contiene todas las subsecuencias.


### Requerimientos Funcionales
- La aplicación deberá permitir al usuario registrar cada subsecuencia del genoma.
- En cada registro de una subsecuencia la aplicación deberá calcular y mostrar la longitud de la secuencia más corta que contiene todas las subsecuencias.

### Requerimientos No Funcionales
- La longitud máxima de una subsequencia es de 200 caracteres
   - Crear una condición y una excepción para limitar el largo de la cadena.
   - Crear un Test para evaluar esa condición.
- La cantidad máxima de subsecuencias es 160000 (160K).
   - Crear una condición y una excepción para la cantidad de subseqs.
   - Crear Test para evaluar esas condiciones.
- La cantidad máxima de usuarios concurrentes son 50.
   - Crear Test de Stress que pruebe 50 usuarios conectados al mismo tiempo.
- El tiempo máximo de procesar cada subsecuencia es de 100ms.
   - Tiempo de respuesta de los test.