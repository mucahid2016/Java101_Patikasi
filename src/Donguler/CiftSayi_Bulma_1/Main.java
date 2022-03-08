package Donguler.CiftSayi_Bulma_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        i = scanner.nextInt();

        for (int k = 1; k <= i; k++) {
            if (k % 3 == 0 || k % 4 == 0) {
                System.out.println(k);
            }
        }
        System.out.println("********");
        int m=1;
        while (m<=10){
            m++;
            if (m%2==1){
                continue;
            }
            System.out.println(m);
        }
    }
}
