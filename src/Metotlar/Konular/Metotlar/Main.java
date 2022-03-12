package Metotlar.Konular.Metotlar;

public class Main {
    static void helloWorld(){
        System.out.println("Merhaba Dünya !");
    }

    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {

        int n1 = 2, n2 = 3;
        int case1 = power(n1, n2);
        System.out.println(case1);

        System.out.println("---------");

        System.out.println(power(2,3));
        System.out.println("*******");

        helloWorld();
    }
}
