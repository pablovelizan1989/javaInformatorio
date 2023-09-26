package guiaTrabajoPracticoNUno;

public class potenciaDosYTres {
    public static void main(String[] args) {
        //Potencia de 2 y 3: Se le solicita que guarde en un espacio de memoria un número y
        //luego haga la potencia de ese número al cuadrado y al cubo.

        double numero = 2.5;

        double cuadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        System.out.println("el numero " + numero + " al cuadrado es " + cuadrado);
        System.out.println("el numero " + numero + " al cubo es " + cubo);
    }
}
