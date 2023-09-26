package guiaTrabajoPracticoNUno;

public class Acumulador {
    public static void main(String[] args) {
        //Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
        //de quince multiplicaciones entre dos números enteros divididos por el número de la
        //multiplicación. Por ejemplo:
        //Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15
        //El resultado mostrarlo por pantalla

        int numero1 = 5;
        int numero2 = 3;

        // Inicializar una variable para almacenar la acumulación
        double acumulacion = 0;

        // Usar un bucle for para realizar las quince multiplicaciones y sumarlas a la acumulación
        for (int i = 1; i <= 15; i++) {
            // Calcular el resultado de la multiplicación dividido por el número de la multiplicación
            double resultado = (double) numero1 * numero2 / i;

            // Sumar el resultado a la acumulación
            acumulacion += resultado;
        }

        // Mostrar el resultado final por pantalla
        System.out.println("La acumulación es: " + acumulacion);
    }
}
