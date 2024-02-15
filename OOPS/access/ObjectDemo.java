package OOPS.access;

public class ObjectDemo {
    int num;
    float gpa;
    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

//    @Override
//    public boolean equals(ObjectDemo obj) {
////        return this.num == ((ObjectDemo)obj).num;
//        return this.num == obj.num;
//    }
    @Override
    public boolean equals(Object obj) {
        return this.gpa == ((ObjectDemo)obj).gpa;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 =new ObjectDemo(5,9f);
        ObjectDemo obj2 =new ObjectDemo(5,9f);
        System.out.println(obj2.getClass().getSuperclass());
//        ObjectDemo obj2 = obj;
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

        if(obj1 == obj2){ // --> it will give false it checks reference variables go to string lecture of kunal
            System.out.println("obj1 is equal to obj2");
        }
        if(obj2.equals(obj1)){
            System.out.println("obj1 is equal to obj2");
        }
        else{
            System.out.println("obj1 is not equal to obj2");
        }
    }
}
