package Diziler.Tanim;

public class TEkBoyutluDiziler {
    public static void main(String[] args) {
        double[] list = new double[5];
        list[0]=10.0;
        list[1]=20.0;
        list[2]=30.0;
        list[3]=40.0;
        list[4]=50.0;
        System.out.println(list[3]);

        String[] days={"parazreti","salı","çarşamba"};

        for (int i=0;i< days.length;i++){
            System.out.println(days[i]);
        }
    }
}
