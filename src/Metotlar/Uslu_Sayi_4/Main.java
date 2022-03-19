package Metotlar.Uslu_Sayi_4;

import java.util.Scanner;

public class Main {
    static int power(int n, int k) {

        //1 3 9 27 81
        //n^0=1
        //n^1=n
        //n^2=n.n
        //n^3=n.n.n
        if (k == 0) {
            return 1;
        }
        int result = power(n, k - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        System.out.print("Taban değeri giriniz : ");
        n = sc.nextInt();
        System.out.print("Üs Değerini Giriniz : ");
        k = sc.nextInt();
        System.out.println(power(n, k));
    }
}
