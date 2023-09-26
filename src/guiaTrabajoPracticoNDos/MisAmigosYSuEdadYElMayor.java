package guiaTrabajoPracticoNDos;

public class MisAmigosYSuEdadYElMayor {
    public static void main(String[] args) {
        //Mis amigos, su edad y el mayor : Guarda en un arreglo una N cantidad de amigos,
        //itere sobre esa cantidad mostrando el nombre de cada amigo si y sólo si este amigo
        //es mayor de edad, en caso de ser menor de edad imprima un mensaje diciendole a
        //ese amigo porque no lo muestra por pantalla. Pero a su vez, encuentre al amigo que
        //mayor edad tenga, muestre un mensaje por pantalla del nombre de esa persona y su
        //edad.

        String[] amigos = {"Juan", "Pedro", "Lucía", "Marta"};
        int[] edades = {20, 17, 22, 19};
        int mayorEdad = 0;
        String amigoMayorEdad = "";
        for (int i = 0; i < amigos.length; i++) {
            if (edades[i] >= 18) {
                System.out.println(amigos[i]);
                if (edades[i] > mayorEdad) {
                    mayorEdad = edades[i];
                    amigoMayorEdad = amigos[i];
                }
            } else {
                System.out.println(amigos[i] + " es menor de edad y no se muestra su información.");
            }
        }
        System.out.println("El amigo con mayor edad es " + amigoMayorEdad + " con " + mayorEdad + " años.");
    }
}
