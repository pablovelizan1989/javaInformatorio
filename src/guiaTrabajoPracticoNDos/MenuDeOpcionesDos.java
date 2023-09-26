package guiaTrabajoPracticoNDos;

public class MenuDeOpcionesDos {
    public static void main(String[] args) {
        //Menú de opciones parte 2: Realice un menú de opciones con bucle WHILE, donde
        //la opción se guarde en una variable (Sin pedir por teclado), muestre la opción
        //elegida y fuerce su salida bucle
        int opcion = 1;
        while (opcion != 4) {
            System.out.println("Menú:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            System.out.println("Elegiste la opción " + opcion + ".");
            switch (opcion) {
                case 1:
                    System.out.println("Ejecutando la opción 1.");
                    break;
                case 2:
                    System.out.println("Ejecutando la opción 2.");
                    break;
                case 3:
                    System.out.println("Ejecutando la opción 3.");
                    break;
                case 4:
                    System.out.println("Saliendo del menú.");
                    break;
                default:
                    System.out.println("Elección inválida. Por favor intenta de nuevo.");
            }
            opcion++;
        }
    }
}
