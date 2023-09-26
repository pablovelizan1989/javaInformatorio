package guiaTrabajoPracticoNDos;

import java.util.Scanner;

public class YMasSumas {
    public static void main(String[] args) {
        //Y mas… sumas! : Realizar un programa donde se guarde un número entero en una
        //variable y que imprima por pantalla el resultado de la suma de todos los números
        //enteros desde 1 hasta ese número.

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("La suma de todos los números enteros desde 1 hasta " + n + " es: " + suma);
    }
}
