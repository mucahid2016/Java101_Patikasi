package Donguler.MukemmelSayi_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = scanner.nextInt();
        int toplam = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }

        if (n==toplam){
            System.out.println(n+" Bir MİKEMMEL Sayıdır.");
        }else {
            System.out.println(n+" Bir Mükemmel Sayı Değildir.");
        }

    }
}
