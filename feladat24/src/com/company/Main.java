package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Írj programot, amely beolvas egy pozitív egész számot, és kiírja az egész számokat
        a képernyőre eddig a számig, egymástól szóközzel elválasztva!*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy pozitív egész számot. ");
        int szam = sc.nextInt();
        for(int i=0; i!=szam;i++) {
            System.out.println(i);
        }
    }
}
