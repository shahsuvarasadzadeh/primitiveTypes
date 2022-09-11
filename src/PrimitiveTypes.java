public class PrimitiveTypes {
    private static int $;

    final static public void main(String[] arv) {

       /* byte 8 bit -128  127 0 123
        short 16 bit -32,768 32,767 0 123
        int 32 bit -231 231-1 0 123
        long 64 bit -263 263-1 0L 123
        float 32 bit float 0.0f 123,45f
        double 64 bit float 0.0d 123,456
        boolean N/A false true
        char 16 bit unicode '\u0000' '\uffff' '\u0000' 'm'*/

        String a_b;

        System.out.println($);

        float f2 = 1_000_000_000_000_000_000L;

        float f3 = 10.0F;

        char c = 0xff;

        System.out.println(c);

        int x = 0X0001;

        int y = 0x7fffffff;

        int z = 0xDeadCafe;

        double notAtStart = 1_0_0_0.0_0;

        int _123_456L = 10;

        long g = _123_456L;

        char a = 0x892; // hexadecimal literal

        char b = 982; // int literal

        final int i = b;

        final int m = b;

        final int n = 982;

        char c1 = i; // DOES NOT COMPILE

        char c2 =  m; // DOES NOT COMPILE

        char c3 = n;

        int i = c;

        c = i; // DOES NOT COMPILE

        short s = c; // DOES NOT COMPILE

        c = s; // DOES NOT COMPILE

        char c1 = Short.MAX_VALUE;

        short s2 = Short.MAX_VALUE;

        char c2 = s2; // DOES NOT COMPILE

        short s3 = Short.MAX_VALUE;

        char c3 = (char) s3;

        final short s4 = Short.MAX_VALUE;

        char c4 = s4;

        byte b5 = Byte.MAX_VALUE;

        char c5 = b5; // DOES NOT COMPILE

        short s1 = 1;
        byte b1 = s1; // DOES NOT COMPILE

        short s2 = 1;
        byte b2 = (byte) s2;

        final short s3 = 1;
        byte b3 = s3;

        final short s4 = 200;
        byte b4 = s4; // DOES NOT COMPILE, final olsa da aralıqdan kənar dəyərdi





    }
}
