package Donguler.Fibonacci_Serisi_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, n1 = 0, n2 = 1, n3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Değerini Giriniz : ");
        n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            n3 = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
