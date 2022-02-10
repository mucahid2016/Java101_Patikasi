package Degiskenler.Not_Hesaplama_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner Sınıfı tanımlanır
        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        mat = scan.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = scan.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = scan.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = scan.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = scan.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = scan.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);

        boolean gectiMi = sonuc >= 60;
        String str = (gectiMi) ? "Geçti" : "Kaldı";
        System.out.println(str);
    }
}
