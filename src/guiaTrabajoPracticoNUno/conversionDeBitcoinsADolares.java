package guiaTrabajoPracticoNUno;

import java.util.Scanner;

public class conversionDeBitcoinsADolares {

    public static void main(String[] args) {
        //Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al
        //usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
        //tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
        //dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares

        final double TASA_FIJA = 50000;

        System.out.println("ingrese la cantidad de bitcoins que quiere cambiar: ");
        Scanner scanner = new Scanner(System.in);
        double bitcoins = scanner.nextDouble();

        double dolar = bitcoins * TASA_FIJA;
        System.out.println("la cantidad que puede recibir es " + dolar);
    }
}
