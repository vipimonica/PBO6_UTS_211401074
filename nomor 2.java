package com;
import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil;
        do {
            System.out.print("input bil. positif bulat: ");
            bil = input.nextInt();
        } while (bil < 0);
        long hasil = hitungFaktorial(bil);
        System.out.println(bil + "! = " + hasil);
    }

    public static long hitungFaktorial(int n) {
        if (n == 1) {
            return 1;
        } else { 
            return n * hitungFaktorial(n - 1);
        }
    }
}
