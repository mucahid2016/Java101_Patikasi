package Donguler.ATM_Projesi_9;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        String userName, password;
        Scanner scanner = new Scanner(System.in);

        int right = 3;
        int select;
        int hesapMiktari = 1500;
        int price;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = scanner.nextLine();
            System.out.print("Şifreniz: ");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("dev")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz ! ");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Yapmak İstediğiniz İşlemi Seçiniz : ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı : ");
                             price = scanner.nextInt();
                            hesapMiktari += price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı : ");
                             price = scanner.nextInt();
                             if (hesapMiktari<price){
                                 System.out.println("Bakiyenizden Daha Fazla Para Çekemezsiniz.");
                             }else {
                                 hesapMiktari -= price;
                             }
                            break;
                        case 3:
                            System.out.println("Hesap Miktarınız : "+hesapMiktari);
                            break;
                        default:
                            break;
                    }
                } while (select != 4);
                System.out.println("İyi Günler Dileriz ! ");
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Edilmiştir. Lüften Banka İle İletişime Geçiniz !");
                } else {
                    System.out.println("Hatalı Giriş Yaptınız. Tekrar Deneyiniz.");
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
