package Metotlar.Konular.Overloading;

public class Main {
    static void print() {
        System.out.println("Parametresiz Metot");
    }

    static void print(int a) {
        System.out.println("Parametreler : " + a);
    }

    static void print(double a) {
        System.out.println("Parametreler : " + a);
    }

    static int print(int a, int b) {
        return a + b;
    }

    static int print(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        print();
        print(12);
        print(12.9);
        System.out.println(print(2, 3));
        System.out.println(print(2,34,5));
    }
}
