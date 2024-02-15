package OOPS.Interfaces.StaticMethod;

public class Main implements  A,B{
// it should have weaker access privileges than A and B
    @Override
    public void greet() {
    }

    public static void main(String[] args) {
//        Main obj = new Main();
        A.greeting();
    }
}
