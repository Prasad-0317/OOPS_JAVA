package OOPS;

public class Test_overloading {
    void show(Object a){
        System.out.println("object method");
    }
    void show(StringBuffer a){
        System.out.println("stringbuffer method");
    }
    void show(String a){
        System.out.println("string method");
    }

    public static void main(String[] args) {
        Test_overloading t = new Test_overloading();
//        t.show("abc");
//        t.show(new StringBuffer("a"));
//        t.show(null); --> erorr
        t.show('c');
    }
}
