package guiaTrabajoPracticoNDos;

public class DameLosMayoresYLosMenoresDos {
    public static void main(String[] args) {
        //Dame los mayores y los menores : Realizar un programa donde se guarden 5 en
        //un arreglo. Luego, el programa debe mostrar en pantalla el valor máximo y mínimo
        //de los números ingresados

        int[] arreglo = {1, 2, 3, 4, 5};
        int maximo = arreglo[0];
        int minimo = arreglo[0];
        for (int valor : arreglo) {
            if (valor > maximo) {
                maximo = valor;
            }
            if (valor < minimo) {
                minimo = valor;
            }
        }
        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);

    }
}
