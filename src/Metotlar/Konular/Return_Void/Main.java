package Metotlar.Konular.Return_Void;

public class Main {
    static int sum(int a, int b) {
        int result=a+b;
        System.out.println(result);
        return result;
    }

    static void sum2(int a, int b){
        int result=a+b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        int result = sum(5, 2)+sum(3,10);
        System.out.println(result);
        System.out.println("******++++****");
        sum2(5,99);

    }
}
