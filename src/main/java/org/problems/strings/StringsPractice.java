package org.problems.strings;

import java.util.Arrays;

public class StringsPractice {

    public static void main(String[] args) {

        StringsPracticeTest("1 CHECKMATE string ");
    }
    public static void StringsPracticeTest(String s)
    {
        String s2 = "2nd string ";
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        String s3  = s.concat(s2);
        System.out.println(s3);
        System.out.println(s.contains("string"));
        System.out.println(s.substring(4,10));
        System.out.println(s.indexOf("st"));
        String s4= s.replace('t','f');
        System.out.println(s);
        System.out.println(s4);
        String []ar = s.split(" ");
        System.out.println(Arrays.toString(ar));
        System.out.println("hello".equalsIgnoreCase("HELLO"));
        System.out.println(System.identityHashCode(s));
        String s6 = s.toLowerCase(); // return new string object
        System.out.println(s6);
        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(s6));
        System.out.println(s.toUpperCase(

        ));




    }

}
