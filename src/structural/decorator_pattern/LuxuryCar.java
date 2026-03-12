package structural.decorator_pattern;

public class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car car) {
		super(car);
	}
	
	@Override
	public void drive() {
		super.drive();
		System.out.println(" and drives soft as luxury car.");
	}

}
