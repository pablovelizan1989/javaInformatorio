package guiaTrabajoPracticoNDos;

import java.util.Scanner;

public class ElFactorial {
    public static void main(String[] args) {
        //El factorial : Realizar un programa que calcule el factorial de un número.

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);

    }
}
