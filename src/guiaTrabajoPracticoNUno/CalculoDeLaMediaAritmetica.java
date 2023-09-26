package guiaTrabajoPracticoNUno;

import java.util.Scanner;

public class CalculoDeLaMediaAritmetica {
    public static void main(String[] args) {
        //Cálculo de la media aritmética:
        //Escribir un programa en Java que calcule la media aritmética de un conjunto de
        //números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
        //los números y k es el número total de elementos. Utilicen variables y constantes
        //según corresponda.
        //Muestre el resultado por pantalla.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();
        double suma = 0;
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }
        double media = suma / cantidadNumeros;
        System.out.println("La media aritmética de los " + cantidadNumeros + " números ingresados es " + media);
    }
}
