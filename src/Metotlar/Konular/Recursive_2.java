package Metotlar.Konular;

public class Recursive_2 {
    static int toplamBul(int n) {
        int sonuc = 0;
        for (int i = 1; i <= n; i++) {
            sonuc += i;
        }
        return sonuc;
    }

    static int toplamBul2(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + toplamBul2(n - 1);
        }
    }

    static int faktoriyel(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int faktoriyel2(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktoriyel(n - 1);
        }
    }

    static int fibonacci(int n) {
        int sonuc = 1;
        if (n == 1 || n == 1) {
            return sonuc;
        } else {
            int sayi1 = 1;
            int sayi2 = 1;
            for (int i = 1; i <= n; i++) {
                sonuc = sayi1 + sayi2;
                sayi1 = sayi2;
                sayi2 = sonuc;
            }
        }
        return sonuc;
    }

    static int fibonacci2(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci2(n - 1) + fibonacci2(n - 2);
        }
    }

    static int power(int x, int y) {
        int sonuc = 1;
        for (int i = 1; i <= y; i++) {
            sonuc *= x;
        }
        return sonuc;
    }

    static int power2(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * power2(x, y - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(toplamBul(5));
        System.out.println("---------");

        System.out.println(toplamBul2(5));
        System.out.println("************");

        System.out.println(faktoriyel(5));
        System.out.println("??????????????");

        System.out.println(faktoriyel2(5));
        System.out.println("*********");

        System.out.println(fibonacci(5));
        System.out.println("**********");

        System.out.println(fibonacci2(5));
        System.out.println("**********/*");

        System.out.println(power(3, 4));
        System.out.println("????????!!!!!!!");

        System.out.println(power2(3, 4));
        System.out.println("AGA BİTTİ !");
    }
}
