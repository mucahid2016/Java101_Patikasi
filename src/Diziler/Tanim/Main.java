package Diziler.Tanim;

public class Main {
    static int[] reverse(int[] list) {
        int[] reverse = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            reverse[i] = list[j];
        }
        return reverse;
    }

    static void printArry(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    static void printArry(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (i * 10) + 10;
            System.out.println(list[i]);
        }

        System.out.println("  ==============  ");

        double[] list2 = {10.1, 20.3, 30.6, 40.9, 50.8, 60, 70, 80, 90, 100};
        System.out.println(list2[0]);

        System.out.println("===========");

        printArry(list);
        System.out.println("========");
        printArry(list2);
        System.out.println();
        System.out.println();

        int[] newList=reverse(list);
        printArry(newList);
    }
}
