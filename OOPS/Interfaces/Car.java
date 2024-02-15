package OOPS.Interfaces;

public class Car implements Engine,Brake,Media{
    int a = 10;
    @Override
    public void brake() {
        System.out.println("I Brake");
    }

    @Override
    public void start() {
        System.out.println("I start");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine");
    }

//    @Override
    public void acc() {
        System.out.println("I acc");
    }
}
