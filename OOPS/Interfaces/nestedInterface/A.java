package OOPS.Interfaces.nestedInterface;

public class A {
    public interface NestedInt{
        boolean isOdd(int num);
    }
}
class B implements A.NestedInt{

    @Override
    public boolean isOdd(int num) {
        return num%2 ==1;
    }
}
