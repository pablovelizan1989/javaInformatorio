package guiaTrabajoPracticoNUno;

public class ObtenerPorcentaje {
    public static void main(String[] args) {
        //Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el
        //porcentaje que indique el segundo número del primer número

        // Declaramos las variables y les asignamos valores
        double numeroReal = 75.6; // Este es el número real
        int numeroEntero = 15; // Este es el número entero
        double porcentaje; // Esta es la variable que almacenará el porcentaje

        // Calculamos el porcentaje usando la fórmula: porcentaje = (numeroEntero * 100) / numeroReal
        porcentaje = (numeroEntero * 100) / numeroReal;

        // Mostramos el resultado por pantalla con dos decimales
        System.out.printf("El %d%% de %.2f es %.2f%%\n", numeroEntero, numeroReal, porcentaje);
    }
}
