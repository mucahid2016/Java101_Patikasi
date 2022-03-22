package Diziler.OrtBul_1;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int sum = 0;
        double seri = 0;
        for (int i = 0; i < a.length; i++) {
            seri += 1.0 / a[i];
        }
        double harmonikOrt = (a.length) / seri;
        System.out.println("Harmonik Ortalama : " + harmonikOrt);

//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//        }
//        System.out.println("Ortalama : " + sum / a.length);


    }
}
