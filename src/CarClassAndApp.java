import com.sun.media.sound.SoftTuning;

public class CarClassAndApp {

    public static void main(String[] args) {

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
        System.out.println("Pages: " + c.getPages());

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