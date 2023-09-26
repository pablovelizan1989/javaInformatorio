package guiaTrabajoPracticoNUno;
import java.util.Scanner;
public class ConversionDeEuroADolar {
    public static void main(String[] args) {
        //Conversión de euros a dólares: Escribir un programa en Java que solicite al
        //usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
        //tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
        //el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares.

        final double TASA_DE_CAMBIO= 1.20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de euro: ");
        double euro = scanner.nextDouble();

        double dolar = euro * TASA_DE_CAMBIO;
        System.out.println("Los dolares que podria recibir son: " + dolar);

    }
}
