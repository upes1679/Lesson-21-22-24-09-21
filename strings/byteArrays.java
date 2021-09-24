package com.strings;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class byteArrays {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "Harry Potter";
        byte[] bytes = str.getBytes();
//        Charset charset= Charset.defaultCharset();
        String charSetName = "ASCII";
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_16);

        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes3=charset.encode(str).array();

        String newStr= charset.decode(ByteBuffer.wrap(bytes3)).toString();
        System.out.println(newStr);

        String newStr2=new String(bytes3);
        System.out.println(newStr2);
    }
}
