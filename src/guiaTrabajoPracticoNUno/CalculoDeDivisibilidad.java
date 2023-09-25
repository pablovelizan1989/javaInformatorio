package guiaTrabajoPracticoNUno;

public class CalculoDeDivisibilidad {
    public static void main(String[] args) {
        //. Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
        //sumen, determine si el primer número es divisible por el segundo número y muestre
        //el resultado.
        int numA = 8;
        int numB = 4;


        String suma = (numA % numB == 0) ? "divisible" : "no divisible";

        System.out.println(suma);
    }
}
