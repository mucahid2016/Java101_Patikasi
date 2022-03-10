package Donguler.ATM_Projesi_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Şifreniz : ");
            password = input.nextLine();

            if (userName.equals("Patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz! ");
                do {
                    System.out.println("1- Para Yatırma \n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış Yap");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");

                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Para Miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Para Miktarı : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye Yetersiz ! ");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }
                } while (select != 4);
                System.out.println("Tekrar Görüşmek Dileğiyle !");
                break;
            } else {
                right--;
                System.out.println("Hatalı Giriş Yaptınız ! Tekrar Deneyiniz. ");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur Lütfen Banka İle İletişime Geçiniz !");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }

            }

        }

    }
}
