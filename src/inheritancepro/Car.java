package inheritancepro;


	public class Car extends Vehicle 
	{
	    private int numDoors;
	    private String transmissionType;

	    public Car(String color, String make, String model, int year, int numDoors, String transmissionType) {
	        super(color, make, model, year);
	        this.numDoors = numDoors;
	        this.transmissionType = transmissionType;
	    }

	    public int getNumDoors() 
	    {
	        return numDoors;
	    }

	    public String getTransmissionType()
	    {
	        return transmissionType;
	    }

	    @Override
	    
	    public void startEngine()
	    {
	        System.out.println("Starting the car engine...");
	    }

	    @Override
	    public void displayInfo() 
	    {
	        super.displayInfo();
	        System.out.println("Car Details: " + numDoors + " doors, " + transmissionType + " transmission");
	    }
	}


