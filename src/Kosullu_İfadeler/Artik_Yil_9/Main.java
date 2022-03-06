package Kosullu_İfadeler.Artik_Yil_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner sc = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yil = sc.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                System.out.println(yil + " Bir Artık Yıl Değildir !");
            } else if (yil % 400 == 0) {
                System.out.println(yil + " Bir Artık Yıldır !");
            } else {
                System.out.println(yil + " Bir Artık Yıldır !");
            }
        } else {
            System.out.println(yil + " Bir Artık Değildir!");
        }
    }
}
