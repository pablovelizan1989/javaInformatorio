package guiaTrabajoPracticoNDos;

import java.util.Arrays;

public class EliminacionDeUnElemento   {
    public static void main(String[] args) {
        // Eliminación de un elemento: Dado un arreglo con valores enteros, realice la
        //búsqueda de ese entero y si lo encuentra eliminarlo, si no lo encuentra informe por
        //pantalla.

        int[] arreglo = {1, 2, 3, 4};
        int valor = 3;
        boolean encontrado = false;

        for (int i = 0; i < arreglo.length; i++) {// creamos un arreglo de enteros llamado arreglo y usamos su atributo length para obtener su longitud. Luego, imprimimos la longitud del arreglo en la consola. El resultado será Longitud del arreglo: 4, ya que el arreglo contiene 4 elementos.
            if (arreglo[i] == valor) {
                encontrado = true; //la línea encontrado = true; simplemente cambia el valor de la variable booleana encontrado a true para indicar que hemos encontrado el valor buscado en el arreglo.
                for (int j = i; j < arreglo.length - 1; j++) {
                    arreglo[j] = arreglo[j + 1];
                }
                break;
            }
        }

        if (encontrado) {
            arreglo = Arrays.copyOf(arreglo, arreglo.length - 1);//la línea arreglo = Arrays.copyOf(arreglo, arreglo.length - 1); se utiliza para crear una copia del arreglo arreglo con un elemento menos. Esto se hace para “eliminar” el último elemento del arreglo después de haber desplazado los elementos a la izquierda para sobrescribir el valor que queremos eliminar.
            // El método Arrays.copyOf() de la clase Arrays se utiliza para crear una copia de un arreglo con una longitud específica. En este caso, estamos creando una copia del arreglo arreglo con una longitud de arreglo.length - 1, lo que significa que la copia tendrá un elemento menos que el arreglo original.
            // Luego, asignamos la copia del arreglo a la variable arreglo para “reemplazar” el arreglo original con la copia que tiene un elemento menos. De esta manera, hemos “eliminado” el último elemento del arreglo.
            System.out.println("Valor eliminado: " + Arrays.toString(arreglo));
        } else {
            System.out.println("Valor no encontrado");
        }
    }
}
