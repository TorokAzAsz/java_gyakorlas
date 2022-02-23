package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Írj programot, mely beolvas két egész számot, és kiírja a képernyőre a nagyobbikat!
	    Scanner sc = new Scanner(System.in);
        System.out.println("Írjon be egy számot. ");
        int szam1 = sc.nextInt();
        System.out.println("Írjon be egy másik számot. ");
        int szam2 = sc.nextInt();
        //Ha az elsőnek megadott a szám a nagyobb, akkor kiírja, hogy a szam1 nagyobb mint a szam2.
        if(szam1>szam2) {
            System.out.println("Az elsőnek megadott szám a nagyobb: "+szam1);
        }
        //Ha az első szám nem nagyobb a másodiktól, akkor kiiírja a szam2-t.
        else {
            System.out.println("Az másodiknak megadott szám a nagyobb: "+szam2);
        }
    }
}
