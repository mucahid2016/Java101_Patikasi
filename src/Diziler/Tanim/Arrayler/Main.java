package Diziler.Tanim.Arrayler;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int[] list2 = {45, 96, 56};
        double[] list3 = {1.2, 1.3, 1.4};
        int[] dizi = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
        int[] copyDizi = Arrays.copyOfRange(dizi, 2,5);
        System.out.println(Arrays.toString(copyDizi));
        System.out.println("======");
        System.out.println(Arrays.equals(list,list2));
//        System.out.println(HelperArray.search(list,79));
        Arrays.sort(dizi);
        System.out.println(Arrays.binarySearch(dizi, 79));
//
//        Arrays.fill(list, 2, 5, 10);
//        System.out.println(Arrays.toString(list));

//        HelperArray helper = new HelperArray();
//        helper.print(list);
//        System.out.println();
//        helper.print(list2);
//        System.out.println();
//        System.out.println(list3);
//        System.out.println();
//        System.out.println("======");

    }
}
