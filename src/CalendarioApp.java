public class CalendarioApp {
    public static void main(String[] args) {
        // crear objetos calendario
        Calendario fecha1 = new Calendario(2023, 10, 21);
        Calendario fecha2 = new Calendario(2022, 12, 31);

        // Mostrar fechas iniciales
        System.out.println("Fechas iniciales:");
        fecha1.mostrar();
        fecha2.mostrar();

        // Incrementar días y mostrar resultados
        System.out.println("\nIncrementar 1 día a fecha1:");
        fecha1.incrementarDia();
        fecha1.mostrar();

        System.out.println("\nIncrementar 1 día a fecha2:");
        fecha2.incrementarDia();
        fecha2.mostrar();

        // Incrementar mes y mostrar resultado
        System.out.println("\nIncrementar 1 mes a la fecha1:");
        fecha1.incrementarMes();
        fecha1.mostrar();

        // Incrementar año y mostrar resultado
        System.out.println("\nIncrementar 2 años a fecha2:");
        fecha2.incrementarAnyo(2);
        fecha2.mostrar();

        // Comparar fechas
        System.out.println("\n¿Fecha1 y Fecha2 son iguales?");
        System.out.println(fecha1.iguales(fecha2)? "Sí, son iguales." : "No, son distintas.");
    }
}
