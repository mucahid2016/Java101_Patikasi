package Donguler.Harmonik_Seri_Hesaplama_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner inp=new Scanner(System.in);
        System.out.print("N Sayısını Giriniz : ");
        sayi=inp.nextInt();
        double result=0;

        for (int i=1;i<=sayi;i++){
            result+=(1.0/i);
        }
        System.out.println(result);
    }
}
