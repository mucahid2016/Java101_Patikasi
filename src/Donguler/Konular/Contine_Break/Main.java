package Donguler.Konular.Contine_Break;

public class Main {
    public static void main(String[] args) {


        int i=1;
        while (i<=10){
            i++;
            if (i%2==0){
                continue;
            }
            System.out.println(i);
        }


//
//        for (int i = 1; i <= 10; i++) {
//            if (i==5){
//                System.out.println("İ değeri 5'tir");
//                continue;
//            }
//            System.out.println(i);
//        }


//        for (int i = 1; i <= 10; i++) {
//            if (i==5){
//                System.out.println("İ değeri 5'tir");
//                break;
//            }
//            System.out.println(i);
//        }

    }
}
