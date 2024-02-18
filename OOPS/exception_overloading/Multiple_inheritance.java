package OOPS.Interfaces;

public interface i1 {
    void show();
//    int a = 10;
    // default methods can be created inside interfaces
}
interface i2{
    void display();
}
class Test implements i1,i2{
    public void show(){
        System.out.println("1");
    }

    @Override
    public void display() {
        System.out.println("2");
    }
    // below will give error showing weaker access privileges
//     void show(){
//        System.out.println("1");
//    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.display();
    }
}

//
