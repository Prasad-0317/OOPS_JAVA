package OOPS.Interfaces;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Power Engine start..");
    }

    public PowerEngine() {
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stop..");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine acc..");
    }
}
