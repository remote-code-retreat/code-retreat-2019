# Code Retreat con Java

Se recomienda el uso de este proyecto base para la implementación del código del Code Retreat, pero en caso de tener instalado IntelliJ o cualquier otro IDE con soporte para Scala se puede crear un projecto de ``sbt`` fácilmente. También se pueden crear projectos de `sbt` con la ejecución del comando `sbt new scala/scalatest-example.g8`, pero este no tendrá añadidas por defecto las dependencias que hemos configurado para este proyecto y que te pueden ser de utilidad.

## Requisitos previos

* IntelliJ. El soporte para Visual Studio Code comparado con IntelliJ es bastante malo, por lo que recomiendo tener instalado este IDE en caso de que lo necesitemos.
* Java.
* SBT.

## Ejecutar los tests

Para ejecutar los tests basta con lanzar el comando `sbt test`.

Hay algunos comandos de `sbt` que te pueden ser muy útiles:

* ``sbt ~test`` # Ejecutar los tests cada vez que cambia algo de código.
* ``sbt ~testQuick`` # Ejecutar los tests relacionados con el código actualizado cada vez que cambia algo de código.
* ``sbt testOnly *TestSuiteName`` # Ejecutar una única suite de tests.
* ``sbt ~testOnly *TestSuiteName`` # Ejecutar una única suite de tests cuando el código cambia.
* ``sbt clean`` # Limpiar el directorio de la build.
* ``sbt compile`` # Compilar el código.
* ``sbt ~compile`` # Compilar el código de forma contínua cuando se produce algúnc ambio en el mismo.

## Extensiones de VSCode Studio Code recomendadas

* Scala (Metals).

## Plugins de IntelliJ recomendados

* Scala Plugin.