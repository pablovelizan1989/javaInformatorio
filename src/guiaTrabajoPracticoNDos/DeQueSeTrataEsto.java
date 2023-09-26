package guiaTrabajoPracticoNDos;
import java.util.Scanner;

public class DeQueSeTrataEsto {
    public static void main(String[] args) {
        //De que se trata esto? : Realizar un programa que guarde un número en memoria y
        //determine si es positivo, negativo o cero.

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
}
