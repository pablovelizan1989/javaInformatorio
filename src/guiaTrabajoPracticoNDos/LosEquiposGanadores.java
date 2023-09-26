package guiaTrabajoPracticoNDos;

public class LosEquiposGanadores {
    public static void main(String[] args) {
        String equipo1 = "Equipo 1";
        String equipo2 = "Equipo 2";
        String entrenador1 = "Entrenador 1";
        String entrenador2 = "Entrenador 2";
        String[] jugadoresEquipo1 = {"Jugador 1", "Jugador 2", "Jugador 3"};
        String[] jugadoresEquipo2 = {"Jugador 4", "Jugador 5", "Jugador 6"};

        System.out.println("Equipos ganadores:");
        System.out.println(equipo1 + ":");
        for (String jugador : jugadoresEquipo1) {
            System.out.println(" - " + jugador);
        }
        System.out.println(equipo2 + ":");
        for (String jugador : jugadoresEquipo2) {
            System.out.println(" - " + jugador);
        }
    }
}
