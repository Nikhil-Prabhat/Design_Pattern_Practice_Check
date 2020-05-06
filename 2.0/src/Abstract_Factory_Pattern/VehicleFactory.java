package Abstract_Factory_Pattern;

public class VehicleFactory extends AbstractFactory {
	
	private CarType model=null;
	private Location location=null;
	
	

	public VehicleFactory(CarType model, Location location) {
		super();
		this.model = model;
		this.location = location;
	}



	@Override
	public Car getCar() {
		if (CarType.LUXURY.compareTo(this.model) == 0) {
			return new LuxuryCar(location);
		} else if (CarType.MICRO.compareTo(this.model) == 0) {
			return new MicroCar(location);
		} else {
			return new MiniCar(location);
		}

	}

}
