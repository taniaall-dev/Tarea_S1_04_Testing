# Tests parametrizados con JUnit 5

## Descripción

Ejercicio práctico de testing automatizado en Java mediante JUnit 5. Se desarrolla una clase `NationalIdCalculator` encargada de calcular la letra correspondiente a un número de DNI español mediante una operación matemática.

Se implementan tests parametrizados para comprobar diferentes combinaciones de números y letras, así como para verificar el comportamiento del método cuando recibe valores fuera del rango permitido.

## 📌 Instrucciones del ejercicio

Crear una clase Java con un método público que calcule la letra correspondiente a un DNI a partir de su número, sin incluir la letra.

Desarrollar una clase de test con JUnit 5 que utilice tests parametrizados para validar el resultado del cálculo con un mínimo de 10 números de DNI diferentes y sus letras correspondientes.

También se deben comprobar los valores inválidos, como números negativos o superiores al límite permitido, verificando que el método gestione estas situaciones mediante el lanzamiento de una excepción.

**Objetivos del ejercicio:**

- Implementar una función testejable basada en una fórmula matemática.
- Aprender a utilizar `@ParameterizedTest` en JUnit 5.
- Utilizar diferentes fuentes de datos para parametrizar las pruebas.
- Validar múltiples casos de prueba sin duplicar métodos de test.
- Comprobar el tratamiento de valores inválidos mediante excepciones.

## ✨ Características

### Clase `NationalIdCalculator`

- **LETTERS:** lista inmutable que contiene las 23 letras utilizadas para calcular la letra del DNI.
- **nationalIdCalculator(int id):** recibe el número de DNI, comprueba que se encuentre dentro del rango permitido (0–99.999.999), calcula el resto de dividirlo entre 23 y devuelve la letra correspondiente de la lista.
- Lanza una `IllegalArgumentException` cuando el número recibido está fuera del rango permitido.

### Clase `NationalIdCalculatorTest`

Se implementan dos métodos de test parametrizados:

- **shouldCalculateCorrectLetter():** utiliza `@CsvSource` para comprobar 10 números de DNI diferentes junto con sus letras esperadas. Verifica que el resultado obtenido coincida con el esperado mediante `assertEquals()`.

- **shouldThrowExceptionWhenIdIsOutOfRange():** utiliza `@ValueSource` para comprobar diferentes números inválidos, tanto negativos como superiores al límite permitido. Verifica que se lance una `IllegalArgumentException` mediante `assertThrows()`.

## 📚 Investigación: Tests parametrizados en JUnit 5

Los tests parametrizados permiten ejecutar un mismo método de prueba varias veces utilizando diferentes conjuntos de datos. De esta manera, se evita duplicar código y se facilita la validación de múltiples escenarios.

### `@ParameterizedTest`

Anotación de JUnit 5 que permite ejecutar un método de test repetidamente, utilizando los valores proporcionados por una fuente de datos.

### `@CsvSource`

Permite definir los datos de prueba directamente mediante cadenas de texto separadas por comas. Cada fila proporciona los argumentos que recibirá el método de test.

En este ejercicio se utiliza para proporcionar un número de DNI y su letra esperada.

### `@ValueSource`

Permite proporcionar una lista de valores individuales de un mismo tipo al método de test.

En este ejercicio se utiliza para comprobar diferentes números de DNI fuera del rango permitido.

### `assertEquals()`

Comprueba que el valor obtenido durante la ejecución coincide con el valor esperado.

### `assertThrows()`

Comprueba que la ejecución de un método lanza una excepción del tipo especificado.

## ▶️ Ejecución del proyecto y tests

### Ejecutar el proyecto

Al tratarse de un ejercicio centrado en testing, no es necesario ejecutar la aplicación de forma independiente. La funcionalidad se valida mediante los tests unitarios.

### Ejecutar los tests

Los tests pueden ejecutarse de las siguientes maneras:

- **Desde IntelliJ IDEA:** abrir la clase `NationalIdCalculatorTest` y pulsar el icono verde de ejecución situado junto a la clase o a cada método de test.
- **Desde Maven:** abrir la terminal en la carpeta raíz del proyecto y ejecutar:

```bash
mvn test
```

Este comando compila el proyecto, ejecuta los tests y muestra el resultado de las pruebas.

Los resultados también pueden consultarse en IntelliJ IDEA, donde se indica el número de tests ejecutados, los que han finalizado correctamente y los que han fallado.

## Conclusión

Este ejercicio permite poner en práctica los tests parametrizados de JUnit 5 mediante `@ParameterizedTest`, `@CsvSource` y `@ValueSource`, comprobando tanto los resultados correctos del cálculo de la letra del DNI como el tratamiento de valores inválidos.