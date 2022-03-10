package Donguler.AsalSayiBulma_14;

/*
  Ödev
  Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
*/

public class Main {
    public static void main(String[] args) {

        for (int i=2;i<100;i++){
            boolean isPrime=true;
            for (int k=2;k<i;k++){
                if (i%k==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
            }
        }
    }
}
