package Donguler.TersUcgenYapimi_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz : ");
        n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (2 * i - 1); z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
