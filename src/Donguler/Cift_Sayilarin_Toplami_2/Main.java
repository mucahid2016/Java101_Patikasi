package Donguler.Cift_Sayilarin_Toplami_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, toplam = 0;
        Scanner input = new Scanner(System.in);


        do {
            System.out.print("Sayı Giriniz : ");
            n = input.nextInt();
            if (n % 2 == 0) {
                toplam += n;
            }
        } while (n % 2 != 1);


        System.out.println("Toplam : " + toplam);

    }
}
