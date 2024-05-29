package inheritancepro;


	public class ElectricCar extends Car 
	{
	    private int batteryCapacity; // in kWh
	    private int range; // in miles

	    public ElectricCar(String color, String make, String model, int year, int numDoors, String transmissionType, int batteryCapacity, int range) {
	        super(color, make, model, year, numDoors, transmissionType);
	        this.batteryCapacity = batteryCapacity;
	        this.range = range;
	    }

	    public int getBatteryCapacity()
	    {
	        return batteryCapacity;
	    }

	    public int getRange()
	    {
	        return range;
	    }

	    @Override
	    public void startEngine()
	    {
	        System.out.println("Starting the electric car silently...");
	    }

	    @Override
	    public void displayInfo() 
	    {
	        super.displayInfo();
	        System.out.println("Electric Car Details: Battery Capacity - " + batteryCapacity + " kWh, Range - " + range + " miles");
	    }
	}


