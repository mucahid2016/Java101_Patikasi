package Diziler.MinMax_Bulma_2;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax_Bulma_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        String list2 = Arrays.toString(list);
        System.out.println("Dizi : " + list2);

        System.out.print("Girilen Sayı : ");
        int n = scanner.nextInt();

        int max = list[0];
        int min = list[0];

        for (int i : list) {
            if (i > n) {
                if (i <= max) {
                    max = i;
                }
            }
        }

        for (int j : list) {
            if (j < n) {
                if (j >= min) {
                    min = j;
                }
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);

//        for (int i : list) {
//            if (i < min) {
//                min = i;
//            }
//            if (i > max) {
//                max = i;
//            }
//        }
//        System.out.println("Minimum Değer : " + min);
//        System.out.println("Maximum Değer : " + max);
    }
}
