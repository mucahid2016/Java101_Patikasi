package Donguler.For_Dongusu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        do {
            System.out.println("Sayı Giriniz : ");
            sayi = input.nextInt();
        } while (sayi > 0);

//        for (boolean run = true; run; ) {
//            System.out.print("Sayı Giriniz : ");
//            sayi = input.nextInt();
//            if (sayi < 0) {
//                run = false;
//            }
//        }


//        for (int sayac = 1; sayac <= 10; sayac += 2) {
//            System.out.println(sayac);
//        }
//        System.out.println("***");
//        int k = 3;
//        while (k <= 10) {
//            System.out.println(k);
//            k += 2;
//        }
    }
}
