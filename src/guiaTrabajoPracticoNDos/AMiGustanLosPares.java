package guiaTrabajoPracticoNDos;

import java.util.Scanner;

public class AMiGustanLosPares {
    public static void main(String[] args) {
        //A mi me gustan los apres: Escribe un programa que imprima solo los N números
        //pares, donde los N números son guardados en variables o constantes según
        //corresponda.

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a imprimir: ");
        int n = sc.nextInt();
        System.out.println("Los primeros " + n + " números pares son:");
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
