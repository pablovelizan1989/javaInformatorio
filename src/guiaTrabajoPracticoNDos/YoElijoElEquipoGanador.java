package guiaTrabajoPracticoNDos;

import java.util.Scanner;
public class YoElijoElEquipoGanador {
    public static void main(String[] args) {
        //Yo elijo el equipo ganador : Modifique el ejercicio anterior en donde usted debe
        //crear un menú de opciones en donde en ese menú de opciones debe elegir qué
        //equipo de fútbol quiere saber la información del el ejercicio . Los equipos ganadores.

        String equipo1 = "Equipo 1";
        String equipo2 = "Equipo 2";
        String entrenador1 = "Entrenador 1";
        String entrenador2 = "Entrenador 2";
        String[] jugadoresEquipo1 = {"Jugador 1", "Jugador 2", "Jugador 3"};
        String[] jugadoresEquipo2 = {"Jugador 4", "Jugador 5", "Jugador 6"};

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Menú:");
            System.out.println("1. Ver información del equipo 1");
            System.out.println("2. Ver información del equipo 2");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println(equipo1 + ":");
                for (String jugador : jugadoresEquipo1) {
                    System.out.println(" - " + jugador);
                }
            } else if (opcion == 2) {
                System.out.println(equipo2 + ":");
                for (String jugador : jugadoresEquipo2) {
                    System.out.println(" - " + jugador);
                }
            } else if (opcion == 3) {
                System.out.println("Saliendo del menú.");
            } else {
                System.out.println("Elección inválida. Por favor intenta de nuevo.");
            }
        }
    }
}
