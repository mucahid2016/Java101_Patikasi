package Diziler.Harf_Yazdirma_3;

public class BYazdirma {
    public static void main(String[] args) {
        String[][] harfYapma = new String[7][4];

        for (int i = 0; i < harfYapma.length; i++) {
            for (int j = 0; j < harfYapma[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    harfYapma[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    harfYapma[i][j] = " * ";
                }else {
                    harfYapma[i][j]="   ";
                }

            }
        }
        for (String[] row: harfYapma){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
