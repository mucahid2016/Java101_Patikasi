package Degiskenler.Taksimetre_Hesaplama_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double gidilecekMesafe, acilisUcreti = 10, kmBasiUcret = 2.20, toplamUcret, toplamTutar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Gidilecek mesafe : ");
        gidilecekMesafe = scan.nextDouble();

        toplamUcret = acilisUcreti + (gidilecekMesafe * kmBasiUcret);
        toplamTutar = (toplamUcret <= 20) ? 20 : toplamUcret;
        System.out.println( "Toplam Tutar : "+toplamTutar);
    }
}
