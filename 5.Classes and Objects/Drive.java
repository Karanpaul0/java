

public class Drive{
    public static void main(String[] args){
        Car swift=new Car("blue");
        Car thar=new Car();

        thar.start().drive();
        System.out.println(thar.color);
        System.out.println(thar.maxSpeed);
        System.out.println(thar.currentFuelInLeters);
        // swift.addFuel(6);
        // swift.start().start().start().drive();
        // System.out.println(swift.currentFuelInLeters);
        swift.start().drive();
        System.out.println("Colour:- "+swift.color);
        System.out.println("Max Speed:- "+swift.maxSpeed);
        System.out.println(swift.currentFuelInLeters);


    }
}