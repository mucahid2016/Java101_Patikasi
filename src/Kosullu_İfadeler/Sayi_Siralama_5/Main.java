package Kosullu_İfadeler.Sayi_Siralama_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner =new Scanner(System.in);
        System.out.print("1. sayı : ");
        a=scanner.nextInt();

        System.out.print("2. sayı : ");
        b=scanner.nextInt();

        System.out.print("3. sayı : ");
        c=scanner.nextInt();

        if ((a<b)&&(a<c)){
            System.out.println("A en küçüktür.");
            if (b<c){
                System.out.println("B ikinnci küçük sayıdır. ");
                System.out.println("C en büyük sayıdır. ");
            }else  {
                System.out.println("C ikinci küçük sayıdır.");
                System.out.println("B en büyük sayıdır. ");
            }
        }else if(b<a&&b<c){
            System.out.println("B en küçüktür.");
            if (a<c){
                System.out.println("A ikinici  Bküçük SAyıdır.");
                System.out.println("C en büyük sayıdır.");
            }else {
                System.out.println("C ikinici küçük sayıdır.");
                System.out.println("A en büyük sayıdır.");
            }
        }else {
            System.out.println("C en küçük sayıdır. ");
            if (a<b){
                System.out.println("A ikinci küçük sayıdır.");
                System.out.println("B en büyük sayıdır.");
            }else {
                System.out.println("B ikinci küçük sayıdır.");
                System.out.println("A en büyük sayıdır. ");
            }
        }

    }
}
