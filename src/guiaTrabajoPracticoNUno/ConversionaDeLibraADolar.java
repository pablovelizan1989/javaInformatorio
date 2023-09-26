package guiaTrabajoPracticoNUno;

import java.util.Scanner;

public class ConversionaDeLibraADolar {
    public static void main(String[] args) {
        //Conversión de libras esterlinas a dólares: Escribir un programa en Java que
        //solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
        //dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1
        //libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa
        //deberá mostrar 70 dólares.

        final double TASA_FIJA = 1.40;

        System.out.println("ingrese la cantidad de libra que quiere cambiar");
        Scanner scanner = new Scanner(System.in);
        double libra = scanner.nextDouble();

        double dolar = libra * TASA_FIJA;
        System.out.println("la cantidad de dolares que podes cambiar es " + dolar);
    }
}
