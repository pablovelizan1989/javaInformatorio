package guiaTrabajoPracticoNDos;

import java.util.Arrays;

public class OrdenarloTodo {
    public static void main(String[] args) {
        //Ordenarlo todo : Realizar un programa que guarde cierta cantidad de números con
        //punto decimal en un arreglo. Luego, el programa debe ordenar los números de
        //forma ascendente y mostrarlos en pantalla.

        double[] numeros = {1.5, 3.2, 2.1, 4.6};
        Arrays.sort(numeros);// lo ordenamos usando el método Arrays.sort()
        System.out.println(Arrays.toString(numeros));//El método Arrays.toString() de la clase Arrays en Java se utiliza para convertir un arreglo en una representación de cadena. Este método devuelve una cadena que contiene los elementos del arreglo separados por comas y encerrados entre corchetes ([])
    }
}
