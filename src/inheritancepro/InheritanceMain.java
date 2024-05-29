package inheritancepro;

public class InheritanceMain 
{
          public static void main(String[] args) 
          {
		        Vehicle myElectricCar = new ElectricCar("Red", "Tesla", "Model S", 2022, 4, "Automatic", 100, 370);
		        Vehicle myGasolineCar = new GasolineCar("Blue", "Ford", "Mustang", 2021, 2, "Manual", 16, 25);
		        Vehicle myTruck = new Truck("Black", "Chevrolet", "Silverado", 2020, 6.5, 12000);

		        myElectricCar.displayInfo();
		        myElectricCar.startEngine();

		        System.out.println();

		        myGasolineCar.displayInfo();
		        myGasolineCar.startEngine();

		        System.out.println();

		        myTruck.displayInfo();
		        myTruck.startEngine();
		   }
		

}


