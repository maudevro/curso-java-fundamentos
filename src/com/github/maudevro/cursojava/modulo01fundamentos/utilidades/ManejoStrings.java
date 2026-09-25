package com.github.maudevro.cursojava.modulo01fundamentos.utilidades;

/**
 * Guía Académica: La Clase String en Java.
 * Este archivo demuestra la inmutabilidad de las cadenas de texto,
 * el uso del "String Pool" en memoria y los métodos esenciales de manipulación.
 */

public class ManejoStrings {
    public static void main(String[] args) {

        // =========================================================================
        // 1. DECLARACIÓN E INMUTABILIDAD DE CADENAS DE TEXTO
        // =========================================================================

        // Un String representa una secuencia de caracteres inmutable.
        // Una vez creado, su contenido en memoria NO se puede modificar.
        String saludo = "Hola, mundo!";
        System.out.println("=== 1. DECLARACIÓN E INMUTABILIDAD ===");
        System.out.println("Saludo: " + saludo);

        // Demostración de inmutabilidad:
        // Intentar transformar el texto no cambia la variable original.
        saludo.toUpperCase();
        // Sigue en minúsculas porque toUpperCase() genera un NUEVO String en memoria.
        System.out.println("¿Cambió el original tras toUpperCase()?: " + saludo);

        // Para guardar el cambio, debes reasignar la variable o capturarla en una nueva:
        String saludoMayuscula = saludo.toUpperCase();
        System.out.println("Nuevo String capturado: " + saludoMayuscula);

        // =========================================================================
        // 2. MÉTODOS ESENCIALES DE LA CLASE STRING
        // =========================================================================

        System.out.println("\n=== 2. MÉTODOS DE MANIPULACIÓN ===");

        // .length(): Obtiene la longitud de la cadena (cantidad de caracteres, incluyendo espacios)
        int longitudCaracteres = saludo.length();
        System.out.println("Longitud de la cadena: " + longitudCaracteres);

        // .charAt(index): Obtiene el carácter que está en una posición específica (comienza en 0)
        char primerCaracter = saludo.charAt(0);
        System.out.println("El primer carácter (posición 0) es: " + primerCaracter);

        // .substring(desde, hasta): Extrae una porción del texto
        // Extrae desde el índice 0 hasta el 3 (el 4 queda excluido)
        String soloHola = saludo.substring(0, 4);
        System.out.println("Subcadena extraída: " + soloHola);

        // .contains(texto): Verifica si el texto contiene una palabra o frase (Devuelve boolean)
        boolean contieneMundo = saludo.contains("mundo");
        System.out.println("¿Contiene 'mundo'?: " + contieneMundo);

        // .replace(viejo, nuevo): Reemplaza caracteres o palabras completas
        String saludoConReemplazo = saludo.replace("mundo", "Java");
        System.out.println("Saludo con reemplazo: " + saludoConReemplazo);

        // =========================================================================
        // 3. COMPARACIÓN CORRECTA DE STRINGS
        // =========================================================================

        System.out.println("\n=== 3. COMPARACIÓN DE CADENAS ===");
        String texto1 = "Java";
        String texto2 = "Java";
        // Fuerza la creación de un objeto distinto en memoria
        String texto3 = new String("Java");

        // ❌ ERROR COMÚN: Comparar con '=='
        // El operador '==' compara las DIRECCIONES DE MEMORIA, no el contenido del texto.
        // Da true por optimización interna (String Pool)
        System.out.println("¿texto1 == texto2?: " + (texto1 == texto2));
        // Da FALSE aunque ambos dicen "Java"
        System.out.println("¿texto1 == texto3?: " + (texto1 == texto3));

        // ✔️ FORMA CORRECTA: Método .equals()
        // El método .equals() compara el CONTENIDO carácter por carácter
        // Da TRUE
        System.out.println("Forma correcta: ¿texto1.equals(texto3)?: " + texto1.equals(texto3));
    }
}
