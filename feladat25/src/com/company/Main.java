package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Írj programot, amely beolvas egy pozitív egész számot, és kiírja az osztóit!*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy számot.");
        int szam = sc.nextInt();
        for (int i = 1; i < szam; i++) {
            if (szam % i == 0) {
                System.out.println(i);
            }
        }
    }
}
