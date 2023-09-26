package guiaTrabajoPracticoNDos;

public class RestalosProhibidoMenoresACero {
    public static void main(String[] args) {
        //Restalos, prohibido menores a ceros : Cree dos arreglos con números decimales,
        //luego recortarlos y reste ambos arreglos el resultado aplicarlos a un tercer arreglo, si
        //la resta da negativo entonces guarde 0.
        double[] arreglo1 = {1.5, 2.3, 3.1};
        double[] arreglo2 = {0.5, 1.3, 4.1};
        double[] resultado = new double[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
            double resta = arreglo1[i] - arreglo2[i];
            if (resta < 0) {
                resultado[i] = 0;
            } else {
                resultado[i] = resta;
            }
        }
    }
}
