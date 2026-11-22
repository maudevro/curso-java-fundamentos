package com.github.maudevro.cursojava.modulo01fundamentos.control;

/**
 * Guía Técnica: Estructuras de Control Condicionales y Manejo de Flujo.
 * Este archivo aborda en profundidad el uso de las sentencias condicionales en Java,
 * basándose en el material teórico oficial de la universidad (UTEC).
 * Demuestra:
 * - Bifurcaciones simples (if), dobles (if-else) y múltiples (if-else if-else).
 * - Alcance o scope de variables locales en bloques de código.
 * - Métodos booleanos fundamentales de la clase String (.equals, .contains, .isEmpty).
 * - Selección múltiple con la sentencia switch.
 */

public class EstructurasCondicionales {

    public static void main(String[] args) {

        // ====================================================================
        // 1. CONDICIONAL SIMPLE (if) Y ALCANCE (SCOPE)
        // ====================================================================

        System.out.println("=== 1. CONDICIONAL SIMPLE (if) Y SCOPE ===");

        int numero1 = 50;
        int numero2 = 35;

        // Evaluación de una expresión booleana directa
        if (numero1 > numero2) {
            System.out.println("La condición (numero1 > numero2) es verdadera.");
        }

        // Demostración de asignación booleana previa y alcance (scope)
        boolean condicionEvaluada = numero1 >= numero2;
        double resultadoScope = 12.8;

        if (condicionEvaluada) {
            // Variable local restringida al bloque 'if'
            int variableLocalBlock = 20;
            resultadoScope = 13.50 + variableLocalBlock;
        }

        /*
         * NOTA TEÓRICA SOBRE SCOPE:
         * Intentar acceder a 'variableLocalBlock' fuera de las llaves del 'if'
         * genera un error de compilación: "Cannot resolve symbol 'variableLocalBlock'".
         */
        System.out.println("Resultado scope mantenido fuera del bloque if: " + resultadoScope);

        // ====================================================================
        // 2. CONDICIONAL DOBLE (if - else) Y ANIDACIÓN
        // ====================================================================

        System.out.println("\n=== 2. CONDICIONAL DOBLE (if - else) ===");

        int var1 = 50;
        int var2 = 50;
        String mensajeEstado = "Aún no entré al if";

        if (var1 != var2) {
            mensajeEstado = "Estoy dentro del if";
        } else {
            mensajeEstado = "Estoy dentro del else";
        }
        System.out.println("Estado del flujo: " + mensajeEstado);

        // Demostración de anidación dentro de bloques
        boolean condicionSecundaria = var1 == var2;
        if (condicionSecundaria) {
            if (var1 >  0) {
                System.out.println("Demostración de IF anidado: las variables son iguales y mayores a 0.");
            }
        }

        // ====================================================================
        // 3. ESTRUCTURA MÚLTIPLE (if - else if - else)
        // ====================================================================

        System.out.println("\n=== 3. CONDICIONAL MÚLTIPLE (if - else if - else) ===");

        int valorEvaluar = 15;
        String rangoMensaje;

        if (valorEvaluar < 5) {
            rangoMensaje = "El valor es menor que 5";
        } else if (valorEvaluar >= 5 && valorEvaluar < 15) {
            rangoMensaje = "El valor está entre 5 y 14";
        } else if (valorEvaluar >= 15 && valorEvaluar <= 25) {
            rangoMensaje = "El valor está entre 15 y 24";
        } else {
            rangoMensaje = "El valor es mayor o igual a 25";
        }
        System.out.println("Evaluación del rango: " + rangoMensaje);

        // Caso demostrativo sin bloque 'else' final (mantiene valor por defecto si ninguna condición se cumple)
        int valorDesbordado = 200;
        String mensajeDefault = "Valor por defecto";

        if (valorDesbordado < 5) {
            mensajeDefault = "El valor es menor que 5";
        } else if (valorDesbordado  >= 5 && valorDesbordado < 15) {
            mensajeDefault = "El valor está entre 5 y 14";
        } else if (valorDesbordado >= 15 && valorDesbordado < 25) {
            mensajeDefault = "El valoe está entre 15 y 24";
        }

        System.out.println("Resultado sin bloque 'else': " + mensajeDefault);

        // ====================================================================
        // 4. OPERACIONES Y EVALUACIONES CON STRING
        // ====================================================================

        System.out.println("\n=== 4. EVALUACIONES CON OBJETOS STRING ===");

        String cadena1 = "hola";
        String cadena2 = "hola";
        String cadena3 = "chau";
        String cadenaSub = "ola";
        String cadenaVacia = "";

        // Comparación de contenido léxico con .equals()
        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        }

        if(!cadena1.equals(cadena3)) {
            System.out.println("Las cadenas son diferentes.");
        }

        // Busqueda de subcadena con .contains()
        if (cadena1.contains(cadenaSub)) {
            System.out.println("La subcadena se encuentra en la cadena.");
        }

        // Verificación de vacíos con .isEmpty()
        if (cadenaVacia.isEmpty()) {
            System.out.println("cadenaVacía está efectivamente vacía (length == 0).");
        }

        // ====================================================================
        // 5. ESTRUCTURA DE SELECCIÓN MÚLTIPLE (switch)
        // ====================================================================

        System.out.println("\n=== 5. SELECCIÓN MÚLTIPLE CON SWITCH ===");

        int opcionSwitch = 10;
        double resultadoCalculo = 0.0;

        switch (opcionSwitch) {
            case 5:
                int otraVariable = 56;
                resultadoCalculo = 34.22 + otraVariable;
                break;
            case 15:
                resultadoCalculo = 34.22;
                break;
            case 10:
                resultadoCalculo = 34.22 + 56;
                System.out.println("Coincidencia encontrada en el case 10. Resultado: " + resultadoCalculo);
                break;
            default:
                System.out.println("No se encontró ninguna coincidencia en el switch.");
                break;
        }
    }
}
