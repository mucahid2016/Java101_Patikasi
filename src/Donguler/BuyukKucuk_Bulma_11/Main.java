package Donguler.BuyukKucuk_Bulma_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = scanner.nextInt();
        int min = 0;
        int max = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı Giriniz : ");
            int m = scanner.nextInt();
            if (i == 1) {
                min = m;
                max = m;
            } else {
                if (m > max) {
                    max = m;
                }
                if (m < min) {
                    min = m;
                }
            }
        }
        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);
    }
}
