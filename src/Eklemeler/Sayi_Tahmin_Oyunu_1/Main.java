package Eklemeler.Sayi_Tahmin_Oyunu_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
//        double number = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;

        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);

        while (right < 5) {
            System.out.print("Lütfen Tahmininizi Giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 100) {
                System.out.println("Lütfen 0-100 arası rakam giriniz. ");
                if (isWrong) {
                    right++;
                    System.out.println("Çok Hatalı Giriş Yaptınız ! Kalan Hakkınız : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir dahaki hatalı girişinizde can hakkınızdan düşecektir !");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler Doğru Tahmin ! " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı Bir Sayı Girdiniz : ");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdanbüyüktür. ");
                }
                wrong[right] = selected;
                right++;
                System.out.println("Kalan Hakkı : " + (5 - right));
            }
        }

        if (!isWin && !isWrong) {
            System.out.println("Kaybettiniz !");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}
