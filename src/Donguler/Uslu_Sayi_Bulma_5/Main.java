package Donguler.Uslu_Sayi_Bulma_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k;
        Scanner scan = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayı : ");
        n = scan.nextInt();

        System.out.print("Üs Olacak Sayı : ");
        k = scan.nextInt();
        int total = 1;

        for (int i=1;i<=k;i++){
            total *=n;
        }

//        int i = 1;
//        while (i <= k) {
//            total *= n;
//            i++;
//        }
        System.out.println("CEvap : "+total);

    }
}
