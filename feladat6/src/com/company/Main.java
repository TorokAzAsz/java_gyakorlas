package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*Írj programot, mely beolvas három egész számot, és kiírja a képernyőre a
        legkisebbet!*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy számot. ");
        int szam1 = sc.nextInt();
        System.out.println("Adjon meg egy másik számot. ");
        int szam2 = sc.nextInt();
        System.out.println("Adjon meg egy harmadik számot. ");
        int szam3 = sc.nextInt();
        //Megnézem, hogy a szám1-e a legkisebb mindhárom közül, ha igen, akkor kiíratom.
        if (szam1 <szam2 && szam1<szam3) {
            System.out.println("A három közül a legkisebb: "+szam1);
        }
        //Megnézem, hogy a szám2-e a legkisebb mindhárom közül, ha igen, akkor kiíratom.
        else if (szam2<szam1 && szam2<szam3) {
            System.out.println("A három közül a legkisebb: "+szam2);
        }
        //Megnézem, hogy a szám3-e a legkisebb mindhárom közül, ha igen, akkor kiíratom.
        else if (szam3<szam1 && szam3<szam2) {
            System.out.println("A három közül a legkisebb: "+szam3);
        }
    }
}
