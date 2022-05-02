package FST_Java;

public class Activity1car {

    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    
    //constructor
    Activity1car()
    {
    	tyres=4;
    	doors=4;
    }
    
    public void displayCharacteristics() {
    	System.out.println("Color of the car:"+color);
    	System.out.println("Make of the Car: " + make);
    	System.out.println("Transmission of the Car: " + transmission);
    	System.out.println("Number of doors on the car: " + doors);
        System.out.println("Number of tyres on the car: " + tyres);
    }
    public void accelarate() {
    	System.out.println("Car is moving forward");
    	
    }
    public void brake() {
    	System.out.println("Car was stopped");
    } 
}
