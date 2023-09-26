package guiaTrabajoPracticoNUno;

public class PromedioDeEdad {
    public static void main(String[] args) {
        // Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
        //edad y los nombres de esas personas, luego saque su promedio e imprima por
        //pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
        //edades.

        // Este programa calcula el promedio de edad de un grupo de personas
        // y muestra el nombre, la edad y el promedio en la pantalla.

        // Se crean dos arreglos para almacenar los nombres y las edades
        String[] nombres = {"Ana", "Carlos", "Elena", "Fernando", "Luisa"};
        int[] edades = {25, 32, 28, 31, 29};

        // Se inicializa una variable para guardar la suma de las edades
        int suma = 0;

        // Se recorren los arreglos con un bucle for
        for (int i = 0; i < nombres.length; i++) {
            // Se muestra el nombre y la edad de cada persona
            System.out.println("Nombre: " + nombres[i] + ", Edad: " + edades[i]);
            // Se suma la edad al acumulador
            suma += edades[i];
        }

       // Se calcula el promedio dividiendo la suma entre el número de elementos
        double promedio = (double) suma / nombres.length;

       // Se muestra el promedio con dos decimales
        System.out.printf("El promedio de edad es: %.2f\n", promedio);
    }
}
