package com.github.maudevro.cursojava.modulo01_fundamentos.variables;

/**
 *  Guía Académica de Fundamentos de Variables en Java.
 *  Este archivo demuestra la sintaxis de declaración, especificaciones de memoria,
 *  tipos de datos primitivos y las reglas de asignación y reasignación de valores.
 */

    public class DeclaracionVariables {

    public static void main(String[] args) {

        // =========================================================================
        // 1. TIPOS PRIMITIVOS ENTEROS
        // =========================================================================

        // Almacenan números enteros sin decimales. Tienen un tamaño fijo en memoria.

        byte numeroByte = 127; // 8 bits (1 byte) | Rango: -128 a 127
        short numeroShort = 32767; // 16 bits (2 bytes) | Rango: -32768 a 32767
        int numeroInt = 2147483647; // 32 bits (4 bytes) | Rango: -2147483648 a 2147483647
        long numeroLong = 9223372036854775807L; // Requiere sufijo 'L'
        // 64 bits (8 bytes) | Rango: -9223372036854775808 a 9223372036854775807

        // Uso de guiones bajos para mejorar la legibilidad visual de números grandes
        int numeroEnteroGrande = 1_000_000_000;

        System.out.println("=== 1. TIPOS PRIMITIVOS ENTEROS ===");
        System.out.println("Valor en un byte (8 bits): " + numeroByte);
        System.out.println("Valor en un short (16 bits): " + numeroShort);
        System.out.println("Valor en un int (32 bits): " + numeroInt);
        System.out.println("Valor en un long (64 bits): " + numeroLong);
        System.out.println("Valor en un entero grande (32 bits): " + numeroEnteroGrande);


        // =========================================================================
        // 2. TIPOS PRIMITIVOS DE PUNTO FLOTANTE (DECIMALES)
        // =========================================================================

        // Almacenan valores con precisión fraccionaria o decimal.

        float numeroFloat = 3.14f; // Requiere sufijo 'f'
        // 32 bits (4 bytes) | Rango: 1.4E-45 a 3.4E+38
        // Precisión: ~6-7 dígitos
        double numeroDouble = 3.1415926; // 64 bits (8 bytes) | Rango: 4.9E-324 a 1.8E+308
        // Precisión: ~15 dígitos

        System.out.println("\n=== 2. TIPOS PRIMITIVOS DE PUNTO FLOTANTE (DECIMALES) ===");
        System.out.println("Valor en un float (32 bits): " + numeroFloat);
        System.out.println("Valor en un double (64 bits): " + numeroDouble);


        // =========================================================================
        // 3. TIPOS PRIMITIVOS DE CARÁCTER Y LÓGICO
        // =========================================================================

        // char: Almacena un único caracter Unicode de 16 bits (2 bytes).
        // Se delimita con comillas simples.

        char letraDirecta = 'A';
        char letraUnicode = '\u0041'; // Representación mediante código de escape Unicode para 'A'
        char letraAscii = 65; // Representación mediante valor numérico de la tabla ASCII para 'A'

        // boolean: Almacena un estado lógico (verdadero o falso).
        // No tiene un tamaño definido por especificación.

        boolean condicionVerdadera = true;
        boolean condicionFalsa = false;

        System.out.println("\n=== 3.CARACTERES Y LOGICOS ===");
        System.out.println("Caracter por asignación directa: " + letraDirecta);
        System.out.println("Caracter por código Unicode: " + letraUnicode);
        System.out.println("Caracter por correspondencia ASCII: " + letraAscii);
        System.out.println("Estado lógico verdadero: " + condicionVerdadera);
        System.out.println("Estado lógico falso: " + condicionFalsa);


        // =========================================================================
        // 4. DINÁMICA DE ASIGNACIÓN Y COMPORTAMIENTO DE LA MEMORIA
        // =========================================================================

        System.out.println("\n=== 4. COMPORTAMIENTO Y REASIGNACION ===");

        // Regla A: Una variable puede mutar o cambiar su valor en orden de ejecución

        int y = 2;
        int x = 3;
        System.out.println("Estado Inicial: x = " + x + ", y = " + y);

        y = 8; // Reasignación destructiva: El valor antiguo (2) es reemplazado por el nuevo (8)
        System.out.println("Estado Post-Reasignación (y = 8): x = " + x + ", y = " + y);


        // Regla B: Asignación por copia de valor entre variables

        y = x; // El valor actual de 'x' (3) se copia en el espacio de memoria de 'y'
        System.out.println("Estado Post-Copia (y = x): x = " + x + ", y = " + y);

        x = 5; // Modificar la variable origen ('x') NO afecta la copia independiente guardada en 'y'
        System.out.println("Estado tras modificar origen (x = 5): x = " + x + ", y = " + y);


        // Regla C: Asignación mediante expresiones y operadores aritméticos

        int a = 2 + 2; // Evaluación de valores literales estáticos
        int b = a + 1; // Evaluación combinando el estado de una variable externa y un literal
        int c = b + a; // Evaluación combinando múltiples variables dinámicas
        System.out.println("Resultados de expresiones matemáticas: a = " + a + ", b = " + b + ", c = " + c);


    }

}
