package Donguler.EbobEkok_Bulma_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 Sayısını Giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 Sayısını Giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;
        int i = 1;

        if (n1 < n2) {
            while (i <= n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        } else if (n1 == n2) {
            while (i <= n2 ) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        } else {
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        }
        System.out.println("Ebob Değeri : " + ebob);
        System.out.println("Ekok Değeri : " + (n1 * n2) / ebob);


//        for (int i=1;i<=n1*n2;i++){
//            if (i%n1==0&&i%n2==0){
//                System.out.println(i);
//                break;
//            }
//        }


//        int ebob=1;
//        for (int i=1;i<=n1;i++){
//            if (n1%i==0 && n2%i==0){
//                System.out.println(ebob);
//                ebob=i;
//            }
//        }
//
//        for (int k =n1; k>=1;k--){
//            if (n1%k==0 && n2%k==0){
//                ebob=k;
//                System.out.println(ebob);
//                break;
//            }
//        }
    }
}
