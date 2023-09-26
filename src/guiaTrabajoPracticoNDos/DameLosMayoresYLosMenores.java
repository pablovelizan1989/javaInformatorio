package guiaTrabajoPracticoNDos;

public class DameLosMayoresYLosMenores {
    public static void main(String[] args) {
        // Dame los mayores y los menores : Dado un arreglo con valores enteros, realice la
        //búsqueda de ese entero, si encontró el entero mostrarlo por pantalla sino muestre
        //por pantalla que no lo encontró.

        int[] arreglo = {1, 2, 3, 4, 5};
        int valorBuscado = 3;
        boolean encontrado = false;
        for (int valor : arreglo) {
            if (valor == valorBuscado) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Se encontró el valor " + valorBuscado + " en el arreglo.");
        } else {
            System.out.println("No se encontró el valor " + valorBuscado + " en el arreglo.");
        }
    }
}
