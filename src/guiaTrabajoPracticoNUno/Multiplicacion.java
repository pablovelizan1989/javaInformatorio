package guiaTrabajoPracticoNUno;

public class Multiplicacion {
    public static void main(String[] args) {
        //. Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
        //guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
        //memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
        //real? ¿Por qué?

        double numA = 14.5;
        double numB = 20.3;
        double multiplicacion;

        multiplicacion = numA * numB;

        int numC = 10;
        int numD = 2;
        int multi2;

        multi2 = numC * numD;

        System.out.println(multiplicacion + multi2);
        // El resultado final es un número real porque la suma de
        // un número real y un número entero da como resultado un número real
    }
}
