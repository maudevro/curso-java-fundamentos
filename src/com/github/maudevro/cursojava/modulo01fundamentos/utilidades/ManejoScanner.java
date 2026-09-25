package com.github.maudevro.cursojava.modulo01fundamentos.utilidades;

import java.util.Scanner;

/**
 * Guía Técnica: Entrada de Datos con la Clase Scanner.
 * Este archivo demuestra la instanciación de Scanner para lectura desde la consola (System.in),
 * la recolección de distintos tipos primitivos y cadenas de texto, el manejo del buffer
 * de entrada (el clásico problema del salto de línea) y la liberación de recursos.
 */
public class ManejoScanner {

    public static void main(String[] args) {

        // =======================================================================================
        // 1. INSTANCIACIÓN DEL SCANNER
        // =======================================================================================

        // Especificación: Se crea un objeto Scanner asociado al flujo de entrada estándar del sistema.
        // System.in representa el teclado en la consola.
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 1. LECTURA DE TEXTO (Cadenas completas) ===");
        System.out.println("Ingrese su nombre:");
        // nextLine() lee toda la línea hasta que el usuario presiona Enter.
        String nombreCompleto = scanner.nextLine();
        System.out.println("Registrado: " + nombreCompleto);

        // =======================================================================================
        // 2. LECTURA DE TIPOS PRIMITIVOS
        // =======================================================================================

        System.out.println("\n=== 2. LECTURA DE DATOS NUMÉRICOS ===");
        System.out.println("Ingrese su edad en años (entero): ");
        // nextInt() espera estrictamente un valor de tipo int.
        int edad = scanner.nextInt();

        System.out.println("Ingrese su altura en metros (ej. 1,75 o 1.75 dependiendo de tu región):");
        // nextDouble() lee un número con precisión decimal.
        // Nota técnica: Scanner utiliza la configuración regional (Locale) del SO,
        // por lo que el separador decimal esperado puede ser una coma (,) o un punto (.)
        double altura = scanner.nextDouble();

        System.out.println("Registrado - Edad: " + edad + " | Altura: " + altura);

        // =======================================================================================
        // 3. EL COMPORTAMIENTO DEL BUFFER Y EL SALTO DE LÍNEA
        // =======================================================================================

        System.out.println("\n=== 3. MANEJO DEL BUFFER (TRAMPA COMÚN) ===");

        // ⚠️ EXPLICACIÓN DEL PROBLEMA:
        // Métodos como nextInt() o nextDouble() leen el número, pero dejan el carácter
        // de "Enter" (salto de línea o \n) en el buffer de entrada.
        // Si llamamos a nextLine() inmediatamente después, leerá ese "Enter" residual
        // y saltará la entrada, asumiendo que el usuario ingresó una cadena vacía.

        // ✔️ SOLUCIÓN: Limpiar el buffer consumiendo el salto de línea residual.
        scanner.nextLine();

        System.out.print("Ingresa tu lenguaje de programación favorito: ");
        // Ahora nextLine() funcionará correctamente y esperará la entrada del usuario.
        String lenguaje = scanner.nextLine();
        System.out.println("Lenguaje registrado: " + lenguaje);

        // =======================================================================================
        // 4. CIERRE Y LIBERACIÓN DE RECURSOS
        // =======================================================================================

        System.out.println("\n=== 4. LIBERACIÓN DE RECURSOS ===");
        // Es una buena práctica liberar el recurso cuando ya no se va a leer más de la consola.
        // Advertencia: Cerrar un Scanner conectado a System.in cerrará permanentemente
        // el flujo de entrada para toda la aplicación durante esa ejecución.
        scanner.close();
        System.out.println("El objeto Scanner ha sido cerrado exitosamente.");
    }
}
