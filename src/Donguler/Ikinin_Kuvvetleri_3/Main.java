package Donguler.Ikinin_Kuvvetleri_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Tepe Değerini Giriniz : ");
        n = scan.nextInt();
        System.out.println("4'ün Katları ");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        System.out.println("***********");
        System.out.println("5'in Katları ");
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }
    }
}
