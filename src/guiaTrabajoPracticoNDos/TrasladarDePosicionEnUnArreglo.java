package guiaTrabajoPracticoNDos;

import java.util.Arrays;

public class TrasladarDePosicionEnUnArreglo {
    public static void main(String[] args) {
        // Trasladar posiciones en un arreglo: Dado un arreglo de enteros, una posición del
        //arreglo y la cantidad de N traslados a hacer en un arreglo. Lo que debe hacer es
        //tomar el elemento de la posición del arreglo y trasladarlo N cantidad de veces, si el
        //traslado es mayor al tamaño del arreglo informar por pantalla.

        int[] arreglo = {1, 2, 3, 4, 5};
        int posicion = 2;
        int traslados = 3;

        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        trasladarPosicion(arreglo, posicion, traslados);
    }

    public static void trasladarPosicion(int[] arreglo, int posicion, int traslados) {
        if (traslados > arreglo.length) {
            System.out.println("El número de traslados es mayor al tamaño del arreglo.");
            return;
        }

        int elemento = arreglo[posicion];
        for (int i = 0; i < traslados; i++) {
            for (int j = posicion; j < arreglo.length - 1; j++) {
                arreglo[j] = arreglo[j + 1];
            }
            arreglo[arreglo.length - 1] = elemento;
        }

        System.out.println("Arreglo después de " + traslados + " traslados: " + Arrays.toString(arreglo));
    }
}

