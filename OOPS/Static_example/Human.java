package OOPS.Static_example;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    static void message(){
        System.out.println("Hello World");
//        System.out.println(this.name); // --> this will give error  'this' cannot be referenced from a static context
//        System.out.println(Human.age); // --> error Non-static field 'age' cannot be referenced from a static context
        System.out.println(Human.population);
    }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
//        this.population +=1; --> this will give right ans bcoz obj has no variable pop then it will check main class
        Human.population +=   1; //--> convention to follow;
        Human.message();
    }
}
