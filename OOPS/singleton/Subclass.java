package OOPS.singleton;

import OOPS.access.A;

public class Subclass extends A{
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass ob = new Subclass(10,"psc");
        int num = ob.num;
    }
}

 class SubSubclass extends Subclass{
//    protected int n;
    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass ob = new SubSubclass(10,"psc");
        int num = ob.num;
    }
}
//public class SubSubclass extends Subclass{
//    public SubSubclass(int num, String name) {
//        super(num, name);
//    }
//
//    public static void main(String[] args) {
//        A ob = new A(10,"psc");
//        int num = ob.num;
//    }
//}
// above is wrong A doesnot know about child