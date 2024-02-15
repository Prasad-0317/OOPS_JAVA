package OOPS.Static_example;

public class Main {
    public static void main(String[] args) {
        Human prasad = new Human(20,"Prasad" ,100000,false);
        Human rahul = new Human(20,"rahul" ,10000,false);
//        Human ath = new Human(20,"Atharv" ,10000,false);
//        System.out.println(prasad.population); // --> print 1 if static is not used
//        System.out.println(rahul.population);
//        System.out.println(Human.population);
//        greeting(); //--> noon static method cannot be access inside static method
        Main funn = new Main();
        funn.fun2();
    }
    // something which is not static , belongs to an object
    // static will not have instance
    // greeting will have instance

    // this is not dependent on object
    static void fun(){
//        greeting(); // u cannot use this bcoz this requires instance
        // but the function you are using it in does not depend on instances

        // we cannot access non static stuff without referencing their instances in static context
        Main obj = new Main();
        obj.greeting();
    }
    void fun2(){
        greeting();
    }
    void greeting(){
//        fun(); --> we can use static functions inside non static
        System.out.println("Hello");
    }
}
