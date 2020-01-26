package Challenge3;

public class MiniVan extends Vehicle{
	int nbCustomers;
	
MiniVan(String plateID, float weight, int nbCustomers) {
		super(plateID, weight);
		this.nbCustomers = nbCustomers;
	}

@Override
public int getMaximalSpeed() {
	return 130 - (nbCustomers * 10);
}
	
public String toString() {
	return "MiniVan" + super.toString();
}
}
