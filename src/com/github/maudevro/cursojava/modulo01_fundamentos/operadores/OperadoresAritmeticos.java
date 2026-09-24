package com.github.maudevro.cursojava.modulo01_fundamentos.operadores;

/**
 * Guía Técnica: Operadores Aritméticos y Matemáticos.
 * Este archivo demuestra las operaciones matemáticas básicas, el cálculo de potencias
 * y raíces, los operadores de asignación combinada, la concatenación de cadenas
 * y las reglas estrictas de precedencia (orden de evaluación).
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {

        // =======================================================================================
        // 1. OPERADORES ARITMÉTICOS BÁSICOS Y MÓDULO
        // =======================================================================================

        System.out.println("=== 1. OPERADORES BÁSICOS ===");
        int suma = 10 + 5;
        int resta = 10 - 5;
        int multiplicacion = 10 * 5;
        int division = 10 / 5;

        // El operador Módulo (%) devuelve el RESTO de una división entera.
        // Ejemplo: 5 dividido 4 es 1, y sobra 1. Ese sobrante es el módulo.
        int modulo = 5 % 4;

        System.out.println("Suma (10 + 5): " + suma);
        System.out.println("Resta (10 - 5):" + resta);
        System.out.println("Multiplicación (10 * 5): " + multiplicacion);
        System.out.println("División (10 / 5):" + division);
        System.out.println("Módulo (5 % 4): " + modulo);

        // =======================================================================================
        // 2. POTENCIAS Y RAÍCES (Uso de java.lang.Math)
        // =======================================================================================

        System.out.println(" === 2. POTENCIAS Y RAÍCES ===");

        // En Java se usa Math.pow(base, exponente) para calcular la potencia.
        // Devuelve siempre un valor de tipo double.
        double potencia = Math.pow(2, 3); // 2 elevado a la 3

        // Las raíces se consideran una exponenciación fraccionaria.
        // Raíz cuadrada de 9 es igual a 9 elevado a (1/2).
        double raizCuadrada = Math.pow(9, 1.0 / 2.0);

        System.out.println("Potencia (2 elevado a la 3): " + potencia);
        System.out.println("Raiz cuadrada de 9 :" + raizCuadrada);

        // =======================================================================================
        // 3. OPERADORES DE ASIGNACIÓN COMBINADA
        // =======================================================================================

        System.out.println("\n=== 3. ASIGNACIÓN COMBINADA ===");

        int a = 10;
        System.out.println("Valor inicial de 'a': " + a);

        a += 5; // Equivalente a: a = a + 5
        System.out.println("Después de a += 5: " + a); // 15

        a *= 2; // Equivalente a: a = a * 2
        System.out.println("Después de a *= 2: " + a); // 30

        // =======================================================================================
        // 4. PRECEDENCIA Y ORDEN DE EVALUACIÓN
        // =======================================================================================

        System.out.println("\n=== 4. PRECEDENCIA MATEMÁTICA ===");

        // Orden: 1) Paréntesis 2) Potencias 3) Multiplicación/División 4) Suma/Resta
        // Operadores de igual precedencia se evalúan de izquierda a derecha.

        // Evaluación del ejemplo del documento: 1 + 2 ** 3 / 4 * 5
        // Paso 1: Math.pow(2,3) = 8.0
        // Paso 2: 8.0 / 4 = 2.0
        // Paso 3: 2.0 * 5 = 10.0
        // Paso 4: 1 + 10.0 = 11.0
        double resultadoPrecedencia = 1 + Math.pow(2, 3) / 4 * 5;

        // El uso de paréntesis altera el orden natural
        double resultadoConParentesis = (1 + Math.pow(2, 3)) / (4 * 5);

        System.out.println("Evaluación natural (1 + 8 / 4 * 5): " + resultadoPrecedencia);
        System.out.println("Alterado con paréntesis ((1 + 8) / 20): " + resultadoConParentesis);

        // =======================================================================================
        // 5. CONCATENACIÓN DE CADENAS (Uso del operador '+')
        // =======================================================================================

        System.out.println("\n=== 5. CONCATENACIÓN DE TEXTO ===");

        // El operador '+' se sobrecarga: si los operandos son números, suma; si son Strings, une.
        String frase = "Un divertido " + "programa " + "de " + "radio";
        System.out.println("Resultado de concatenar cadenas: " + frase);
    }
}
