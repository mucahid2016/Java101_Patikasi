package Metotlar.Asal_Sayi_5;

import java.util.Scanner;

public class Main {
    static boolean asalSayi(int a, int b) {
        if (a < 2) return false;

        if (a % b == 0 && a != b) {
            return false;
        } else if (a % b == 0 && a == b) {
            return true;
        }
        return asalSayi(a, b + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz : ");
        int a = sc.nextInt();

        if (asalSayi(a, 2)) {
            System.out.println(a + " sayısı asaldır.");
        } else {
            System.out.println(a + " sayısı asal değildir !");
        }
    }
}
