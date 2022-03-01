package Degiskenler.Kdv_Hesaplama_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen tutarı giriniz : ");
        double tutar = scanner.nextDouble();

        double kdvMiktari = (tutar <= 1000) ? 0.18 : 0.08;
        System.out.println("KDV Tutarı : " + kdvMiktari * tutar);

        double toplamTutar = tutar + kdvMiktari*tutar;
        System.out.println("Toplam Tutar : " + toplamTutar);

    }
}
