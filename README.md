# Testing en Java

## Descripción

En este proyecto se trabajan los fundamentos del **testing automatizado en Java**, mediante diferentes ejercicios prácticos organizados en tres niveles progresivos.

A lo largo de la tarea se utilizan **JUnit 5** para desarrollar pruebas unitarias, **AssertJ** para realizar aserciones más expresivas y la metodología **TDD (Test-Driven Development)** para desarrollar funcionalidades guiadas por pruebas.

Los ejercicios permiten comprender la importancia de verificar el comportamiento del código, detectar errores de forma temprana y aplicar buenas prácticas de desarrollo orientadas a la calidad del software.

## 📌 Objetivos de la tarea

- Aprender a desarrollar y ejecutar tests unitarios con JUnit 5.
- Utilizar aserciones para verificar los resultados esperados.
- Trabajar con tests parametrizados para validar diferentes conjuntos de datos.
- Comprobar el lanzamiento de excepciones mediante pruebas automatizadas.
- Familiarizarse con AssertJ y sus aserciones fluidas.
- Aplicar la metodología TDD mediante el ciclo Red, Green, Refactor.
- Desarrollar código modular, mantenible y fácil de probar.
- Gestionar las dependencias del proyecto mediante Maven.

## 📚 Contenido del proyecto

### Nivel 1 – JUnit 5

Introducción al testing automatizado mediante JUnit 5.

Se trabajan tres ejercicios:

- **Ejercicio 1: Tests unitarios.** Gestión de una colección de libros mediante una clase `BookManager`, comprobando sus operaciones y validaciones.
- **Ejercicio 2: Tests parametrizados.** Cálculo de la letra del DNI mediante diferentes conjuntos de datos, utilizando `@ParameterizedTest`, `@CsvSource` y `@ValueSource`.
- **Ejercicio 3: Control de excepciones.** Comprobación del lanzamiento de `ArrayIndexOutOfBoundsException` mediante `assertThrows()`.

### Nivel 2 – AssertJ

Introducción a AssertJ, una biblioteca que permite escribir aserciones más expresivas y legibles.

A través de siete ejercicios se practican diferentes comprobaciones:

- Igualdad y desigualdad entre objetos.
- Identidad de referencias.
- Comparación de arrays.
- Comprobación del contenido y orden de listas.
- Verificación de claves en mapas.
- Comprobación de excepciones.
- Validación de objetos `Optional` vacíos.

### Nivel 3 – TDD (Test-Driven Development)

Aplicación de la metodología de desarrollo guiado por pruebas mediante la implementación de una calculadora con estado interno.

Se desarrolla una clase `Calculator` que permite realizar operaciones matemáticas sobre un total acumulado:

- Suma.
- Resta.
- Multiplicación.
- División.
- Control de división entre cero.
- Reinicio del total.
- Consulta del valor actual.

El desarrollo sigue el ciclo **Red → Green → Refactor**, escribiendo primero las pruebas, implementando el código necesario y refactorizando cuando corresponde.

## 🛠️ Tecnologías y herramientas

- **Java:** lenguaje de programación utilizado para desarrollar los ejercicios.
- **Maven:** gestor de dependencias y herramienta de construcción del proyecto.
- **JUnit 5:** framework utilizado para desarrollar y ejecutar los tests unitarios.
- **AssertJ:** biblioteca utilizada para realizar aserciones más expresivas.
- **IntelliJ IDEA:** entorno de desarrollo utilizado para implementar y ejecutar los ejercicios.
- **Git y GitHub:** herramientas de control de versiones y gestión del repositorio.

## ▶️ Ejecución de los proyectos y tests

Los ejercicios están orientados al testing automatizado, por lo que su funcionalidad se comprueba principalmente mediante la ejecución de las pruebas.

### Desde IntelliJ IDEA

1. Abrir el proyecto correspondiente.
2. Localizar la clase de test.
3. Pulsar el icono verde de ejecución situado junto a la clase para ejecutar todas sus pruebas, o junto a un método para ejecutar un test individual.
4. Consultar los resultados en la ventana de ejecución de tests.

### Desde Maven

Abrir una terminal en la carpeta raíz del proyecto correspondiente, donde se encuentra el archivo `pom.xml`, y ejecutar:

```bash
mvn test
```

Este comando compila el proyecto y ejecuta los tests automatizados.

## 📝 Conclusión

Esta tarea ha permitido adquirir una primera base en testing automatizado con Java, trabajando diferentes herramientas y metodologías utilizadas en el desarrollo de software.

Desde las pruebas unitarias con JUnit 5 hasta las aserciones de AssertJ y el desarrollo guiado por pruebas mediante TDD, los ejercicios han permitido comprender la importancia de verificar el comportamiento del código y detectar posibles errores antes de que lleguen a fases posteriores del desarrollo.

El testing constituye una parte fundamental del desarrollo de software, ya que contribuye a crear aplicaciones más fiables, mantenibles y robustas.
