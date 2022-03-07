package Donguler.While_Dongusu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int password;
        Scanner sc = new Scanner(System.in);
        System.out.print("Şifre Giriniz : ");
        password=sc.nextInt();

        if (password==123){
            System.out.println("Doğru");
        }else {
            System.out.println("Yanlış");
        }



//        int left=100, right=200;
//        while (++left<--right);
//        System.out.println("100 ve 200'ün ortak Noktası : "+left);

        //////////

//        int i=1,k;
//        System.out.println("Program Başladı.");
//        while (i<=5){
//            System.out.println(i);
//            i++;
//            k=1;
//            while (k<=10){
//                System.out.print(k+"-");
//                k++;
//            }
//            System.out.println();
//        }
//        System.out.println("Program Bitti.");
    }
}
