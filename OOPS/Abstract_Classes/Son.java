package OOPS.Abstract_Classes;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be coder");
    }

    @Override
    void partner() {
        System.out.println("I love samantha");
    }
}
