package builder.tradational;

public class Demo {

	public static void main(String[] args) {
		
		var director1 = new ComputerDirector(new CheapComputerBuilder());
//		director1.setComputerBuilder(new CheapComputerBuilder());
		director1.buildComputer();
		var computer1 = director1.getComputer();
		System.out.println(computer1);
		
		director1.setComputerBuilder(new ExpensiveComputerBuilder());
		director1.buildComputer();
		computer1 = director1.getComputer();
		System.out.println(computer1);
		
	}
	
}
