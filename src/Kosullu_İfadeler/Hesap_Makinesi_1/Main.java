package Kosullu_İfadeler.Hesap_Makinesi_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner sc = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = sc.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = sc.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = sc.nextInt();

        if (select == 1) {
            System.out.println("Toplam : " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Çıkarma : " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Çarpma : " + (n1 * n2));
        } else if (select == 4) {
            if (n2!=0){
                System.out.println("Bölme : " + (n1 / n2));
            }else {
                System.out.println("Bir sayı 0'a bölünemez !!!");
            }

        }else{
            System.out.println("Hatalı Seçim Yaptınız. Tekrar Deneyiniz !");
        }

    }

}
