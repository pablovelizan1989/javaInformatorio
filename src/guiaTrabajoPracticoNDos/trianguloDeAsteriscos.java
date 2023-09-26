package guiaTrabajoPracticoNDos;

public class trianguloDeAsteriscos {
    public static void main(String[] args) {
        //Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
        //triángulo de asteriscos en la consola. Usar bucles.

        int filas = 5;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
