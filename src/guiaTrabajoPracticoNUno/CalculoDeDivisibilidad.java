package guiaTrabajoPracticoNUno;

public class CalculoDeDivisibilidad {
    public static void main(String[] args) {
        //Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
        //sumen, determine si el primer número es divisible por el segundo número y muestre
        //el resultado.

        int numA = 5;
        int numB = 10;
        int resultado = numA + numA;

        if (numA % numB == 0) {
            System.out.println("el numero "+ numA +" es divisible con "+ numB+ " y el resultado de la suma es "+ resultado);
        }else {
            System.out.println("el numero "+ numA +" no es divisible con "+ numB+ " y el resultado de la suma es "+ resultado);
        }

    }
}
