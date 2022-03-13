package Metotlar.Hesap_Makinesi_3;

import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("2. sayı 0'dan farklı olmalıdır.");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üslü Sayı Hesabı : " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod İşleminin Sonucu : " + result);
        return result;
    }

    static void calulate(int a, int b) {
        System.out.println("Çevresi : " + 2 * (a + b));
        System.out.println("Alanı : "+a*b);
    }
    static void factorial(int a){
        int result=1;
        for (int i=1;i<=a;i++){
            result *=i;
        }
        System.out.println("Faktöriyel Sonucu : "+result);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "8- Faktoriyel Hesaplama\n"
                + "0- Çıkış Yap";

        while (true) {

            System.out.println(menu);
            System.out.print("Bir İşlem Seçiniz : ");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("Birinci Sayıyı Giriniz  : ");
            int a = scan.nextInt();
            System.out.print("İkinci Sayıyı Giriniz : ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    calulate(a,b);
                    break;
                case 8:
                    factorial(a);
                    break;
                default:
                    System.out.println("Geçersiz Bir İşlem Girdiniz !");
            }
        }

        System.out.println("Güle Güle !");


    }
}
