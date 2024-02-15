package OOPS.Static_example;

public class Class_static {
    public class X {
         static void greetings(){
            System.out.println("hello i am in x");
        }
    }
    public class Y extends X {
//        @Override
//        static void greetings(){
//            System.out.println("hello i am in y");
//        }

    }
    public static void main(String[] args) {
        X.greetings();
        Y.greetings(); // here Y can also access the static function
    }
}

//Class Static Methods can be inherited but Interface Static Methods can't.
//  Because classes doesn't support multiple inheritance,so the subclass can inherit the the static methods because
// it knows that it is coming from its parent class not from multiple classes.