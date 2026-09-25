package com.github.maudevro.cursojava.modulo01fundamentos.ejerciciosmodulo01;

public class ExVariables {

    public static void main(String[] args) {

        /* ======================================================================
         * SECCIÓN 1: CONCEPTOS TEÓRICOS DE VARIABLES
         * ====================================================================== */

        // Ejercicio 1.1: Responde en un comentario: ¿Cuál es el propósito principal de las variables en Java?
        // TODO: Ingrese aquí su código

        // Ejercicio 1.2: Responde en un comentario: ¿Puede una variable en Java cambiar su tipo de datos después de ser declarada?
        // TODO: Ingrese aquí su código

        // Ejercicio 1.3: Responde en un comentario: ¿Cuál es el tamaño, en bits, de una variable de tipo short en Java?
        // TODO: Ingrese aquí su código


        /* ======================================================================
         * SECCIÓN 2: DECLARACIÓN, ASIGNACIÓN Y CONVENCIONES
         * ====================================================================== */

        // Ejercicio 2.1: ¿Cuál es la forma correcta de crear una variable de tipo entera y asignarle el valor 100?
        // TODO: Ingrese aquí su código

        // Ejercicio 2.2: ¿Cuál es la opción correcta para almacenar en una variable el número decimal 35.25?
        // TODO: Ingrese aquí su código

        // Ejercicio 2.3: Declara un literal long de forma correcta con el valor 12134323551.
        // TODO: Ingrese aquí su código

        // Ejercicio 2.4: ¿Qué valor almacenará una variable char si se le asigna el número 67? Declárala e imprímela.
        // TODO: Ingrese aquí su código

        // Ejercicio 2.5: Declara variables utilizando nombres que cumplan con las convenciones de Java (ej. edad, suma)
        // y documenta en un comentario por qué nombres como "1nombre" o "fuente*energia" son incorrectos.
        // TODO: Ingrese aquí su código

        // Ejercicio 2.6: Explica en un comentario la diferencia exacta entre el operador "=" y "==" al tratar con variables.
        // TODO: Ingrese aquí su código


        /* ======================================================================
         * SECCIÓN 3: CADENAS DE TEXTO (STRINGS)
         * ====================================================================== */

        // Ejercicio 3.1: Dadas las variables String a = "5" y String b = "-10",
        // crea una variable c = a + b y muestra qué valor almacena c al imprimirla.
        // TODO: Ingrese aquí su código

        // Ejercicio 3.2: Dada la cadena String texto = "Esto es un texto ";
        // busca el índice del carácter 'a' utilizando el método indexOf y guárdalo en una variable entera.
        // TODO: Ingrese aquí su código

        // Ejercicio 3.3: Dadas las variables String nombre = "Juan" y String apellido = "Gómez",
        // crea una variable String mensaje que las concatene para que la salida impresa sea exactamente:
        // "Hola, Juan Gómez! Bienvenido al mundo de la programación."
        // TODO: Ingrese aquí su código

        // Ejercicio 3.4: Explica en un comentario la diferencia entre usar "==" y ".equals()" al comparar variables de tipo String.
        // TODO: Ingrese aquí su código


        /* ======================================================================
         * SECCIÓN 4: CONVERSIONES (CASTING) Y LÍMITES
         * ====================================================================== */

        // Ejercicio 4.1: ¿Qué sucede si intentas almacenar un número más grande del que soporta un byte?
        // Escribe la declaración byte miNumero = 200; y documenta en un comentario el resultado (desbordamiento).
        // TODO: Ingrese aquí su código

        // Ejercicio 4.2: ¿Qué sucede al asignar un valor int a una variable long sin casting explícito?
        // Declara int numeroInt = 100; y luego long numeroLong = numeroInt;
        // Comenta si es un error o una conversión segura.
        // TODO: Ingrese aquí su código

        // Ejercicio 4.3: Realiza un casting explícito. Dadas double a = 50.0 y double b = 3.0,
        // divide a entre b y guarda el resultado en una variable float forzando la conversión.
        // TODO: Ingrese aquí su código

        // Ejercicio 4.4: Tipos mixtos y asignaciones compuestas.
        // 1. Declara double a = 15.9 y float b = 13.8f.
        // 2. Súmalas en una variable double llamada suma.
        // 3. Aplica suma++; dos veces.
        // 4. Haz un casting de 'suma' a un int llamado c.
        // 5. Aplica c--; tres veces.
        // 6. Aplica c += 23; y c *= 3;
        // 7. Imprime c.
        // TODO: Ingrese aquí su código


        /* ======================================================================
         * SECCIÓN 5: VARIABLES BOOLEANAS, ACUMULADORES Y ALCANCE
         * ====================================================================== */

        // Ejercicio 5.1: Dadas las variables boolean esta = true y boolean voy = false,
        // crea una variable 'resultado' que asigne (esta && voy). Luego imprime la negación (!resultado).
        // TODO: Ingrese aquí su código

        // Ejercicio 5.2: Evalúa las siguientes variables en sus respectivos tipos:
        // 1. int a = 13, b = 5; Guarda a % b en una variable c e imprímela.
        // 2. boolean lluvia = false, sol = true; Guarda (lluvia || sol) en una variable resultado e imprímela.
        // TODO: Ingrese aquí su código

        // Ejercicio 5.3: Identifica la variable acumulador.
        // Declara int s = 0. Crea un for(int l = 1; l < 10; l++) y acumula el valor de l dentro de s usando s += l;
        // TODO: Ingrese aquí su código

        // Ejercicio 5.4: ¿Qué es el alcance (scope) de una variable en Java?
        // Crea un bloque interno usando llaves { }, declara una variable allí e intenta imprimirla fuera de las llaves
        // para demostrar y comentar qué sucede.
        // TODO: Ingrese aquí su código
    }
}
