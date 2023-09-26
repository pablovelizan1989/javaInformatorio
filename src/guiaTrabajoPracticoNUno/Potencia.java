package guiaTrabajoPracticoNUno;

public class Potencia {
    public static void main(String[] args) {
        //Potencia de 2 y 3: Se le solicita que guarde en un espacio de memoria un número y
        //luego haga la potencia de ese número al cuadrado y al cubo.

        // Declarar una variable para guardar el número
        int numero = 5;
        // Calcular la potencia de 2 usando Math.pow
        double potencia2 = Math.pow(numero, 2);
        // Calcular la potencia de 3 usando Math.pow
        double potencia3 = Math.pow(numero, 3);
        // Mostrar los resultados por pantalla
        System.out.println("El número " + numero + " elevado al cuadrado es " + potencia2);
        System.out.println("El número " + numero + " elevado al cubo es " + potencia3);
    }
}
