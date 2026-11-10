# Calculator – TDD

## Descripción

En este ejercicio se desarrolla una calculadora sencilla utilizando la metodología **TDD (Test-Driven Development)**.

La calculadora mantiene un total acumulado sobre el que se pueden realizar diferentes operaciones matemáticas. El desarrollo se realiza mediante ciclos de prueba, implementación y refactorización (Red, Green, Refactor).

## 📌 Instrucciones del ejercicio

Crear una clase `Calculator` que permita realizar operaciones matemáticas sobre un total acumulado, inicialmente establecido en cero.

**Objetivos del ejercicio:**

- Inicializar el total a `0`.
- Implementar las operaciones de suma, resta, multiplicación y división.
- Controlar la división entre cero mediante una excepción `ArithmeticException`.
- Implementar un método para reiniciar el total a cero.
- Obtener el valor actual del total mediante un método específico.
- Aplicar la metodología TDD durante el desarrollo.

## ✨ Características

### Calculator

Clase responsable de gestionar el total acumulado y realizar las operaciones matemáticas.

- `add(int num)`: suma un número al total.
- `subtract(int num)`: resta un número al total.
- `multiply(int num)`: multiplica el total por un número.
- `divide(int num)`: divide el total entre un número. Lanza una `ArithmeticException` si el divisor es cero.
- `reset()`: reinicia el total a cero.
- `getTotal()`: devuelve el valor actual del total.

### CalculatorTest

Clase de pruebas unitarias desarrolladas con **JUnit 5 y AssertJ**.

Se comprueban los siguientes comportamientos:

- Inicialización del total a cero.
- Suma y resta de valores.
- Multiplicación y división.
- Excepción al intentar dividir entre cero.
- Reinicio del total a cero.

Se utiliza `@BeforeEach` para crear una nueva instancia de `Calculator` antes de cada test, garantizando que las pruebas sean independientes entre sí.

## 📚 Investigación: conceptos de testing

### TDD (Test-Driven Development)

TDD es una metodología de desarrollo en la que las pruebas se escriben antes que el código de producción.

Se basa en tres fases:

- **Red:** escribir una prueba que falla porque todavía no existe la funcionalidad.
- **Green:** implementar el código mínimo necesario para que la prueba pase.
- **Refactor:** mejorar el código sin alterar su comportamiento y manteniendo las pruebas en verde.

### JUnit 5

JUnit 5 es un framework de testing para Java que permite crear y ejecutar pruebas unitarias.

En este ejercicio se utilizan:

- `@Test`: identifica los métodos que contienen pruebas.
- `@BeforeEach`: ejecuta un método antes de cada prueba, permitiendo preparar un estado inicial independiente.

### AssertJ

AssertJ es una biblioteca que permite escribir aserciones de forma fluida y legible.

En este ejercicio se utilizan:

- `assertThat()`: comprueba que un resultado cumple una condición esperada.
- `assertThatExceptionOfType()`: comprueba que una operación lanza una excepción del tipo indicado.

## 🧪 Testing: metodología TDD

El desarrollo sigue el ciclo **Red – Green – Refactor**:

1. **Red:** escribir un test que inicialmente falla.
2. **Green:** implementar el código mínimo necesario para que el test pase.
3. **Refactor:** mejorar el código manteniendo todos los tests en verde.

## ▶️ Ejecución del proyecto

### Desde IntelliJ IDEA

1. Abrir el proyecto en IntelliJ IDEA.
2. Localizar la clase `Calculator`.
3. Hacer clic derecho sobre el archivo y seleccionar **Run 'Calculator'**.

### Ejecutar los tests desde IntelliJ IDEA

1. Localizar la clase `CalculatorTest`.
2. Hacer clic derecho sobre el archivo.
3. Seleccionar **Run 'CalculatorTest'**.
4. Comprobar los resultados en la ventana de ejecución de tests.

También se pueden ejecutar todos los tests del proyecto desde la carpeta `test` o desde la ventana Maven.

### Ejecutar los tests desde Maven

Desde la terminal, situada en la raíz del proyecto (donde se encuentra el archivo `pom.xml`), ejecutar:

```bash
mvn test
```

Maven compilará el proyecto, ejecutará los tests y mostrará el resultado de las pruebas.

## 📝 Conclusión

Este ejercicio permite practicar el desarrollo guiado por pruebas mediante TDD, comprender la importancia de validar el comportamiento de una clase y utilizar JUnit 5 y AssertJ para automatizar las pruebas unitarias.