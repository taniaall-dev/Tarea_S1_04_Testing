# Ejercicio 3: Control de Excepciones

## 📝 Descripción

En este ejercicio se trabaja el lanzamiento y la detección de excepciones en Java mediante testing automatizado con JUnit 5.

Se implementa un método que intenta acceder a una posición inexistente de un array, provocando una excepción de tipo `ArrayIndexOutOfBoundsException`. Posteriormente, se comprueba mediante un test unitario que se produce la excepción esperada.

## 📌 Instrucciones del ejercicio

Crear una clase Java con un método público que provoque una excepción `ArrayIndexOutOfBoundsException` al intentar acceder a una posición inexistente de un array.

A continuación, implementar una clase de test con JUnit 5 que compruebe que el método lanza la excepción esperada cuando se intenta acceder a una posición no válida.

**Objetivos del ejercicio:**

- Comprender el funcionamiento de las excepciones en Java.
- Identificar situaciones que provocan una `ArrayIndexOutOfBoundsException`.
- Aprender a comprobar excepciones mediante tests automatizados con JUnit 5.
- Familiarizarse con el uso de `assertThrows()`.

## ✨ Características

- **ArrayExceptionHandler:** contiene un array de Strings y un método público que intenta acceder a una posición utilizando el índice recibido como parámetro.
- **ArrayExceptionHandlerTest:** comprueba mediante JUnit 5 que se produce una `ArrayIndexOutOfBoundsException` al intentar acceder a una posición inexistente del array.
- Se utiliza `assertThrows()` para verificar el tipo de excepción esperado.

## 📚 Investigación: Excepciones y testing en Java

### ArrayIndexOutOfBoundsException

Es una excepción que se produce cuando se intenta acceder a una posición de un array que está fuera de sus límites.

Los índices de un array comienzan en 0 y terminan en `length - 1`. Si se intenta acceder a una posición inexistente, Java lanza automáticamente esta excepción.

### assertThrows()

Es un método de JUnit 5 que permite comprobar que una determinada operación provoca una excepción del tipo esperado.

Recibe como argumentos el tipo de excepción que se espera y una expresión ejecutable que contiene la operación que se quiere comprobar.

Si se produce la excepción esperada, el test pasa correctamente. Si no se produce o se lanza una excepción diferente, el test falla.

## 🧪 Pruebas realizadas

Se ha implementado un test unitario para comprobar el comportamiento del método `accessInvalidArrayPosition()`.

- Se crea una instancia de `ArrayExceptionHandler`.
- Se invoca el método pasando el índice `7`, que está fuera de los límites del array.
- Se utiliza `assertThrows()` para verificar que se produce una `ArrayIndexOutOfBoundsException`.

**Resultado esperado:** el test finaliza correctamente al detectar la excepción prevista.

## ▶️ Ejecución del proyecto y tests

### Ejecutar el proyecto

Este ejercicio está centrado en el control de excepciones mediante testing unitario, por lo que no requiere ejecutar una aplicación de forma independiente. El comportamiento se comprueba mediante los tests de JUnit 5.

### Ejecutar los tests

Los tests pueden ejecutarse de las siguientes maneras:

- **Desde IntelliJ IDEA:** abrir la clase `ArrayExceptionHandlerTest` y pulsar el icono verde de ejecución situado junto a la clase para ejecutar los tests, o junto al método para ejecutar una prueba individual.
- **Desde Maven:** abrir la terminal en la carpeta raíz del proyecto y ejecutar:

```bash
mvn test
```

Este comando compila el proyecto, ejecuta los tests y muestra los resultados de las pruebas.

Los resultados también pueden consultarse en IntelliJ IDEA, donde se indica si los tests han finalizado correctamente o han fallado.

## 🎯 Conclusión

Este ejercicio permite comprender cómo Java lanza automáticamente excepciones cuando se realizan operaciones no válidas y cómo JUnit 5 permite verificar estos comportamientos mediante tests automatizados.

Se ha practicado especialmente el uso de `ArrayIndexOutOfBoundsException` y `assertThrows()` para comprobar que el programa responde correctamente ante situaciones de error.