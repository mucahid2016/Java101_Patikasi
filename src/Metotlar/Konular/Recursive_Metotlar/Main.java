package Metotlar.Konular.Recursive_Metotlar;

public class Main {


    static int fx(int n) {
        System.out.println("n => " + n) ;
        if (n == 1) {
            return 1;
        }
        int result = fx(n - 1) + n;
        System.out.println("result >= " + result);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(fx(4));

    }
}
