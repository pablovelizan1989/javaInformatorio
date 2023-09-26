package guiaTrabajoPracticoNDos;

import java.util.Scanner;

public class SumaDeNumeros {
    public static void main(String[] args) {


        //Suma de números : Realizar un programa que guarde un número en memoria y
        //determine si es par o impar.
        System.out.println("ingrese un numero: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }
    }
}

