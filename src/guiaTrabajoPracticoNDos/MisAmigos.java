package guiaTrabajoPracticoNDos;

import java.util.Scanner;

public class MisAmigos {
    public static void main(String[] args) {
        // Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre
        //esa cantidad mostrando el nombre de cada amigo.

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de amigos que son: ");
        int n = sc.nextInt(); //Luego, pedimos al usuario que ingrese la cantidad de amigos y almacenamos ese valor en una variable entera llamada n.
        sc.nextLine();
        String [] amigos = new String[n];//Después de leer la cantidad de amigos, creamos un arreglo de tipo String llamado amigos con una longitud igual a la cantidad de amigos ingresada por el usuario.

        for (int i = 0; i < n; i++) {
            System.out.println("ingre el nombre del amigo " + (i +1) + ": ");//A continuación, usamos un bucle for para pedir al usuario que ingrese el nombre de cada amigo. Cada vez que el usuario ingresa un nombre, lo almacenamos en el arreglo amigos en la posición correspondiente.
            amigos [i] = sc.nextLine();
        }
        System.out.println("Tus amigos son:");

        for (String amigo:       //Finalmente, usamos un bucle for-each para iterar sobre cada elemento del arreglo amigos y mostrar cada nombre en la consola.
             amigos) {
            System.out.println(amigo);
        }
    }
}
