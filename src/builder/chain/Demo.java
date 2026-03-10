package builder.chain;

public class Demo {

	public static void main(String[] args) {
		
		var s1 = Student.builder().email("thawzin@gmail.com").build();
		
		System.out.println(s1);
	}
	
}
