package guiaTrabajoPracticoNDos;

import java.util.Scanner;

public class MisAmigosYSuEdad {
    public static void main(String[] args) {
        //Mis amigos y su edad: Guarda en variables el nombre de N cantidad de amigos,
        //itere sobre esa cantidad luego muestre el nombre de cada amigo si y sólo si este
        //amigo es mayor de edad, en caso de ser menor de edad imprima un mensaje
        //diciendole a ese amigo porque no lo muestra por pantalla.

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de amigos: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] nombres = new String[n];
        int[] edades = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del amigo " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.print("Ingrese la edad del amigo " + (i + 1) + ": ");
            edades[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Tus amigos mayores de edad son:");
        for (int i = 0; i < n; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i]);
            } else {
                System.out.println(nombres[i] + " es menor de edad");
            }
        }
    }
}
