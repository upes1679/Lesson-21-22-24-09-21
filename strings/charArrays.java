package com.strings;

public class charArrays {
    public static void main(String[] args) {
        char[] chars=new char[]{'c','a','b','d','e'};

        String str=new String(chars);
        System.out.println(str);

        String str2="Hello";
        char[] chars2=str2.toCharArray();
    }
}
