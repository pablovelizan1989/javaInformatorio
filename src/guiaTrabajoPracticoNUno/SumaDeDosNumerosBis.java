package guiaTrabajoPracticoNUno;

public class SumaDeDosNumerosBis {
    public static void main(String[] args) {
        //Suma de dos números bis: Se les solicita que guarden dos números enteros y los
        //sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
        //indique si se trata de un número par o impar

        int numA = 3;
        int numB = 7;

        int suma = numB + numA;

        int resultado = (suma % 2 == 0)? 1 : 0;
        System.out.println("la suma da: " + suma + " el resultado si da un 1 es par, si da un 0 es impar: " + resultado);


    }
}
