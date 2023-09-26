package guiaTrabajoPracticoNUno;

import java.util.Scanner;

public class CalculoDeLaVelocidadFinal {
    public static void main(String[] args) {
        //Cálculo de la fuerza centrípeta:
        //Escribir un programa en Java que calcule la fuerza centrípeta necesaria para
        //mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular
        //y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la
        //fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio
        //de la trayectoria.
        //Muestre el resultado por pantalla.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la masa del objeto (en kg): ");
        double masa = scanner.nextDouble();
        System.out.println("Introduce la velocidad angular del objeto (en rad/s): ");
        double velocidadAngular = scanner.nextDouble();
        System.out.println("Introduce el radio de la trayectoria (en m): ");
        double radio = scanner.nextDouble();
        double fuerzaCentripeta = masa * Math.pow(velocidadAngular, 2) / radio;
        System.out.println("La fuerza centrípeta necesaria para mantener el objeto en una trayectoria circular es: " + fuerzaCentripeta + " N");
    }
}
