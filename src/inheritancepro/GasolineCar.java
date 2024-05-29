package inheritancepro;


	public class GasolineCar extends Car 
	{
	    private int fuelCapacity; // in gallons
	    private int mpg; // miles per gallon

	    public GasolineCar(String color, String make, String model, int year, int numDoors, String transmissionType, int fuelCapacity, int mpg) {
	        super(color, make, model, year, numDoors, transmissionType);
	        this.fuelCapacity = fuelCapacity;
	        this.mpg = mpg;
	    }

	    public int getFuelCapacity() 
	    {
	        return fuelCapacity;
	    }

	    public int getMpg()
	    {
	        return mpg;
	    }

	    @Override
	    public void startEngine()
	    {
	        System.out.println("Starting the gasoline car engine");
	    }

	    @Override
	    public void displayInfo()
	    {
	        super.displayInfo();
	        System.out.println("Gasoline Car Details: Fuel Capacity - " + fuelCapacity + " gallons, MPG - " + mpg);
	    }
	}


