package guiaTrabajoPracticoNDos;

import java.util.Arrays;

public class InversionDeUnArreglo {
    public static void main(String[] args) {
        //Inversión de un arreglo: Dado un arreglo de enteros inviertalo, de tal manera que
        //el primer elemento ahora sea el último y así sucesivamente.

        int[] arreglo = {1, 2, 3, 4, 5};

        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        invertirArreglo(arreglo);
        System.out.println("Arreglo invertido: " + Arrays.toString(arreglo));
    }
    public static void invertirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length / 2; i++) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
    }
}
