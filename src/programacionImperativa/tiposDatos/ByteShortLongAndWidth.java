package programacionImperativa.tiposDatos;

public class ByteShortLongAndWidth {
    public static void main(String[] args) {
        System.out.println("rango del valor del byte: "+ Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        //con control y un click podes ver la clase ej: Byte.MIN_VALUE

        byte minValue = -128;
        byte maxValue = 127;
        //short value 14 bits clase wrapper

        System.out.println("rango del valor del byte: "+ Short.MIN_VALUE + " " + Short.MAX_VALUE);

        short minValueShort = -32768;
        short maxValueShort = 32767;

        System.out.println("rango del valor del byte: "+ Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

         int minValueInt = -2147483648;
        int maxValueInt = 2147483647;

        //tipo long
        long valorLong =344333443333l;//se le pone una l al final

        // SCREAMING_SNAKE_CASE
        //declaracion de constantes
        final long ESTA_ES_UNA_CONSTANTE = 29393939393993L;

    }
}
