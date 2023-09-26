package guiaTrabajoPracticoNUno;

public class Contador {
    public static void main(String[] args) {
        //Contador: Se le solicita que guarde un número en un espacio de memoria e
        //incremente dicho número 20 veces sin usar asignación. ¿Que operador podría usar
        //para hacerlo?

        int numero = 8;
        for (int i = 0; i < 20; i++) {
            numero++;
        }
        System.out.println("El resultado es: " + numero);
    }
}
