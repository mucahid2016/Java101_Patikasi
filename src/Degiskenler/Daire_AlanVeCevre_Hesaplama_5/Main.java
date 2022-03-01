package Degiskenler.Daire_AlanVeCevre_Hesaplama_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14, yariCapi, alan, cevre;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin Yarı Çapı'nı giriniz : ");
        yariCapi = scanner.nextDouble();

        alan = pi * yariCapi * yariCapi;
        System.out.println("Dairenin Alanı : " + alan);

        cevre = 2 * pi * yariCapi;
        System.out.print("Dairenin Çevresi : " + cevre);

    }
}
