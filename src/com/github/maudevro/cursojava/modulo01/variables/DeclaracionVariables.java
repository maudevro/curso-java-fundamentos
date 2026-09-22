 package com.github.maudevro.cursojava.modulo01.variables;

    /**
     * Guía Académica de Fundamentos de Variables en Java.
     * Este archivo demuestra la sintaxis de declaración, especificaciones de memoria,
     * tipos de datos primitivos y las reglas de asignación y reasignación de valores.
     */
    public class DeclaracionVariables {

        public static void main(String[] args) {

            // =========================================================================
            // 1. TIPOS PRIMITIVOS ENTEROS
            // =========================================================================
            // Almacenan números enteros sin decimales. Tienen un tamaño fijo en memoria.

            byte numeroByte = 100;           //  8 bits (1 byte)  | Rango: -128 a 127
            short numeroShort = 30000;       // 16 bits (2 bytes) | Rango: -32,768 a 32,767
            int numeroInt = 200000;          // 32 bits (4 bytes) | Rango: -2^31 a 2^31-1 (Predeterminado)
            long numeroLong = 15000000000L;  // 64 bits (8 bytes) | Rango: -2^63 a 2^63-1 (Requiere sufijo 'L')

            // Uso de guiones bajos para mejorar la legibilidad visual de números grandes
            int enteroSeparado = 1_000_000;

            System.out.println("=== 1. TIPOS PRIMITIVOS ENTEROS ===");
            System.out.println("Valor en un byte (8 bits): " + numeroByte);
            System.out.println("Valor en un short (16 bits): " + numeroShort);
            System.out.println("Valor en un int (32 bits): " + numeroInt);
            System.out.println("Valor int legible (con guiones): " + enteroSeparado);
            System.out.println("Valor en un long (64 bits): " + numeroLong);


            // =========================================================================
            // 2. TIPOS PRIMITIVOS DE PUNTO FLOTANTE (DECIMALES)
            // =========================================================================
            // Almacenan valores con precisión fraccionaria o decimal.

            float numeroFloat = 3.14f;       // 32 bits (4 bytes) | Precisión: ~6-7 dígitos (Requiere sufijo 'f')
            double numeroDouble = 3.1415926; // 64 bits (8 bytes) | Precisión: ~15 dígitos (Predeterminado)

            System.out.println("\n=== 2. TIPOS DE PUNTO FLOTANTE ===");
            System.out.println("Valor float (precisión simple): " + numeroFloat);
            System.out.println("Valor double (precisión doble): " + numeroDouble);


            // =========================================================================
            // 3. TIPOS PRIMITIVOS DE CARÁCTER Y LÓGICO
            // =========================================================================

            // char: Almacena un único carácter Unicode de 16 bits (2 bytes). Se delimita con comillas simples.
            char letraDirecta = 'A';
            char letraUnicode = '\u0041';    // Representación mediante código de escape Unicode para 'A'
            char letraAscii = 65;            // Representación mediante valor numérico de la tabla ASCII para 'A'

            // boolean: Almacena un estado lógico (verdadero o falso). No tiene un tamaño definido por especificación.
            boolean condicionVerdadera = true;
            boolean condicionFalsa = false;

            System.out.println("\n=== 3. CARACTERES Y LOGICOS ===");
            System.out.println("Carácter por asignación directa: " + letraDirecta);
            System.out.println("Carácter por código Unicode: " + letraUnicode);
            System.out.println("Carácter por correspondencia ASCII: " + letraAscii);
            System.out.println("Estado lógico verdadero: " + condicionVerdadera);
            System.out.println("Estado lógico falso: " + condicionFalsa);


            // =========================================================================
            // 4. DINÁMICA DE ASIGNACIÓN Y COMPORTAMIENTO DE LA MEMORIA
            // =========================================================================
            System.out.println("\n=== 4. COMPORTAMIENTO Y REASIGNACION ===");

            // Regla A: Una variable puede mutar o cambiar su valor en orden de ejecución
            int y = 2;
            int x = 3;
            System.out.println("Estado Inicial -> x: " + x + ", y: " + y);

            y = 8; // Reasignación destructiva: El valor antiguo (2) es reemplazado por el nuevo (8)
            System.out.println("Estado Post-Reasignación (y = 8) -> x: " + x + ", y: " + y);

            // Regla B: Asignación por copia de valor entre variables
            y = x; // El valor actual de 'x' (3) se copia en el espacio de memoria de 'y'
            System.out.println("Estado Post-Copia (y = x) -> x: " + x + ", y: " + y);

            x = 5; // Modificar la variable origen ('x') NO afecta la copia independiente guardada en 'y'
            System.out.println("Estado tras modificar origen (x = 5) -> x: " + x + ", y: " + y);

            // Regla C: Asignación mediante expresiones y operadores aritméticos
            int a = 2 + 2;   // Evaluación de valores literales estáticos
            int b = a + 1;   // Evaluación combinando el estado de una variable externa y un literal
            int c = b + a;   // Evaluación combinando múltiples variables dinámicas
            System.out.println("Resultados de expresiones matemáticas -> a: " + a + ", b: " + b + ", c: " + c);
        }
    }