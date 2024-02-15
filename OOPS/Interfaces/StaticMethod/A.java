package OOPS.Interfaces.StaticMethod;

public interface A {
    // Static methods in interfaces should have a body
    // call via interface name
     static void greeting(){
        System.out.println(("Hi i am static method"));
    }
    void greet();
}
