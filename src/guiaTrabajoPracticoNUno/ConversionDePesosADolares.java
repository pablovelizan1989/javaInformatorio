package guiaTrabajoPracticoNUno;

import java.util.Scanner;

public class ConversionDePesosADolares {
    public static void main(String[] args) {
        //Conversión de dólares a pesos: Escribir un programa en Java que solicite al
        //usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
        //tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
        //usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.

        final double TASA_DE_CAMBIO = 478; // Esta es la tasa de cambio fija
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cantidad en dólares: ");
        double dolares = scanner.nextDouble();
        double pesos = dolares * TASA_DE_CAMBIO;
        System.out.println(dolares + " dólares son " + pesos + " pesos");

    }
}
