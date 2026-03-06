package singleton_pattern;

public class OrderManagementService {

	//Declare same type of static field
	// 'volatile' ensures changes made by one thread are visible to others immediately
	private static volatile OrderManagementService instance;
	
	//Declare private constructor to prevent object creation from outside of class
	private OrderManagementService() {
		
	}
	
	//Help method to create lazy initialization of object creation
	// synchronized - only one thread can access simulateously 
	public static synchronized OrderManagementService getInstance() {
		//no locking
		if(instance == null) {
			// locking if null or just first time
			synchronized(OrderManagementService.class) {
				if(instance == null) {
					instance = new OrderManagementService();
				}
			}
		}
		return instance;
	}
	
	public void placeOrder() {
		System.out.println("Order Placing!");
	}
	
}
