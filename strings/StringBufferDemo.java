package com.strings;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World!");
        //String is immutable- the value is stored inside string constant pool
        //String Buffer is mutable- the value is stored inside the heap
        String str= stringBuffer.toString();
//        System.out.println(str);
        System.out.println(stringBuffer);

        stringBuffer.insert(0,"abc");
        System.out.println(stringBuffer);

        stringBuffer.replace(0,3,"Replaced value");
        System.out.println(stringBuffer);

//        stringBuffer.delete(0,5);
//        System.out.println(stringBuffer);

        stringBuffer.deleteCharAt(5);
        System.out.println(stringBuffer);

        String string1= stringBuffer.substring(10,12);
        System.out.println(string1);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

    }
}
