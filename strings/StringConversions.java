package com.strings;

public class StringConversions {
    public static void main(String[] args) {
        String str="543";
        int number= Integer.parseInt(str);
        System.out.println(number*2);
        long longNumber= Long.parseLong(str);
        System.out.println(longNumber*2);

        char character= str.charAt(2);
        System.out.println(character);

        String str2="true";
//        Boolean.parseBoolean(str2);
        boolean bool= Boolean.valueOf(str2);
        if (bool){
            System.out.println("success");
        }

        long l=5000000;

        String val= String.valueOf(l);
        System.out.println(val);
    }
}
