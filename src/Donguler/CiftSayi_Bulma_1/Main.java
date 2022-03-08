package Donguler.CiftSayi_Bulma_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, toplam = 0, bolen = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        i = scanner.nextInt();

        for (int k = 1; k <= i; k++) {
            if (k % 3 == 0 && k % 4 == 0) {
                System.out.println(k);
                bolen++;
                toplam += k;
            }
        }
        int ortalama = toplam / bolen;
        System.out.println("3 ve 4 ile tam bölünen sayılarınızın Ortalaması: " + ortalama);

//        System.out.println("********");
//        int m=1;
//        while (m<=10){
//            m++;
//            if (m%2==1){
//                continue;
//            }
//            System.out.println(m);
//        }
    }
}
