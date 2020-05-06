package Abstract_Factory_Pattern;

public class CarFactory {

	public static AbstractFactory buildCar(CarType model, Location location) 
	{
		AbstractFactory vehicle = new VehicleFactory(model,location); 
		return vehicle;
	}
	
	
	
	

}
