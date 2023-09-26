package guiaTrabajoPracticoNDos;

public class SeraPalindromo {
    public static void main(String[] args) {
        //Sera Palíndromo?: Dado un arreglo con caracteres (Formando una palabra) indicar
        //si es o no palíndromo.

        char[] palabra = {'a', 'n', 'i', 't', 'a', 'l', 'a', 'v', 'a', 'l', 'a', 't', 'i', 'n', 'a'};

        //Un palíndromo es una palabra o frase que se lee igual hacia adelante y hacia atrás, ignorando los espacios y la puntuación.
        if (esPalindromo(palabra)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(char[] palabra) {
        for (int i = 0; i < palabra.length / 2; i++) {
            if (palabra[i] != palabra[palabra.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
