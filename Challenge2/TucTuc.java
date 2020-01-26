package Challenge2;

public class TucTuc extends Vehicle{
	
int nbCustomers;
	
	TucTuc(String plateID, float weight, int nbCustomers){
		super(plateID,weight);
		this.nbCustomers = nbCustomers;
	}
	
	@Override
	public int getMaximalSpeed() {
		return 130 - (nbCustomers * 5);
	}
		
	public String toString() {
		return "TucTuc" + super.toString();
	}
}
