package OOPS.access;

public class A {
    protected int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}

// Public means can access inside class everywhere
// default is private for another package but one can access it inside same package