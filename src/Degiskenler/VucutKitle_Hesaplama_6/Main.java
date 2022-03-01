package Degiskenler.VucutKitle_Hesaplama_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo, boy, index;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz : ");
        kilo = scanner.nextDouble();

        System.out.print("Boyunuzu Metre Cinsinden Giriniz : ");
        boy = scanner.nextDouble();

        index = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndex'iniz : "+index);
    }
}
