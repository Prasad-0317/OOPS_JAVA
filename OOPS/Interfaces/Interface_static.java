package OOPS.Interfaces;

public class Interface_static {
    public interface A {
        static void greetings(){
            System.out.println("Hello I am in A ");
        }
    }
    public interface B {
        static void greetings(){
            System.out.println("Hello I am in B");
        }
    }
    public static class C implements A,B{
          static void greetings() {
//            System.out.println("Hello I am in C");
        }
    }

    public static void main(String[] args) {
        A.greetings();
        B.greetings();
        C.greetings(); // this will throw error at compile time (because Static methods in interface are not inherited )
    }
}

//    whereas in Interface Static Methods which cannot be inherited,
//    the class or subclass implementing it can get confused to access which method because there can be multiple
//    interface having the same method, as interfaces support Multiple Inheritance.
