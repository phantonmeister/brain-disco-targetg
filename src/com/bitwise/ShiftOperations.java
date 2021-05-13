package com.practice.bitwise;

import java.awt.*;

public class ShiftOperations {

     private static void shiftLeft(int a, int b) {

        System.out.format( "Shifting left by %d results in %d %n",b, a << b );

    }

    private static void shiftRight(int a, int b) {

         System.out.format("Shifting right %d by %d results in %d %n", a, b , a >> b);
    }

    private static void andBytes(String a){

        System.out.println(a.getBytes()[0] & 0xff);

    }

    public static void main(String... args) {

         shiftLeft(2,3);

         shiftRight(65, 2);

         andBytes("AB");

         int a = 65, b=66, c=67;

         int d = (a << 24) | (b << 16) | (c << 8);

        System.out.println("d is "+d);
        System.out.println( (d >> 18)& 0x3f );
        System.out.println((d >> 12) & 0x3f);
        System.out.println((d >> 6) & 0x3f);
        System.out.println(((d >> 18)));
    }
}
