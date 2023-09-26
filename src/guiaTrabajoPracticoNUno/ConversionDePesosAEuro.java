package guiaTrabajoPracticoNUno;

import java.util.Scanner;

public class ConversionDePesosAEuro {
    public static void main(String[] args) {
        //Conversión de pesos a euros: Escribir un programa en Java que solicite al usuario
        //una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de
        //cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario
        //ingresa 5000 pesos, el programa deberá mostrar 250 euros.

        final double TASA_FIJA = 20;

        System.out.println("ingrese la cantidad de pesos que quiere cambiar: ");
        Scanner scanner = new Scanner(System.in);
        double pesos = scanner.nextDouble();

        double euro = pesos / TASA_FIJA;
        System.out.println("lo que podes cambiar son "+ euro);



    }
}
