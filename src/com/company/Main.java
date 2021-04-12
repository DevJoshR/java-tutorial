package com.company;


import data_types.DataTypes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner and type casting
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name?");
        String scannedName = sc.next();
        System.out.println("Hello "+scannedName+"!");

        System.out.println("May I ask your age?");
        int scannedAge = sc.nextInt();
        System.out.println(scannedName+", you are "+scannedAge+" years old!");

    }
}
