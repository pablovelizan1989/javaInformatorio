package guiaTrabajoPracticoNUno;

import java.util.Scanner;

public class CalculoDeLaHipotenusaDeUnTriangulo {
    public static void main(String[] args) {
        //Cálculo de la hipotenusa de un triángulo:
        //Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
        //dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
        //hipotenusa, a y b son los catetos

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del primer cateto: ");
        double catetoA = scanner.nextDouble();
        System.out.print("Ingrese el valor del segundo cateto: ");
        double catetoB = scanner.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        System.out.println("La hipotenusa del triángulo rectángulo con catetos " + catetoA + " y " + catetoB + " es " + hipotenusa);
    }
}
