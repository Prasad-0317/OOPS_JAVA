package OOPS.Interfaces;

public class NiceCar{
    private Engine engine = new PowerEngine();
    private Media player = new CDPlayer();

    public NiceCar() {
        this.engine = new PowerEngine();
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public void changeEngine() {
        this.engine = new ElectricEngine();
    }
}
