package OOPS.Static_example;
// outside classes can not be static because they are not dependent on any other class

class Test{ // --> this will not give error bcoz test now is not dependent on any other classes
    static String name;
    public Test(String name) {
        Test.name = name;
    }
}
public class InnerClasses {
//    class Test{ // --> this will give error bcoz test now is dependent on any other classes like innerclasses
//    this need to have instance of outer class
//   if we use static keyword no need to create instance of outside class so no error
//    static class Test --> mean that it will not depend on objects of outside class
    static class Test{
        String name;
//        static String name; --> this will print pr pr
        public Test(String name) {
            this.name = name;
        }

    @Override
    public String toString() {
        return name;
    }
}

    public static void main(String[] args) {
        Test a = new Test("Prasad");
        Test b = new Test("Rahul");
//        System.out.println(a.name);
//        System.out.println(b.name);
        System.out.println(a);
    }
}
