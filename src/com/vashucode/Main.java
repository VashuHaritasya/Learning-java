package com.vashucode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
public class Main {
    public static void main(String[] args) {

        //        System.out.println(("welcome to my page"));
//            int number = 100; //datatypes
//            String brand = "VashuCode";
//            Date date = new Date();
        //        byte theByte = -128;
        //        short theShort = 8393;
        //        int theInt = 787838334;
        //        long theLong = 78783833452L;
        //
        //        float pi = 3.14F;
        //        double doublePi = 3.1415;
        //
        //        boolean isAdult = true;
        //
        //        char nameInitial = 'A';
        //
        //        System.out.println((theByte));
        //        System.out.println((theShort));
        //        System.out.println((theInt));
        //        System.out.println((theLong));
        //        System.out.println((pi));
        //        System.out.println((doublePi));
        //        System.out.println((isAdult));
        //        System.out.println((nameInitial));
    //        REFERENCE TYPES
//        String name =  new String(original: "vashucode");
//        System.out.println(name);
//        LocalDate now = LocalDate.now();
//        System.out.println(now.getDayOfWeek());

//        int a = 10;
//        int b = a; // coby of a
//        a = 100; // a overwrite
//        System.out.println("a " + a + " -b " + b);
//
//        Person alex = new Person("alex");
//        Person mariam = alex;
//
//
//        System.out.println("before changing alex");
//        System.out.println(alex.name + " " + mariam.name);
//
//        alex.name = "Alexander";
//    }
//
//    static class Person {
//        String name;
//        Person(String name) {
//            this.name = name;
//        }
//        int number = 0;
//        int one = 1; // we cannot write number here cz it has been already used
//        double pi = 2.1415;
//        int subscribeCountForVashu = 1_000_000_000 // for big word we use camel case

        //srings
//        char a = 'A'; we can only have one single value in char
//        char b = 'B';

//        String name = "vashuCode";
//        System.out.println(name.toUpperCase());
//        System.out.println(name.charAt(3));
//
//        String code = "Code";
//        System.out.println(name.contains(code));
//
//        System.out.println(name.equals(code)); //vashucode is not equal to code so false

        Date date = new Date();
        LocalDate localDate =  LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
//        java.time.LocalDate localDate = java.time.LocalDate.now();  we can even write like this in this method we dont have to write import line


        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(localDate.getDayOfWeek());
    }
}
