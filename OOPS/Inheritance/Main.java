package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 7.9, 9.9);
        double ans = box1.getL();
        System.out.println(ans);
//        Box box2 = new Box(box1);
//        System.out.println(box1.w + " " + box1.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box3.h + " " + box3.weight);


//        Box box5 = new BoxWeight(2, 9, 4, 8);
//        BoxWeight other=new Box(box5);
//        Box old = new BoxWeight(BoxWeight other);
        // type of obj ( BW ) will not decide what member can be access , decide by type of reference variable
        // we cannot access weight in BW here
//        System.out.println(box5.h);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
        // you cannot have child reference variable and parent objet

//        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6);
//
//        Box.greeting();

//        BoxWeight box = new BoxWeight();

//        box.greeting(); // you can inherit but you cannot override

//        BoxPrice box = new BoxPrice(5,8,200);

    }
}
