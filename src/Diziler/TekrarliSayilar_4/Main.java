package Diziler.TekrarliSayilar_4;

import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 2, 9, 10, 21, 1, 33, 1, 9};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] % 2 == 0 && list[j] % 2 == 0)) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        System.out.print("Dizideki Çift Sayılar :");
        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(" " + value);
            }
        }
    }
}
