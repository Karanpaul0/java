
public class Car {

    static int noOfCarSold;

    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLeters;
    int noOfSeats;

    public Car start() {
        if (currentFuelInLeters == 0) {
            System.out.println("Empty Fuel,Car cannot start, Please refuel");
        } else if (currentFuelInLeters < 5) {
            System.out.println("Your car is in reserved, please refuel it");

        } else {
            System.out.println("Your car is Started,Bruhhhuu..urrr...hhurhhh....");

        }
        return this;
    }


    static{
        noOfCarSold=0;
        //static block create only one time.
        System.out.println("I am inside the static block");
    }
    {
        System.out.println("I am inside the initialization block");
        noOfCarSold++;
    }

// parameterised constructor 

    Car(String color){
        noOfSeats=5;
        noOfWheels=4;
        maxSpeed=150;
        currentFuelInLeters=2;
        this.color=color;
    }

    // constructor chaining
    // default counstructor

    Car(){
        this("red");
        currentFuelInLeters=5;
        maxSpeed=250;
    }

    public void drive() {
        currentFuelInLeters--;
        System.out.println("Your car is driving");

    }

    public void addFuel(float currentFuelInLeters) {
       this. currentFuelInLeters += currentFuelInLeters;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLeters;
    }
}
