package Metotlar.Desene_Metot_6;

import java.util.Scanner;

public class Main {
    static void sayiDondurme(int a) {
        System.out.print(a + " ");
        if (a <= 0) return;
        sayiDondurme(a - 5);
        System.out.print(a + " ");
    }

    public static void main(String[] args) {
        // 15 10 5 0 5 10 15
        int a;
        Scanner ds = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        a = ds.nextInt();
        System.out.print("Çıktısı :");
        sayiDondurme(a);
    }
}
