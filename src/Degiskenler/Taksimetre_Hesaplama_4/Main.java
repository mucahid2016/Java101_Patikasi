package Degiskenler.Taksimetre_Hesaplama_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double gidilecekMesafe, acilisUcreti = 10, kmBasiUcret = 2.20, tutar, toplamTutar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Gidilecek mesafe : ");
        gidilecekMesafe = scan.nextDouble();

        tutar = acilisUcreti + (gidilecekMesafe * kmBasiUcret);
        toplamTutar = (tutar <= 20) ? 20 : tutar;
        System.out.println( "Toplam Tutar : "+toplamTutar);
    }
}
