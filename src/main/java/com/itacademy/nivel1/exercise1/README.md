# Tests unitarios con JUnit 5

## Descripción

Ejercicio práctico de testing automatizado en Java mediante JUnit 5. Se desarrolla una clase `BookManager` encargada de gestionar una colección de libros y se implementan tests unitarios para verificar el correcto funcionamiento de sus métodos.

El proyecto utiliza Maven para gestionar las dependencias e integrar JUnit 5.

## 📌 Instrucciones del ejercicio

Desarrollar una clase Java que gestione una colección de libros de biblioteca y permita realizar diferentes operaciones sobre ella.

Implementar tests unitarios con JUnit 5 para comprobar el comportamiento de la clase y verificar que cumple los requisitos establecidos en el enunciado.

### Objetivos del ejercicio

- Familiarizarse con el testing automatizado.
- Aprender a utilizar JUnit 5 para desarrollar tests unitarios.
- Verificar el comportamiento de los métodos de una clase.
- Comprobar que se cumplen las condiciones establecidas mediante aserciones.
- Identificar y comprobar situaciones en las que deben producirse excepciones.

## ✨ Características

### Book

Clase que representa un libro y contiene:

- `title`: título del libro.
- `author`: autor del libro.
- Constructor para inicializar sus atributos.
- Getters y setters para acceder y modificar sus propiedades.
- `toString()`: representación textual del libro.

### BookManager

Clase encargada de gestionar la colección de libros mediante una lista interna (`ArrayList`).

- **Constructor:** inicializa la colección y añade los libros recibidos, realizando una copia de cada objeto.
- **addBooks():** añade una colección de libros.
- **getBooks():** devuelve una copia no modificable de la lista.
- **getTitleByIndex():** obtiene el título de un libro a partir de su posición.
- **addBook():** inserta un libro en una posición específica.
- **deleteBookByTitle():** elimina los libros que coinciden con el título indicado.
- **getSortedBooksAsc():** devuelve una nueva lista ordenada alfabéticamente por título, sin modificar la colección original.
- **validateTitle():** valida que los títulos no sean nulos, vacíos o duplicados. La comparación de títulos no distingue entre mayúsculas y minúsculas.

Las operaciones de inserción y el constructor utilizan esta validación para evitar títulos duplicados y no válidos.

## 📚 Investigación: Testing unitario con JUnit 5

### ¿Qué son los tests unitarios?

Los tests unitarios son pruebas automatizadas que permiten comprobar el comportamiento de pequeñas unidades de código de forma independiente, normalmente métodos o clases.

Su objetivo es verificar que el código funciona según lo esperado y detectar errores cuando se producen cambios durante el desarrollo.

### JUnit 5

JUnit 5 es un framework de testing para Java que permite escribir y ejecutar pruebas automatizadas.

En este ejercicio se utiliza la anotación `@Test` para identificar los métodos que contienen pruebas unitarias.

Para integrar JUnit 5 en el proyecto se ha añadido su dependencia en el archivo `pom.xml`, utilizando Maven y el ámbito `test`, ya que únicamente es necesaria durante la ejecución de las pruebas.

### Assertions

Las aserciones permiten comprobar si el resultado obtenido coincide con el esperado. Si una aserción falla, el test se considera fallido.

En este ejercicio se utilizan:

- **assertNotNull():** comprueba que un objeto no sea nulo.
- **assertEquals():** verifica que dos valores sean iguales.
- **assertThrows():** comprueba que una operación lance la excepción esperada.

En particular, `assertThrows()` permite verificar que los métodos rechazan operaciones no válidas, como intentar introducir títulos duplicados.

## 🧪 Pruebas realizadas

Se han implementado 10 tests unitarios en la clase `BookManagerTest` para comprobar los diferentes comportamientos de `BookManager`.

| Test | Comportamiento comprobado |
|---|---|
| `constructor_shouldInitializeCollection()` | La colección se inicializa correctamente aunque el constructor reciba una lista nula. |
| `addBooks_shouldAddAllBooksToCollection()` | Se añaden todos los libros de una colección y se actualiza correctamente el tamaño. |
| `addBook_shouldBeInTheExpectedPosition()` | El libro añadido se encuentra en la posición esperada. |
| `getTitleByIndex_shouldReturnTitleAtSpecifiedPosition()` | Se obtiene el título correcto a partir de una posición. |
| `addBook_shouldInsertBookAtSpecifiedPosition()` | Se inserta un libro en la posición indicada y se comprueba el tamaño resultante. |
| `constructor_shouldThrowExceptionWithDuplicateTitles()` | El constructor rechaza una colección con títulos duplicados. |
| `addBook_shouldThrowExceptionWhenTitleAlreadyExists()` | Se impide añadir un libro cuyo título ya existe. |
| `addBooks_shouldThrowExceptionWhenTitleAlreadyExists()` | Se impide añadir una colección que contiene un título duplicado. |
| `deleteBookByTitle_shouldReduceSizeCollection()` | La eliminación de un libro reduce el tamaño de la colección. |
| `getSortedBooksAsc_returnsBooksAlphabeticallyWithoutModifyingOriginal()` | La lista devuelta está ordenada alfabéticamente sin modificar el orden de la colección original. |

## ▶️ Ejecución del proyecto y tests

### Ejecutar el proyecto

Este ejercicio está centrado en el testing unitario y no requiere ejecutar una aplicación de forma independiente. La funcionalidad se comprueba mediante los tests de JUnit 5.

### Ejecutar los tests

Los tests pueden ejecutarse de las siguientes maneras:

- **Desde IntelliJ IDEA:** abrir la clase `BookManagerTest` y pulsar el icono verde de ejecución situado junto a la clase para ejecutar todos los tests, o junto a cada método para ejecutar uno individualmente.
- **Desde Maven:** abrir la terminal en la carpeta raíz del proyecto y ejecutar:

```bash
mvn test
```

Este comando compila el proyecto, ejecuta los tests y muestra los resultados de las pruebas.

Los resultados también pueden consultarse en IntelliJ IDEA, donde se indica el número de tests ejecutados, los que han finalizado correctamente y los que han fallado.

## 📝 Conclusión

Este ejercicio ha permitido dar los primeros pasos en el testing automatizado con JUnit 5 y comprender la importancia de verificar el comportamiento del código mediante pruebas unitarias.

Se han practicado las aserciones básicas, la comprobación de excepciones y la validación de diferentes operaciones sobre una colección de objetos.

El uso de tests permite detectar errores de forma temprana y aporta mayor seguridad a la hora de modificar y ampliar el código.