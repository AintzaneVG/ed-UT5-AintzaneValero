public class Calendario {
    // atributos privados para almacenar la fecha
    private int anyo;
    private int mes;
    private int dia;

    // constructor valida la fecha antes de asignar valores
    public Calendario(int anyo, int mes, int dia) {
        if (esFechaValida(anyo, mes, dia)) {
            this.anyo = anyo;
            this.mes = mes;
            this.dia = dia;
        } else {
            System.out.println("Fecha incorrecta. Se asignará la fecha por defecto (1/1/2000");
            this.anyo = 2000;
            this.mes = 1;
            this.dia = 1;
        }
    }

    // valida si la fecha es correcta
    private boolean esFechaValida(int anyo, int mes, int dia) {
        if (anyo <= 0 || mes <1 || mes > 12 || dia < 1) {
            return false;
        }
        return dia <= diaDelMes(mes);
    }

    // devuelve el número de días en un mes
    private int diaDelMes(int mes) {
        switch (mes){
            case 4: case 6: case 9: case 11: // meses con 30 días
                return 30;
            case 2: // febrero con 28 días (no consideramos bisiestos)
                return 28;
            default: // meses con 31 días
                return 31;
        }
    }

    // incrementa el día, ajusta el mes y el año si es necesario
    public void incrementarDia() {
        dia ++;
        if (dia > diaDelMes(mes)) {
            dia= 1;
            incrementarMes();
        }
    }

    // incrementa el mes, ajusta el año si lo necesita
    public void incrementarMes() {
        mes ++;
        if (mes > 12) {
            mes = 1;
            incrementarAnyo(1);
        }
    }

    // incrementa el año
    public void incrementarAnyo(int cantidad) {
        if (cantidad > 0) {
            anyo += cantidad;
        } else {
            System.out.println("El incremento de años debe seer positivo.");
        }
    }

    // muestra la fecha en formato legible
    public void mostrar () {
        System.out.println("Fecha: " + dia + "/" + mes + "/" + anyo);
    }

    // compara dos fechas para determinar si son iguales
    public boolean iguales(Calendario otraFecha) {
        return this.anyo == otraFecha.anyo &&
                this.mes == otraFecha.mes &&
                this.dia == otraFecha.dia;
    }
}
