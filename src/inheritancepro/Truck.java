package inheritancepro;


	public class Truck extends Vehicle
	{
	    private double bedSize;
	    private int towingCapacity;

	    public Truck(String color, String make, String model, int year, double bedSize, int towingCapacity) {
	        super(color, make, model, year);
	        this.bedSize = bedSize;
	        this.towingCapacity = towingCapacity;
	    }

	    public double getBedSize() 
	    {
	        return bedSize;
	    }

	    public int getTowingCapacity() 
	    {
	        return towingCapacity;
	    }

	    @Override
	    public void startEngine() 
	    {
	        System.out.println("Starting the truck engine...");
	    }

	    @Override
	    public void displayInfo()
	    {
	        super.displayInfo();
	        System.out.println("Truck Details: Bed Size - " + bedSize + " cubic feet, Towing Capacity - " + towingCapacity + " lbs");
	    }
	}


