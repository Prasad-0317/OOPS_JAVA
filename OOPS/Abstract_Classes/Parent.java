package OOPS.Abstract_Classes;

public abstract class Parent {
    int age;
    final int VALUE;
    public Parent(int age) {
        this.age = age;
        VALUE = 1234;
        System.out.println(VALUE);
    }
//    abstract Parent();
    static void hello(){
        System.out.println("Hi");
    }
    void normal(){
        System.out.println("Normal");
    }
    abstract void career();
    abstract void partner();
}
