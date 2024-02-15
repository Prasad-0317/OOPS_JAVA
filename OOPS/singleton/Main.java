package OOPS.singleton;

import OOPS.access.A;

public class Main {
    public static void main(String[] args) {
        //    Singleton obj = new Singleton(); // private so cant access
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        // all 3 ref variables are pointing to just one object;
        A ob = new A(10,"psc");
//        int num = ob.num;
//        System.out.println(num);
    }
}
