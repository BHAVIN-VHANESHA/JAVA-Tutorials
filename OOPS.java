class Car {
    String color, name, type;

    //functions which are defined in class are called methods
    public void run() {
        System.out.println("racing");
    }
    public void fun() {
        System.out.println(this.color);
        System.out.println(this.name);
        System.out.println(this.type);
    }

    // 'this' is a key word which specify property of an object when it is called by an object
//    public void type() {
//        System.out.println(this.type);
//    }
//
//    public void color(){
//        System.out.println(this.color);
//    }
//
//    public void name(){
//        System.out.println(this.name);
//    }

    //constructor
    Car(Car car2){
        this.name = car2.name;
        this.color = car2.color;
        this.type = car2.type;
    }
    Car(){
    }
}

// data are referred to data types and members are referred to functions of object

public class OOPS {
    public static void main(String[] args) {

        //objects are made here(in main function)
        Car car1 = new Car();
        //using properties
        car1.color = "black";
        car1.name = "Audi R8 V10";
        car1.type = "sport";

        Car car2 = new Car(car1);
//        car2.color = "red";
//        car2.name = "bugatti";
//        car2.type = "grand sport";

        car2.fun();
        //car1.fun();

        //now calling the method(function) 'this' simply tells the function which object called
//        car1.run();
//        car1.color();
//        car1.type();
//        car1.name();

//        car2.run();
//        car2.color();
//        car2.name();
//        car2.type();
    }
}