package guiaTrabajoPracticoNDos;

import java.util.Scanner;

public class SumaDelRangoDeNumeros {
    public static void main(String[] args) {
        //Suma del rango de números : Escribir un programa que encuentre la suma de los
        //números impares en un rango de números enteros guardados en una variable.

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el límite inferior del rango: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el límite superior del rango: ");
        int b = sc.nextInt();
        int suma = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los números impares en el rango [" + a + ", " + b + "] es: " + suma);
    }
}
