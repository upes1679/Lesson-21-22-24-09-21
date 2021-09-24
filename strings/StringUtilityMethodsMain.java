package com.strings;

import java.util.Locale;

public class StringUtilityMethodsMain {
    public static void main(String[] args) {
        String str = "Hello";
        str = str.concat(" World");
        System.out.println(str);
        String str2 = "Hello" + " World";
        System.out.println(str2);

        String s = "l";
        boolean b = str.contains(s);
        System.out.println(b);

        int i = str.indexOf(s);
        System.out.println(i);

        int i2 = str.lastIndexOf(s);
        System.out.println(i2);

        String str3 = "     ";
        boolean b2 = str3.isEmpty();
        System.out.println(b2);

        boolean b3 = str3.isBlank();
        System.out.println(b3);

        String newStr = str.toLowerCase();
        System.out.println(newStr);

        String newStr2 = str.toUpperCase();
        System.out.println(newStr2);

        String a = String.join(" ", "Dog", "Cat", "Horse");
        System.out.println(a);

        String string1 = "Apple Orange Watermelon";
        String[] strArr = string1.split("e ");
        for (int j = 0; j < strArr.length; j++) {
            System.out.println(strArr[j]);
        }

        int length = str.length();
        System.out.println(length);

        String string2 = "   dasfds   ";
        string2 = string2.strip();
        System.out.println(string2);

        System.out.println("-------------------");
        String string10="Hello World!";
//        string10=string10.substring(6);
//        System.out.println(string10);
//        string10=string10.substring(6,11);
//        System.out.println(string10);
        String newStr3=string10.substring(6,11);
        System.out.println(newStr3);
        System.out.println("-------------------");
        String string11="Hello World!";
        String newStr4=string11.replace("ll","ab");
        System.out.println(newStr4);
    }
}
