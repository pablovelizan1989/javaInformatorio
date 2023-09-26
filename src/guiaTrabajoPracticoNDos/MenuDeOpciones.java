package guiaTrabajoPracticoNDos;

public class MenuDeOpciones {
    public static void main(String[] args) {
        //Menú de opciones : Realice un menú de opciones, donde la opción se guarde en
        //una variable (Sin pedir por teclado), muestre la opción elegida y fuerce su salida
        //bucle.

        boolean salir = false;
        int opcion = 1; // La opción se guarda en una variable sin pedir por teclado
        while (!salir) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la opción 1");
                    break;
                case 2:
                    System.out.println("Has elegido la opción 2");
                    break;
                case 3:
                    System.out.println("Has elegido salir del menú");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            salir = true; // Fuerza la salida del bucle después de mostrar la opción elegida
        }
    }
}
