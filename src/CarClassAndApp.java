import java.util.Scanner;

public class CarClassAndApp {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        VehicleClass v = new VehicleClass();
        CarClass c = new CarClass();

        System.out.println(v.start());
        System.out.println(c.start());


        String color = "", mustang = "";

        System.out.println(v.speed());
        System.out.println(c.speed());

        //System.out.println("set your car color");
        mustang = keyboard.next();
        c.setColor(mustang);
        System.out.println("your car is " + c.getColor() + " now.");


        System.out.println("set your car model");
        mustang = keyboard.next();
        c.setModel(mustang);
        System.out.println("your cars is a" + c.getModel() + " now.");


        System.out.println("set your car speed");
        mustang = keyboard.next();

        System.out.println("set your car speed");



        /*c.setSpeed(getspeedtimes);
        System.out.println("your car is at " + c.getSpeed() + " mph.");


        System.out.println("set your car speed");












        /*
        //Object declarartion
        Product p = new Product();
        // Object initialization
        //p = new Product

        System.out.println(p);

        p.setCode("CODE-01");
        p.setDescription("Product 01 description");
        p.setPrice(50.00);

        System.out.println(p);

        Book b = new Book();
        b.setAuthor("Dr Suess");
        b.setPages(30);
        System.out.println("Author is: " + b.getAuthor());
        System.out.println("Pages: " + b.getPages());

        Book c = new Book();
        c.setAuthor("RL Stein");
        c.setPages(200);
        System.out.println("Author is: " + c.getAuthor());
        System.out.println("Pages: " + c.getPages());*/

        System.out.println();

    }

    private static void print(String s) {
        System.out.println(s);
    }



}



/*Create a class called Car. The Car class should inherit from the Vehicle class. Car should contain the following:

private member variables
a default constructor
an overloaded constructor
methods which return a string indicating each task the car is performing.
For example, the accelerate method will return a string that says "The car is accelerating" and the setSpeed(90) method will return a string that says "The Speed is 90 mph". The application will also contain getters and setters for each private member variable.

Create another class called CarApp which contains the main method. In the main method create an instance of a Car.

Then print the output of the different methods as the car object is "operated".

Your output should look something like this:

The red Porsche is starting
The red Porsche is accelerating
The red Porsche is going 50 mph
The red Porsche is stopped

Be creative and make up your own methods if you like.

Create a second instance of the car once your first car is working. Set its private member variables in the main method. Now you can call the methods of the second car in between the calls to the methods of the first car. Your program will keep the two separate. Here's an example. Your mileage may vary.

The red Porsche is starting
The blue Jetta is starting
The red Porsche is accelerating
The blue Jetta is accelerating
The blue Jetta has stopped to have its emissions checked
The blue Jetta passes its emission test
The red Porsche is going 50 mph
The red Porsche is stopped
The blue Jetta just passed the red Porsche
Previous Next
*/

//public static void main (String [] args){
//        Scanner keyboard = new Scanner(System.in);
//        Vehicle v = new Vehicle();
//        System.out.println(v.start());
//
//        Car c = new Car();
//        System.out.println(c.start());
//
//
//        String color="", tezla="";
//
//        System.out.println(v.speed());
//        System.out.println(c.speed());
//
//        //System.out.println("set your car color");
//        tezla = keyboard.next();
//        c.setColor(tezla);
//        System.out.println("your car is " + c.getColor() + " now.");
//
//
//        System.out.println("set your car model");
//        tezla = keyboard.next();
//        c.setModel(tezla);
//        System.out.println("your cars is a" + c.getModel() + " now.");
//
//
//        System.out.println("set your car speed");
//        tezla = keyboard.next();
//        /*c.setSpeed(tezla);
//        System.out.println("your car is at " + c.getSpeed() + " mph.");*/
//
//
//        System.out.println("wanna know how many clowns are in your car");
//        tezla = keyboard.next();
//        c.setBreaktimes(tezla);
//        System.out.println("you have " + c.getBreaktimes() + " clowns in your car.");
//
//
//        // 1. create a car object
//        // 2. demonstrate inheritancy by calling speed and color to your new car object
//        // THIS MEANS: do not create a vehicle object, set speed and color to the car
//
//
//
//
//        /*while ( x <1 ){
//            System.out.println("What up big boi welcome to leos garage. press y to enter:");
//            garage =keyboard.next();
//            if (garage.contains("y")){
//                System.out.println ("welcome to my garage big boi. below is a list if the following cars I have available: ");
//                System.out.println ("you can write the car name and ask for specific properties like the color, top speed, model: ");
//            }
//            else System.out.println("cant escape, not now big boi press y");
//        }