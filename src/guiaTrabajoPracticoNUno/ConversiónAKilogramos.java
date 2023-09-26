package guiaTrabajoPracticoNUno;

public class ConversiónAKilogramos {
    // Constante para el factor de conversión de libras a kilogramos
    public static final double FACTOR_CONVERSION = 0.45359237;

    public static void main(String[] args) {
        //Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
        //otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
        //una constante de los valores que no van a cambiar en esta conversión. Muestre el
        //resultado por pantalla

        // Variable para guardar el valor de las libras
        double libras = 150;
        // Variable para realizar la conversión a kilogramos
        double kilogramos = libras * FACTOR_CONVERSION;
        // Mostrar el resultado por pantalla con un mensaje
        System.out.println(libras + " libras equivalen a " + kilogramos + " kilogramos.");
    }
}
