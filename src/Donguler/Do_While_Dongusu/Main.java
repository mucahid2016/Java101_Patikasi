package Donguler.Do_While_Dongusu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass;
        boolean askPassWord = true;
        do {
            System.out.print("Parolayı Girin : ");
            pass = input.nextInt();
            if (pass==123){
                System.out.println("Doğru");
                askPassWord=false;
            }else {
                System.out.println("Yanlış");
            }
        }while (askPassWord);

//        int year=2021;
//        do {
//            System.out.println(year);
//            year++;
//        }while (year<2021);
    }
}
