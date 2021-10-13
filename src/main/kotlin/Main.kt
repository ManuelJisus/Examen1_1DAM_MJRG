fun main() {
    var edadAlumno : Byte
    var mesActual : Byte
    var entrada : String
    var listaEntrada: List<String>

         // Declaración de variables
    // Aqui tienes que definir las variables que se utilizan

    // Leo desde teclado la edad del alumno y el mes acutal
    println("Introduzca la configuración del programa en este formato: <edadAlumno>,  <mesActual>")
    entrada = readLine() ?: ""
    listaEntrada = entrada.split(",")

    // Linea Inicial de programa
    println("*".repeat(80))
    println("PROGRAMA DE GENERACIÓN DE TABLAS: Manuel Jesús Ramírez Godoy")

    // Linea inicio cabecera
    println("_".repeat(80))

    if (listaEntrada.size != 2) //Compruebo el tamaño de la lista, si es != 2, finaliza el programa
    {
        println("La entrada no es correcta")
        println("_".repeat(80))
    }
    else { // Sino, leo edad y mes. Asigno -1 si hay error en la lectura.
        edadAlumno = try {
            listaEntrada[0].trim().toByte()
        } catch (_: Exception) {
            -1
        }
        mesActual = try {
            listaEntrada[1].trim().toByte()
        } catch (_: Exception) {
            -1
        }

        if ((edadAlumno <= 0) || (mesActual <= 0)) // Si alguno es menor que -1, finaliza el programa
        {
            println("La entrada no es correcta")
            println("_".repeat(80))
        } else //Sino, continuo
        {
            if ((edadAlumno >= 14) || (mesActual >= 13)) {
                println("No se cotempla esta edad o este mes")
                println("_".repeat(80))
            } else {
                when (edadAlumno) {
                    in 6..8 -> {
                        println("El alumno está dentro del rango [6-8]")

                        if (mesActual % 2 == 0) {
                            println("El mes es par, corresponden las tablas siguientes: {2,4}")
                            println("_".repeat(80))
                            println("Tabla del 2")
                            println("*".repeat(80))
                            for (i in 0..10) {
                                println("2 x $i = ${2 * i}")
                            }
                            println("Tabla del 4")
                            println("*".repeat(80))
                            for (i in 0..10) {
                                println("4 x $i = ${4 * i}")
                            }
                        } else {
                            println("El mes es impar, corresponden las tablas siguientes: {1,3,5}")
                            println("Tabla del 1")
                            println("*".repeat(80))
                            for (i in 0..10) {
                                println("1 x $i = ${1 * i}")
                            }
                            println("Tabla del 3")
                            println("*".repeat(80))
                            for (i in 0..10) {
                                println("3 x $i = ${3 * i}")
                            }
                            println("Tabla del 5")
                            println("*".repeat(80))
                            for (i in 0..10) {
                                println("5 x $i = ${5 * i}")

                            }
                        }
                    }
                    in 9..10 -> {
                        println("El alumno está dentro del rango [9,10]")

                        if (mesActual % 2 == 0) {
                            println("El mes es par, corresponden las tablas siguientes: {6,8,10}")
                            println("_".repeat(80))
                            println("Tabla del 6")
                            println("*".repeat(80))
                            for (i in 0..10) {
                                println("6 x $i = ${6 * i}")
                            }
                            println("Tabla del 8")
                            println("*".repeat(80))
                            for (i in 0..10) {

                                println("8 x $i = ${8 * i}")
                            }
                            println("Tabla del 10")
                            println("*".repeat(80))
                            for (i in 0..10) {
                                println("10 x $i = ${10 * i}")

                            }
                        } else {
                            println("El mes es impar, corresponden las tablas siguientes: {7,9}")
                            println("_".repeat(80))
                            println("Tabla del 7")
                            println("*".repeat(80))
                            for (i in 0..10) {
                                println("7 x $i = ${7 * i}")
                            }
                            println("Tabla del 9")
                            println("*".repeat(80))
                            for (i in 0..10) {
                                println("9 x $i = ${9 * i}")
                            }
                        }
                    }
                    in 11..12 -> {
                        println("El alumno está dentro del rango [11,12]")
                        if (mesActual % 2 == 0) {
                            println("El mes es par, corresponden las tablas siguientes: {11,12,13}")
                            println("_".repeat(80))
                            println("Tabla del 11")
                            println("*".repeat(80))
                            for (i in 0..10) {
                                println("11 x $i = ${11 * i}")
                            }
                            println("Tabla del 12")
                            println("*".repeat(80))
                            for (i in 0..10) {
                                println("12 x $i = ${12 * i}")
                            }
                            println("Tabla del 13")
                            println("*".repeat(80))
                            for (i in 0..10) {
                                println("13 x $i = ${13 * i}")

                            }
                        } else {
                            println("El mes es impar, corresponden las tablas siguientes: {11,12,13}")
                            println("_".repeat(80))
                            println("Tabla del 11")
                            println("*".repeat(80))
                            for (i in 0..10) {
                                println("11 x $i = ${11 * i}")
                            }
                            println("Tabla del 12")
                            println("*".repeat(80))
                            for (i in 0..10) {
                                println("12 x $i = ${12 * i}")
                            }
                            println("Tabla del 13")
                            println("*".repeat(80))
                            for (i in 0..10) {
                                println("13 x $i = ${13 * i}")

                            }
                        }
                    }
                }
            }

        }
    }
        // Linea final de programa
        println("*".repeat(80))

    }
