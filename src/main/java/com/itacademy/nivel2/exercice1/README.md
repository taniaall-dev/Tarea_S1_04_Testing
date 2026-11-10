# AssertJ

## Descripción

En este ejercicio nos iniciamos en el uso de **AssertJ**, una biblioteca de testing que permite escribir aserciones más expresivas y legibles que las aserciones tradicionales de JUnit.

A través de siete ejercicios prácticos, trabajamos diferentes tipos de comprobaciones sobre objetos, referencias, arrays, listas, mapas, excepciones y objetos `Optional`.

## 📌 Instrucciones del ejercicio

Crear las clases Java necesarias y sus correspondientes tests para demostrar diferentes funcionalidades de AssertJ.

### Objetivos del ejercicio

- Aprender a utilizar AssertJ para realizar aserciones.
  - Comprobar la igualdad y desigualdad entre objetos.
  - Diferenciar la igualdad de valores de la identidad de referencias.
  - Verificar el contenido y el orden de arrays y colecciones.
  - Comprobar la existencia de elementos y claves.
  - Validar que se producen las excepciones esperadas.
  - Comprobar si un objeto `Optional` está vacío.

## ✨ Características

El ejercicio se organiza en dos clases:

- **AssertJExamples:** contiene los métodos que preparan los datos y los escenarios necesarios para realizar las comprobaciones.
  - **AssertJExamplesTest:** contiene los siete tests unitarios que verifican los resultados mediante aserciones de AssertJ.

### Ejercicio 1. Igualdad y desigualdad

Se utilizan objetos `Integer` para comprobar:

- `isEqualTo()`: verifica que dos objetos tienen el mismo valor.
  - `isNotEqualTo()`: verifica que sus valores son diferentes.

### Ejercicio 2. Identidad de referencias

Se utilizan objetos `String` para comprobar:

- `isSameAs()`: verifica que dos referencias apuntan al mismo objeto.
  - `isNotSameAs()`: verifica que apuntan a objetos diferentes.

### Ejercicio 3. Comparación de arrays

Se crean dos arrays de enteros con los mismos elementos y se utiliza:

- `containsExactly()`: verifica que contienen los mismos elementos y en el mismo orden.

### Ejercicio 4. Comprobación de listas

Se crea una `ArrayList` que contiene objetos de diferentes tipos: `String`, `Integer` y `Double`.

Se utilizan las siguientes aserciones:

- `containsExactly()`: comprueba que los elementos aparecen en el orden esperado.
  - `containsExactlyInAnyOrder()`: comprueba que contiene los mismos elementos, independientemente del orden.
  - `containsOnlyOnce()`: verifica que un elemento aparece una única vez.
  - `doesNotContain()`: comprueba que un elemento no está presente en la lista.

### Ejercicio 5. Comprobación de mapas

Se crea un `HashMap` con nombres de productos y sus respectivos precios.

- `containsKey()`: verifica que el mapa contiene una clave determinada.

### Ejercicio 6. Comprobación de excepciones

Se provoca una `ArrayIndexOutOfBoundsException` al intentar acceder a una posición inexistente de un array.

- `assertThatExceptionOfType()`: permite comprobar que se lanza la excepción esperada al ejecutar el método correspondiente.

### Ejercicio 7. Comprobación de Optional

Se crea un objeto `Optional` vacío.

- `isEmpty()`: verifica que el objeto `Optional` no contiene ningún valor.

## 📚 Investigación: AssertJ

AssertJ permite expresar las comprobaciones de los tests mediante métodos encadenados y una sintaxis cercana al lenguaje natural.

A diferencia de las aserciones tradicionales de JUnit, ofrece una API fluida que facilita la lectura y comprensión de las pruebas.

**Dependencias utilizadas:**

- JUnit 5: framework utilizado para organizar y ejecutar los tests.
  - AssertJ: biblioteca utilizada para realizar las aserciones.

## ▶️ Ejecución del proyecto y tests

### Ejecutar el proyecto

Este ejercicio está centrado en el testing unitario y no requiere ejecutar una aplicación de forma independiente. Las funcionalidades de `AssertJExamples` se comprueban mediante los tests de JUnit 5.

### Ejecutar los tests

Los tests pueden ejecutarse de las siguientes maneras:

- **Desde IntelliJ IDEA:** abrir la clase `AssertJExamplesTest` y pulsar el icono verde de ejecución situado junto a la clase para ejecutar los siete tests, o junto a cada método para ejecutar uno individualmente.
- **Desde Maven:** abrir la terminal en la carpeta raíz del proyecto y ejecutar:

```bash
mvn test
```

Este comando compila el proyecto, ejecuta los tests y muestra los resultados de las pruebas.

Los resultados también pueden consultarse en IntelliJ IDEA, donde se indica el número de tests ejecutados, los que han finalizado correctamente y los que han fallado.

**Resultado obtenido:** 7 tests passed.

## Conclusión

Este ejercicio permite familiarizarse con las principales funcionalidades de AssertJ y comprender cómo utilizar sus aserciones para verificar diferentes comportamientos de una aplicación Java.

Se ha practicado la comprobación de valores, referencias, colecciones, mapas, excepciones y objetos `Optional`, adquiriendo una base para escribir tests unitarios más expresivos y legibles.