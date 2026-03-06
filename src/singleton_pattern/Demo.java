package singleton_pattern;

public class Demo {

	public static void main(String[] args) {
		
		var service1 = OrderManagementService.getInstance();
		var service2 = OrderManagementService.getInstance();
		
		System.out.println(service1 == service2);
		
		service1.placeOrder();
		
	}
	
}
