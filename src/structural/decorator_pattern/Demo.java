package structural.decorator_pattern;

public class Demo {

	public static void main(String[] args) {
		
		Car basicCar = new BasicCar();
		basicCar.drive();
		System.out.println("\n****");
		
		SportsCar sportsCar = new SportsCar(basicCar);
		sportsCar.drive();
		sportsCar.setTransmissionMode("sport-");
		System.out.println("\n***");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.drive();
		System.out.println("\n*****");
		
	}
	
}
