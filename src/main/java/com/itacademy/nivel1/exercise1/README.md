## Tests unitarios con JUnit

En este ejercicio nos iniciaremos en el mundo del testing automatizado mediante un ejemplo práctico: la gestión de una colección de libros de biblioteca.

El objetivo principal es aprender a escribir tests unitarios con JUnit 5 para asegurar que nuestra lógica funciona correctamente. Además, integraremos JUnit en el proyecto utilizando un gestor de dependencias como Maven o Gradle .

Este ejercicio te permitirá establecer una base sólida en el desarrollo orientado a la calidad y empezar a aplicar buenas prácticas que son esenciales en entornos profesionales.

### Enunciado

Crea una clase Java que gestione una colección de libros de una biblioteca. 

Esta clase debe ofrecer las siguientes funcionalidades:

- Añadir libros a la colección.
- Recuperar la lista completa de libros (siguiendo el comando de inserción).
- Obtener el título de un libro a partir de su posición.
- Añadir un libro en una posición específica en la colección.
- Eliminar un libro por su título.
- Devolver una copia de la lista ordenada alfabéticamente.

Implementa test unitarios con JUnit 5 para validar el comportamiento de la clase. Asegúrate de cubrir, como mínimo, los siguientes casos:

- La colección no debe ser nula después de instanciar la clase.
- El tamaño de la colección es correcto después de añadir varios libros.
- Los libros se encuentran en la posición esperada una vez añadidos.
- El método para obtener un libro por posición devuelve el título correcto.
- Añadir un libro en una posición concreta modifica correctamente la colección.
- Eliminar un libro por el título reduce el tamaño de la colección.
- La lista ordenada devuelve los libros en orden alfabético (sin modificar la colección original).
- No deben permitirse libros con títulos duplicados.