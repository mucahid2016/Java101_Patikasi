package Diziler.Tanim;

public class ForEach {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};
        for (int i = 0; i < list.length; i++) {
            //System.out.println(list[i]);
        }

        for (int i : list) {
            System.out.println(i);
        }
        System.out.println("=====");

        String[] cars = {"BMW", "Mercedes,", "Audi"};

        for (String string : cars) {
            System.out.println(string);
        }
        System.out.println("0=============1==============0");

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] row : matris){
            for (int col :row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
