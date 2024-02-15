package OOPS.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car(); // which one can access depends on left side
//        int b = car.a; // --> access when Car car = new Car();
//        System.out.println(b);
//        car.start();
//        car.stop(); // error because brake has not method
//        car.acc(); // this will not give error ((Car) car).acc();
//        car.brake();
//        Media carMedia = new Car();
//        carMedia.stop(); // problem bcoz we are calling media and it stop engine
        // to prevent this we have to add distinct classes

        NiceCar carMed = new NiceCar();
        carMed.start();
        carMed.stop();
        carMed.startMusic();
        carMed.changeEngine();
        carMed.start();
    }
}
