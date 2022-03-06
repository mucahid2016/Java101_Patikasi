package Kosullu_İfadeler.Bilet_Hesaplama_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mesafe, yas, yolculukTipi, tutar, yasTutar = 0, toplamTutar = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = scanner.nextDouble();
        tutar = mesafe * 0.10;

        if (mesafe > 0) {
            tutar = tutar;
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        System.out.print("Yaşınızı Giriniz : ");
        yas = scanner.nextDouble();
        if (0 < yas) {
            if (yas < 12) {
                yasTutar = tutar - (tutar * 0.50);
            } else if (yas >= 12 || yas <= 24) {
                yasTutar = tutar - (tutar * 0.10);
            } else if (yas > 24 || yas < 65) {
                yasTutar = tutar;
            } else {
                yasTutar = tutar - (tutar * 0.30);
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = scanner.nextDouble();

        if (yolculukTipi == 1) {
            toplamTutar = yasTutar;
            System.out.print("Toplam Tutar = " + toplamTutar);
        } else if (yolculukTipi == 2) {
            toplamTutar = 2 * (yasTutar - (yasTutar * 0.20));
            System.out.print("Toplam Tutar = " + toplamTutar);
        } else {
            System.out.println("Hatalı Veri Giriniz !");
        }


    }
}
