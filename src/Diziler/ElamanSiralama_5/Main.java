package Diziler.ElamanSiralama_5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu : ");
        int[] n = new int[input.nextInt()];

        for (int i = 0; i < n.length; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            n[i] = input.nextInt();
        }
        Arrays.sort(n);
        System.out.println("Sıralama : "+Arrays.toString(n));

    }
}
