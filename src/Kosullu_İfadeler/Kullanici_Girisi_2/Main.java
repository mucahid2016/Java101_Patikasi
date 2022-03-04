package Kosullu_İfadeler.Kullanici_Girisi_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password,cevap;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = scanner.nextLine();

        System.out.print("Şifreniz : ");
        password = scanner.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        }else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.print("Bilgilerinizi Sıfırlamak ister misiniz : ");
            cevap=scanner.nextLine();
            if (cevap.equals("evet")){
                System.out.println("Yeni Gireceğiniz Şifre Eskisi ile aynı olmamalı !");
                System.out.print("Yeni Şifreyi Giriniz : ");
                String newPassword=scanner.nextLine();

                if (newPassword.equals(password) || newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulmadı !");
                }else{
                    System.out.println("Şifre oluşturuldu.");
                }
            }else {
                System.out.println("İyi Günler !");
            }
        }
    }
}
