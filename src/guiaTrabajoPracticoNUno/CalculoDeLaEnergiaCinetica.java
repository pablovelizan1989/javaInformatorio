package guiaTrabajoPracticoNUno;

import java.util.Scanner;

public class CalculoDeLaEnergiaCinetica {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Ingrese la masa del objeto: ");
        //double masa = scanner.nextDouble();
        //System.out.print("Ingrese la velocidad del objeto: ");
        //double velocidad = scanner.nextDouble();
        //double energiaCinetica = 0.5 * masa * Math.pow(velocidad, 2);
        //System.out.println("La energía cinética del objeto con masa " + masa + " y velocidad " + velocidad + " es " + energiaCinetica);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la masa del objeto: ");
        double masa = scanner.nextDouble();
        System.out.print("Ingrese la velocidad del objeto: ");
        double velocidad = scanner.nextDouble();
        double energiaCinetica = 0.5 * masa * Math.pow(velocidad, 2);
        System.out.println("La energía cinética del objeto con masa " + masa + " y velocidad " + velocidad + " es " + energiaCinetica);
    }
}
