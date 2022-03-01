package Degiskenler.Dik_Ucgen_Hesaplama_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz : ");
        a = scanner.nextDouble();

        System.out.print("2. Kenarı  giriniz : ");
        b = scanner.nextDouble();

        double c = (a * a) + (b * b);
        double sonuc = Math.sqrt(c);
        System.out.println("3. kenarının uzunluğu : " + sonuc);

        double cevre = a + b + sonuc;

        System.out.println("Üçgenin Çevresi : " + cevre);
        double u = cevre / 2;

        double alanKaresi = u * (u - a) * (u - b) * (u - sonuc);
        double alan = Math.sqrt(alanKaresi);
        System.out.print("Üçgenin Alanı : " + alan);
    }
}
