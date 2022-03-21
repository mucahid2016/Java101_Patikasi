package Siniflar.Tanim;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "Audi A7";
        audi.type = "Sports";
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.decreaseSpeed(10);
        audi.printSpeed();


        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;
        bmw.increaseSpeed(100);
        bmw.increaseSpeed(100);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 30;
        mercedes.printSpeed();
    }
}
