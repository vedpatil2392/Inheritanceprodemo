package inheritancepro;


	public abstract class Vehicle
	{
	    private String color;
	    private String make;
	    private String model;
	    private int year;

	    public Vehicle(String color, String make, String model, int year) 
	    {
	        this.color = color;
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }

	    public String getColor()
	    {
	        return color;
	    }

	    public String getMake() 
	    {
	        return make;
	    }

	    public String getModel()
	    {
	        return model;
	    }

	    public int getYear() 
	    {
	        return year;
	    }

	    public void displayInfo()
	    {
	        System.out.println("Vehicle Info: " + year + " " + make + " " + model + " (" + color + ")");
	    }

	    public abstract void startEngine(); // Abstract method
	}



