package Kosullu_İfadeler.Cin_Zodyagi_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dogumYili;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        dogumYili = scanner.nextInt();

        int kalan = dogumYili % 12;
        String a="Çin Zodyağı Burcunuz : ";
        if (kalan == 0) {
            System.out.println(a+"Maymun");
        } else if (kalan == 1) {
            System.out.println(a+"Horoz");
        } else if (kalan == 2) {
            System.out.println(a+"Köpek");
        } else if (kalan == 3) {
            System.out.println(a+"Domuz");
        } else if (kalan == 4) {
            System.out.println(a+"Fare");
        } else if (kalan == 5) {
            System.out.println(a+"Öküz");
        } else if (kalan == 6) {
            System.out.println(a+"Kaplan");
        } else if (kalan == 7) {
            System.out.println(a+"Tavşan");
        } else if (kalan == 8) {
            System.out.println(a+"Ejderha");
        } else if (kalan == 9) {
            System.out.println(a+"Yılan");
        } else if (kalan == 10) {
            System.out.println(a+"At");
        } else {
            System.out.println(a+"Koyun");
        }
    }
}
