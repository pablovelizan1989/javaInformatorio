package guiaTrabajoPracticoNUno;
import java.util.Scanner; // Importar la clase Scanner para leer datos del

public class ConversionDeDolaresAPesos {
    public static void main(String[] args) {
        //Conversión de dólares a pesos: Escribir un programa en Java que solicite al
        //usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
        //tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
        //usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.

        // Declarar las variables que se van a utilizar
        double dolares; // La cantidad de dólares que ingresa el usuario
        double pesos; // La cantidad de pesos equivalente
        double tasa; // La tasa de cambio fija

        // Crear un objeto de la clase Scanner para leer datos del teclado
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario la tasa de cambio
        System.out.println("Ingrese la tasa de cambio de 1 dólar a pesos: ");
        tasa = entrada.nextDouble(); // Leer un número real y asignarlo a tasa

        // Solicitar al usuario la cantidad de dólares
        System.out.println("Ingrese la cantidad de dólares: ");
        dolares = entrada.nextDouble(); // Leer un número real y asignarlo a dolares

        // Calcular la cantidad de pesos equivalente con la fórmula: pesos = dolares * tasa
        pesos = dolares * tasa;

        // Mostrar el resultado en la pantalla con un mensaje adecuado
        System.out.println(dolares + " dólares equivalen a " + pesos + " pesos.");
    }
}
