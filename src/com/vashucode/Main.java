package com.vashucode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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
//
//        Date date = new Date();
//        LocalDate localDate =  LocalDate.now();
//        LocalDateTime localDateTime = LocalDateTime.now();
////        java.time.LocalDate localDate = java.time.LocalDate.now();  we can even write like this in this method we dont have to write import line
//
//
//        System.out.println(localDateTime);
//        System.out.println(date);
//        System.out.println(localDate.getDayOfWeek());

//        ARITHMETIC OPERATION

//        int ten = 10;
//        int two = 2;
//        int addition = ten + two;
//
//        System.out.println(addition);
//        System.out.println(10 + 2); // or we can do this

        // math class

//        System.out.println(Math.abs(-10));
//        System.out.println(Math.max(3.6 , 10.11));
//        System.out.println(Math.min( 3.6 , 10.11));
//        System.out.println(Math.pow( 3.6 , 10.11));
//        System.out.println(Math.PI);

        // Comparison operators

//        int KhalidAge = 18;
//        int MariamAge = 20;
////        boolean isKhalidOlderThanMariam = KhalidAge > MariamAge;
////        System.out.println(isKhalidOlderThanMariam);
//        System.out.println(KhalidAge > MariamAge); // or we can write this then we dont have to write boolean line
//        System.out.println(KhalidAge < MariamAge);
//        System.out.println(KhalidAge == MariamAge);
//        System.out.println(KhalidAge != MariamAge);
//        System.out.println(KhalidAge <= MariamAge);
//        System.out.println(KhalidAge >= MariamAge);

        // Logical opertaiors

//        boolean isAdult = false;
//        boolean isStudent = true;
//        boolean isvashucodeMember =  true;
//        System.out.println(isAdult && isStudent);
//        System.out.println(isAdult || isStudent);
//        System.out.println(isAdult || isStudent && isvashucodeMember);
//        System.out.println(!isAdult || isStudent && isvashucodeMember);
//        System.out.println((!isAdult || isStudent) && !isvashucodeMember);
//
//        System.out.println(isAdult == true );
//
//        String name = "Mark";
//        System.out.println((10 > 8 || 2 <= 2) && isAdult && name.contains("M"));

        // if statemnts

//        int age = 19 ;
//        if (age >= 18){
//            System.out.println("adult");
//        }else if(age >= 16 && age < 18){
//            System.out.println(" i am almost an adult ");
//        } else {
//            System.out.println("damn i am not an adult yet!!");
//        }
// ternary opertaor

//        int age = 18 ;
//        String message = age >= 18 ?
//                " damn i am an adult " :
//                "i am not an adult ";
//        System.out.println(message);

//       Switch statements
//        String gender = "FLE";
//        if (gender.equals("FEMALE")){
//
//        } else if (gender.equals("MALE")) {
//
//        }else if (gender.equals("PREFER NOT TO SAY")) {
//
//        } else {
//
//        }
//
//        switch (gender.toUpperCase()) {
//            case "FEMALE":
//                System.out.println("i am a female");
//                break;
//            case "MALE":
//                System.out.println("i am a male");
//                break;
//            case "PREFER NOT TO SAY":
//                System.out.println("i am a prefer not to say");
//                break;
//            default:
//                System.out.println("unknown gender");
//        }

//        ARRAYS

//        int zero = 0;
//        int one = 1;
//
//        int [] numbers = { 0 , 1 , 2, 3 , 4 , 3 , 4 , 543, 322,22,4,4,5,}; // we can write in a single line and we dont have to define the nummber of arrys just write as may as u can in inside of curley bracket
//        String [] names = {"vashu", "eshu","akshi"};
//        int [] numbers = new int[3] ;
//        numbers[0] = 0;
//       numbers[1] = 1;
//        numbers[2] = 2;
//        String [] numbers = new String[2] ;
//        boolean [] numbers = new boolean[4];
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString((names)));
//        System.out.println(names.length);

//        arrays and indexes
//        int [] numbers = {2, 0 , 1 , 4, 100};
//        int oneHundrted = numbers[4];
//        int four =  numbers[3];
//        System.out.println(oneHundrted);
//        System.out.println(four);


//         loops

//        int [] numbers = {2, 0, 1, 4, 100, 90, 78, 77};
//        String[] names = {"Anna", "ali"};
//
//        Arrays.stream(numbers).forEach(System.out::println);
//        Arrays.stream(names).forEach(System.out::println); // its a advance version for array to loop

//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
//        reverse order
//        for (int i = 0; i < numbers.length; i--){
//            System.out.println(numbers[i]);
//        }

//        Enhanced for loops

//        System.out.println("Enhanced for loop");
//        for (int number :  numbers) {
//            System.out.println(number);
//
//        }for (String name :  names) {
//            System.out.println(name);
//        }

        //BONUS TIPS

//        for (int i = 0; i < numbers.length; i++) {
//
//        }// just type numbers.fori / forr (reverse) its a shortcut for FOR loop
//        for (int i = numbers.length - 1; i >= 0; i--) {
//
//        }
//        for (String name : names) {
//
//        }//names.for its for strings

//        BREAK AND CONTINUE
//        String[] names = {"anna", "ali", "bob", "mike"};
//        for (String name : names) {
////            if (name.equals("bob")){
////                break;
////            }
//            if (name.startsWith("a")){
//                continue;
//            }
//            System.out.println(name);
//        }

// while loop
//        int count = 0;
//        while(count <= 20){
//            System.out.println("count" + count);
//            count++;
//        }

        // DO WHILE LOOP

//        int count = 0;
//
//        do {
//            System.out.println(count);
//            count++;
//        }
//        while(count <= 20);
//
//        while (true){
//
//        }

        //SCANNER CLASS

//        Scanner scanner =  new Scanner(System.in);
//        System.out.println("what is your name??");
//        String userName = scanner.nextLine();
//        System.out.println("hello " + userName);
//        System.out.println("how old are you ?" );
//        int age = scanner.nextInt();
//        int year = LocalDate.now().minusYears(age).getYear();
//        System.out.println("you were bron in "+ year);
//
//        if(age < 18){
//            System.out.println( " and you're not an adult");
//        } else {
//            System.out.println("and you're an adult");
//        }

        //Methods

//        System.out.println("hello");
//        String brand = "Nokia";
//        System.out.println(brand.toUpperCase());
//        System.out.println(brand.startsWith("N"));
//        System.out.println(brand.endsWith("a"));

        //understanding methods

//        char[] letters = {'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};
//        int count = countOccurrences(letters,'D' );
//        System.out.println(count);
//
//    }
//    public static int countOccurrences(
//            char[] letters, char searchLetter) {
//        System.out.println(Arrays.toString(letters));
//        System.out.println(searchLetter);
//        int count = 0;
//        for (char letter : letters) {
//            if(letter == searchLetter) {
//                count++;
//            }
//
//        }
//        return count;

        // Classes and objects
        Lens lensOne = new Lens(
                "sony",
                "85mm",
                true);

        Lens lensTwo = new Lens(
                "sony",
                "30mm",
                true);

        Lens lensTThree = new Lens(
                "cannon",
                "30mm-70mm",
                false);

        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
        System.out.println();

        System.out.println("Lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
        System.out.println();

        System.out.println("Lens 3");
        System.out.println(lensTThree.brand);
        System.out.println(lensTThree.focalLength);
        System.out.println(lensTThree.isPrime);

    }

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime; // we add many property like  String model String color , double price, double weight;


        Lens(String brand,
             String focalLength,
             boolean isPrime){
            this.brand= brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
