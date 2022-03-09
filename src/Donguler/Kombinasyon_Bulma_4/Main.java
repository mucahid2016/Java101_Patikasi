package Donguler.Kombinasyon_Bulma_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kombinasyonun' 1. Değerini Giriniz : ");
        int n = scan.nextInt();
        double total = 1, total2 = 1, total3 = 1;

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }

        System.out.print("Kombinasyonun' 2. Değerini Giriniz : ");
        int m = scan.nextInt();
        for (int i = 1; i <= m; i++) {
            total2 = total2 * i;
        }

        int x = n - m;
        for (int i = 1; i <= x; i++) {
            total3 = total3 * i;

        }
        double sonuc = total / (total2 * total3);
        System.out.println(n+"'in "+m+"'li Kombinasyonun Sonucu : "+sonuc);

        // while (i <= n) {
//            total = total * i;
//            i++;
//        }
    }
}
