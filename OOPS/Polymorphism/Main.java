package OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circles();
//        Square square = new Square();
//        Shapes shape = new Square();
        circle.area();
    }
}
