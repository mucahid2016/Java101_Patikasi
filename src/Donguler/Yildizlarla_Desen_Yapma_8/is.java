package Donguler.Yildizlarla_Desen_Yapma_8;

import java.util.Scanner;

public class is {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz : ");
        int n=scanner.nextInt();
        int i=1, k=1,j=1;

        while (i<=n){
            while (k<=(n-i)){
                System.out.print(" ");
                k++;
            }
            while (j<=2*i-1){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();

        }

    }
}
