package guiaTrabajoPracticoNDos;

public class YoElijoElEquipoGanadorMejorado {
    public static void main(String[] args) {
        //Yo elijo el equipo ganador mejorado: A partir del ejercicio número 12 del nivel de
        //Padawan Jedi mejorelo usando arreglos.

        String[] equipos = {"Equipo A", "Equipo B"};
        String[] entrenadores = {"Entrenador A", "Entrenador B"};
        String[][] jugadores = {
                {"Jugador A1", "Jugador A2", "Jugador A3"},
                {"Jugador B1", "Jugador B2", "Jugador B3"}
        };

        int opcion = 0; // Elige el primer equipo

        System.out.println("Equipo elegido: " + equipos[opcion]);
        System.out.println("Entrenador: " + entrenadores[opcion]);
        System.out.println("Jugadores: ");
        for (String jugador : jugadores[opcion]) {
            System.out.println(jugador);
        }
    }
}
