package com.example.ejerciciosob;

public class ejercicio1Ob{
    public class datos{
        byte byte1=1;
        int int1=2342;
        long long1=1287947632L;
        double double1=123.234;
        String nombre= Pepe();
    }
    private static String Pepe() {
        return "Pepe";
    }
    public static void main (String[]args) {
        System.out.println("Esto es un byte: " + byte.class);
        System.out.println("Esto es un int: " + int.class);
        System.out.println("Esto es un long: " + long.class);
        System.out.println("Esto es un double: " + double.class);
        System.out.println("Esto es un String con un nombre: "+Pepe());
    }
}
