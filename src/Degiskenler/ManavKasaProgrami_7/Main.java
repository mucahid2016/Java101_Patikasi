package Degiskenler.ManavKasaProgrami_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo, armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut kaç Kilo ? : ");
        kilo = scanner.nextDouble();
        toplam += armut * kilo;

        System.out.print("Elma kaç Kilo ? : ");
        kilo = scanner.nextDouble();
        toplam += elma * kilo;

        System.out.print("Domates kaç Kilo ? : ");
        kilo = scanner.nextDouble();
        toplam += domates * kilo;

        System.out.print("Muz kaç Kilo ? : ");
        kilo = scanner.nextDouble();
        toplam += muz * kilo;

        System.out.print("Patlıcan kaç Kilo ? : ");
        kilo = scanner.nextDouble();
        toplam += patlican * kilo;
        System.out.println("Toplam Tutar : " + toplam + " TL");
    }
}
