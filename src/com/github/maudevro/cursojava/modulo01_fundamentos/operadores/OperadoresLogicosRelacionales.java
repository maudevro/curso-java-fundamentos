package com.github.maudevro.cursojava.modulo01_fundamentos.operadores;

/**
 * Guía Técnica: Operadores Lógicos, Relacionales y Ternario en Java.
 * Demuestra la evaluación de expresiones de comparación, el uso de conectores
 * lógicos, el comportamiento de la evaluación en cortocircuito y el uso del
 * operador ternario como estructura condicional simplificada.
 */
public class OperadoresLogicosRelacionales {

    public static void main(String[] args) {

        // =======================================================================================
        // 1. OPERADORES RELACIONALES (COMPARACIÓN)
        // =======================================================================================

        System.out.println("=== 1. OPERADORES RELACIONALES ===");

         int x = 15;
         int y = 22;

        // Evaluación de comparaciones numéricas binarias (devuelven tipo boolean)
        boolean esIgual = x == y;
        boolean esDiferente = x != y;
        boolean esMayor = x > y;
        boolean esMenor = x < y;
        boolean esMayorIgual = (x >= 15);
        boolean esMenorIgual = (y <= 20);

        System.out.println("Igualdad (15 == 22): " + esIgual);
        System.out.println("Diferencia (15 != 22): " + esDiferente);
        System.out.println("Mayor que (15 > 22): " + esMayor);
        System.out.println("Menor que (15 < 22): " + esMenor);
        System.out.println("Mayor o igual que (15 >= 15): " + esMayorIgual);
        System.out.println("Menor o igual que (22 <= 20): " + esMenorIgual);

        // Comparación de caracteres basada en su código numérico ASCII/Unicode
        char caracterA = 'a';
        char caracterB = 'b';
        boolean caracteresDiferentes = caracterA != caracterB;
        System.out.println("Comparación de caracteres ('a' != 'b'): " + caracteresDiferentes);

        // =======================================================================================
        // 2. OPERADORES LÓGICOS (CONECTORES)
        // =======================================================================================

        System.out.println("\n=== 2. OPERADORES LÓGICOS ===");

        boolean condicionA = true;
        boolean condicionB = false;

        // AND (&&): Retorna true si y solo si ambos operandos son verdaderos
        boolean resultadoAnd = condicionA && condicionB;

        // OR (||): Retorna true si al menos uno de los operandos es verdadero
        boolean resultadoOr = condicionA || condicionB;

        // NOT (!): Invierte el valor de verdad del operando
        boolean resultadoNot = !condicionB;

        System.out.println("Conjución AND (True && False): " + resultadoAnd);
        System.out.println("Disyunción OR (True || False): " + resultadoOr);
        System.out.println("Negación NOT (!False): " + resultadoNot);

        // =======================================================================================
        // 3. EVALUACIÓN EN CORTOCIRCUITO (LEFT-TO-RIGHT EVALUATION)
        // =======================================================================================

        System.out.println("\n=== 3. EVALUACIÓN EN CORTOCIRCUITO ===");

        // Regla: La evaluación ocurre de izquierda a derecha.
        // En una operación AND (&&), si el primer término es false, el segundo no se evalúa.
        int divisor = 0;
        boolean evaluacionSeguraAnd = (divisor != 0) && (10 / divisor > 1);
        System.out.println("Evaluación con AND seguro (evita ArithmeticException): " + evaluacionSeguraAnd);

        // En una operación OR (||), si el primer término es true, el segundo no se evalúa.
        boolean evaluacionSeguraOr = (divisor == 0) || (10 / divisor > 1);
        System.out.println("Evaluación con OR seguro: " + evaluacionSeguraOr);

        // =======================================================================================
        // 4. EXPRESIONES COMBINADAS Y PRECEDENCIA DE OPERADORES
        // =======================================================================================

        System.out.println("\n=== 4. EXPRESIONES COMBINADAS Y PRECEDENCIA ===");

        int a = 5;
        int b = 3;
        int c = -12;

        // Jerarquía: 1. Aritmética | 2. Relacional | 3. Lógica
        // Pasos de evaluación:
        // 1. (5 * 3 == 15) -> (15 == 15) -> true
        // 2. (5 + 3 + -12 < 0) -> (-4 < 0) -> true
        // 3. true && true -> true
        boolean expresionEvaluada = (a * b == 15) && (a + b + c < 0);

        System.out.println("Resultado de (A*B == 15) && (A+B+C < 0): " + expresionEvaluada);

        // =======================================================================================
        // 5. OPERADOR TERNARIO (EXPRESIÓN CONDICIONAL)
        // =======================================================================================

        System.out.println("\n=== 5. OPERADOR TERNARIO ===");

        // Estructura: (condición booleana) ? valor_si_verdadero : valor_si_falso
        double nota = 6.5;
        String estadoAlumno = (nota >= 6.0) ? "Aprobado" : "Reprobado";

        int numero = 7;
        String paridad = (numero % 2 == 0) ? "Par" : "Impar";

        System.out.println("Evaluación de nota (6.5 >= 6.0): " + estadoAlumno);
        System.out.println("Evaluación de paridad (7 es par): " + paridad);
    }
}
