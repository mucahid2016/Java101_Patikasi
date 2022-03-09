package Donguler.Armstorng_Sayi_Bulma_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Değerlerini toplamak istediğiniz sayıyı giriniz : ");
        a = input.nextInt();

        while (a != 0) {
            int rakam = a % 10;
            sum += rakam;
            a /= 10;
        }
        System.out.println("Rakamlarım tolamı: "+sum);

        //////////////////
//        System.out.print("Sayı Giriniz : ");
//        int number = input.nextInt();
//        int basNumber = 0;
//        int tempNumber = number;
//        int basValue;
//        int result = 0;
//        int basPow;
//
//        while (tempNumber != 0) {
//            tempNumber /= 10;
//            basNumber++;
//        }
//
//        tempNumber = number;
//        while (tempNumber != 0) {
//            basValue = tempNumber % 10;
//            basPow = 1;
//            for (int i = 1; i <= basNumber; i++) {
//                basPow *= basValue;
//            }
//            result += basPow;
//            tempNumber /= 10;
//        }
//
//        if (result == number) {
//            System.out.println(number + " sayısı ARMSTRONG sayıdır.");
//        } else {
//            System.out.println(number + " sayısı ARMSTRONG sayı değildir.");
//        }

//        int a = 2451, basamakSAyisi = 0, numberCounter = 0;
//
//        //Basamak Sayısı Bulma İşlemi
//        //2451 /10 =245
//        //245 / 10 = 24
//        //24 / 10 = 2
//        // 2 / 10 = 0
//
//        while (a != 0) {
//            numberCounter++;
//            a = a / 10;
//        }
//
//        // Bir Sayının Son Basamağını Bulma
//        //2451 % 10 = 1


    }
}
