package com.strings;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1="Hello World";
        String str2="Hello World";
        String str3="Hello world";
        String str4=new String("Hello World");

        boolean bool1=str1.equals(str2);
        System.out.println(bool1);
        boolean bool2=str1.equals(str3);
        System.out.println(bool2);

        boolean bool5=str1.equalsIgnoreCase(str3);
        System.out.println(bool5);

        boolean bool6=str1.equals(str4);
        System.out.println(bool6);
        System.out.println("----------------------");
        boolean bool3=str1==str2;
        System.out.println(bool3);
        boolean bool4=str1==str3;
        System.out.println(bool4);
        boolean bool7=str1==str4;
        System.out.println(bool7);
        System.out.println("----------------------");
        int i=str1.compareTo(str2);
        System.out.println(i);
        int i2=str1.compareTo(str3);
        System.out.println(i2);

        String animal="Catt";
        String animal2="Cat";
        int i3=animal.compareTo(animal2);
        System.out.println(i3);
    }
}
