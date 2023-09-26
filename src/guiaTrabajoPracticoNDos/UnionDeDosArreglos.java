package guiaTrabajoPracticoNDos;


import java.util.Arrays;
public class UnionDeDosArreglos {
    public static void main(String[] args) {
        //Unión de dos arreglos : Dado dos arreglos con cualquier tipo de valor (Ya sea
        //String, Char, Integer, etc), realice la unión de ambos arreglos en un tercer arreglo.

        String[] arreglo1 = {"a", "b", "c"};
        String[] arreglo2 = {"d", "e", "f"};
        String[] resultado = new String[arreglo1.length + arreglo2.length];

        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i];
        }

        for (int i = 0; i < arreglo2.length; i++) {
            resultado[arreglo1.length + i] = arreglo2[i];
        }

        System.out.println(Arrays.toString(resultado));
    }
}
