# Plantilla de Go para la kata Game of Life
Para preparar el entorno, tienes dos opciones:

1. Usar Docker (inspirado en https://github.com/swkBerlin/kata-bootstraps/blob/master/golang/README.md):
    * Prerrequisito: tener Docker instalado.
    * Ejecutar `./run_with_docker.sh`. Este comando nos deja dentro del contenedor.
    * Desde el contenedor: `cd src/game-of-life/` 
    * Desde el contenedor: `./run_go_tests.sh`
    * A partir de aquí, simplemente editas los ficheros de Go desde el host, y ejecutas los tests desde el contenedor.

2. Instalar y configurar Go localmente 
    * https://golang.org/doc/install
    * Instalar la librería testify: `go get github.com/stretchr/testify`
    * `./run_go_tests.sh`
