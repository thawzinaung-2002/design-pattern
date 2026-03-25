package behavioral.visitor;

public interface Visitor {

	void doForIndustrialBuilding(IndustrialBuilding building);
	
	void doForPark(Park pk);
	
	void doForPrivateBuilding(PrivateBuilding pb);
	
	void doForShoppingCenter(ShoppingCenter sp);
	
}
