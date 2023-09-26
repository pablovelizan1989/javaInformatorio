package guiaTrabajoPracticoNDos;

public class ConviertoLoQueMeDaLaGana {
    public static void main(String[] args) {
        //Convierto lo que me da la gana: Demuestre cómo convertir un bucle WHILE en un
        //DO WHILE.

        // Bucle WHILE
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

// Bucle DO WHILE equivalente
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);
    }
}
