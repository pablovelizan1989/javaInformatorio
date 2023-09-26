package guiaTrabajoPracticoNDos;

import java.util.Scanner;

public class LaSumaDeLosPrimeros {
    public static void main(String[] args) {
        //La suma de los primeros: Realizar un programa que calcule la suma de los
        //primeros N números naturales, donde N es un número entero guardado en memoria.

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero para sumar");
        int n = sc.nextInt();
        int suma = 0;

        for (int i = 0; i < n; i++) {
            suma += i;
        }
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
    }
}
