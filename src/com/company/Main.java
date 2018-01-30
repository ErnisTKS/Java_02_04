package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 2 skaicius: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Suma: " + Suma(a,b));
        System.out.println("Skirtumas: " + Skirtumas(a,b));
    }

    public static int Suma(int a, int b){
        return a+b;
    }

    public static int Skirtumas(int a, int b){
        return a-b;
    }
}
