package Abstract_Factory_Pattern;

public class CarClient {
	public static void main(String[] args) {

		System.out.println(CarFactory.buildCar(CarType.MICRO, Location.USA).getCar());
		System.out.println(CarFactory.buildCar(CarType.MINI, Location.INDIA).getCar());
		System.out.println(CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT).getCar());
		
	}
}
