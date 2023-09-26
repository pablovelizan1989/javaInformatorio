package guiaTrabajoPracticoNUno;

import java.util.Scanner;

public class ConversionDeGradosCelsiusAGradoFahrenheit {
    public static void main(String[] args) {
        //Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en
        //Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar
        //la fórmula con la que se resuelve.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit");
    }
}
