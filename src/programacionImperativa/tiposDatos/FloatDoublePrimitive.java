package programacionImperativa.tiposDatos;

public class FloatDoublePrimitive {
    public static void main(String[] args) {

        //float tiene 32 bits
        float miMinimoValorDeFloat = Float.MIN_VALUE;
        float miMaximoValorDeFloat = Float.MAX_VALUE;//ej: 3.45f xq tiene predefinido el double
        System.out.println("float valor minimo " + miMinimoValorDeFloat);
        System.out.println("float valor maximo " + miMaximoValorDeFloat );

        //double tiene 54 bits
        double  miMinimoValorDouble = Double.MIN_VALUE;
        double miMaximoValorDouble = Double.MAX_VALUE;

        System.out.println("float valor minimo " + miMinimoValorDouble);
        System.out.println("float valor maximo " + miMaximoValorDouble);
    }
}
