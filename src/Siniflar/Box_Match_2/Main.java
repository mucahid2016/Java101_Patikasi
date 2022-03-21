package Siniflar.Box_Match_2;

public class Main {
    public static void main(String[] args) {
        Fighter f1= new Fighter("Zed",10,120,75,30,50);
        Fighter f2=new Fighter("Yasuo",20,85,85,10,50);

        Match match=new Match(f1,f2,70,90);
        match.run();
    }
}
