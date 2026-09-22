package com.github.maudevro.cursojava.modulo01.variables;

// Importaciones requeridas para las APIs de tiempo (Modernas y Legadas)
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Calendar;

/**
 * Guía Técnica: API de Gestión de Fechas y Tiempos en Java.
 * Demuestra el uso de la API moderna inmutable (java.time) introducida en Java 8
 * frente a los componentes mutables clásicos (java.util), analizando sus
 * especificaciones de diseño, operaciones y flujos de conversión de tipos.
 */
public class ManejoFechas {

    public static void main(String[] args) {

        // =========================================================================
        // 1. API MODERNA (java.time.LocalDate) - INTRODUCIDA EN JAVA 8
        // =========================================================================
        // Especificación: Representa una fecha en formato ISO (aaaa-MM-dd) sin zona
        // horaria ni información de hora. Posee diseño inmutable (Thread-Safe).

        // Métodos de Instanciación
        LocalDate fechaActual = LocalDate.now();                     // Captura el estado temporal del sistema
        LocalDate fechaEspecifica = LocalDate.of(2024, 1, 1);       // Instanciación por parámetros estáticos (Año, Mes, Día)
        LocalDate fechaDesdeTexto = LocalDate.parse("2024-01-01");   // Parseo de cadena de texto bajo estándar ISO

        System.out.println("=== 1. API MODERNA: LOCALDATE ===");
        System.out.println("Instancia actual (now): " + fechaActual);
        System.out.println("Instancia específica (of): " + fechaEspecifica);
        System.out.println("Instancia parseada (parse): " + fechaDesdeTexto);

        // API Fluent: Mutaciones estructurales (Devuelven nuevas instancias en memoria)
        LocalDate mañana = fechaActual.plusDays(1);
        LocalDate ayer = fechaActual.minusDays(1);
        LocalDate mesSiguiente = fechaActual.plusMonths(1);
        LocalDate siguienteAnio = fechaActual.withYear(2025); // Ajuste absoluto del campo año

        System.out.println("\n--- Operaciones Temporales (Inmutabilidad) ---");
        System.out.println("Adición de días (+1): " + mañana);
        System.out.println("Sustracción de días (-1): " + ayer);
        System.out.println("Adición de meses (+1): " + mesSiguiente);
        System.out.println("Ajuste estructural de año (with): " + siguienteAnio);

        // Operaciones de Evaluación y Extracción de Datos
        boolean esAntes = fechaActual.isBefore(LocalDate.of(2025, 1, 1));
        boolean esDespues = fechaActual.isAfter(LocalDate.of(2020, 1, 1));

        System.out.println("\n--- Evaluación de Predicados ---");
        System.out.println("Evaluación isBefore: " + esAntes);
        System.out.println("Evaluación isAfter: " + esDespues);
        System.out.println("Extracción año (getYear): " + fechaActual.getYear());
        System.out.println("Extracción mes (getMonth): " + fechaActual.getMonth());
        System.out.println("Extracción día (getDayOfMonth): " + fechaActual.getDayOfMonth());


        // =========================================================================
        // 2. CLASE PERIOD (Manejo de Intervalos de Tiempo Basados en Fechas)
        // =========================================================================
        // Especificación: Modela una cantidad de tiempo en escala de años, meses y días.
        // Utiliza únicamente las discrepancias de fechas sin evaluar unidades de tiempo menor.

        LocalDate fechaNacimiento = LocalDate.of(1993, 5, 15);
        Period intervaloEdad = Period.between(fechaNacimiento, fechaActual); // Evaluación del delta temporal

        System.out.println("\n=== 2. CONTROL DE INTERVALOS: PERIOD ===");
        System.out.println("Métricas de intervalo acumulado:");
        System.out.println("Años: " + intervaloEdad.getYears());
        System.out.println("Meses: " + intervaloEdad.getMonths());
        System.out.println("Días: " + intervaloEdad.getDays());


        // =========================================================================
        // 3. APIS LEGADAS (java.util.Date y java.util.Calendar) - DEPRECATED / LEGACY
        // =========================================================================
        // Deficiencias de diseño: Son estructuras mutables (inseguras en multihilo)
        // y con APIs poco intuitivas. Miden el tiempo basándose en milisegundos Unix.

        // Componente Date (Java 1.0)
        Date fechaLegacy = new Date(); // Representa el punto exacto en milisegundos desde la Epoch (01/01/1970)

        // Componente Calendar (Java 1.1)
        Calendar calendarioLegacy = Calendar.getInstance(); // Inicializa una fábrica basada en la zona horaria del sistema

        System.out.println("\n=== 3. APIS LEGADAS (MANTENIMIENTO DE CÓDIGO) ===");
        System.out.println("Estado de objeto Date clásico: " + fechaLegacy);
        System.out.println("Estado de objeto Calendar (Milisegundos Unix): " + calendarioLegacy.getTimeInMillis());


        // =========================================================================
        // 4. INTEROPERABILIDAD Y CONVERSIÓN DE APIS
        // =========================================================================
        // Flujo técnico para procesar objetos clásicos en aplicaciones modernas:
        // Date -> Instant (Línea de tiempo pura) -> ZoneId (Región) -> LocalDate
        LocalDate conversionDesdeLegacy = fechaLegacy.toInstant()
                .atZone(java.time.ZoneId.systemDefault())
                .toLocalDate();

        System.out.println("\n=== 4. INTEROPERABILIDAD ===");
        System.out.println("Resultado de conversión estructural: " + conversionDesdeLegacy);
    }
}
