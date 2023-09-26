package guiaTrabajoPracticoNDos;

import java.util.Scanner;


public class EsperoAprobar {
    public static void main(String[] args) {
        //Espero aprobar : Escribe un programa que imprima un título para el programa,
        //luego un listado (Seguido, NO con saltos de línea) de las N notas de mis exámenes,
        //donde los N números son guardados en variables o constantes según corresponda.
        //Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con
        //cuanto

        Scanner sc = new Scanner(System.in);
        System.out.println("Programa para calcular el promedio de notas");
        System.out.print("Ingrese la cantidad de exámenes: ");
        int n = sc.nextInt();
        double[] notas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota del examen " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        System.out.print("Tus notas son: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double promedio = suma / n;
        System.out.println("\nTu promedio es: " + promedio);
        if (promedio >= 6) {
            System.out.println("Aprobaste con " + promedio);
        } else {
            System.out.println("No aprobaste. Tu nota es " + promedio);
        }
    }
}
