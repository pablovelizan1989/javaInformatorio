package guiaTrabajoPracticoNUno;

public class Descontador {
    public static void main(String[] args) {
        //Descontador: Se le solicita que guarde un número en un espacio de memoria y
        //discretamente dicho número 20 veces sin usar asignación. ¿Que operador podría
        //usar para hacerlo?


        int decremento = 20;

        for (int i = 0; i < 20; i++) {
            --decremento;
            System.out.println(decremento);

        }
    }
}
