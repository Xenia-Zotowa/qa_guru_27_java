package guru.qa;

public class Main {
    public static void main(String[] args) {
        //Целочисленные типы
        byte aByte = 100; // 8b -128 +127
        byte bByte = 50;
        byte xByte = (byte) (aByte+bByte);
        System.out.println(xByte);

        short aShort = 15000;// 16b -32768 +32767
        short bShort = 14050;
        short xShort = (short) (aShort * bShort);
        System.out.println(xShort);

        int aInt = 4000000; // 32b (-2^32) .. (+2^32 -1)
        int xInt = (int) (aInt*1000);
        System.out.println(xInt);

        long aLong = 1800000000; // 64b (-2^64) .. (+2^64 -1)
        long xLong = (long) (++aLong);
        System.out.println((xLong));
        System.out.println(xLong / aLong);
        System.out.println(--xLong);
        System.out.println(xLong * 1500000000 * 10000000);

        int a = 1;
        double b = 1.1;
        System.out.println(a + b);

    }
}