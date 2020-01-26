package Challenge1;

public class MiniVan {
	String plateID;
	float weight;
	int nbCustomers;
	
	MiniVan(String plateID, float weight, int nbCustomers){
		this.plateID = plateID;
		this.weight = weight;
		this.nbCustomers = nbCustomers;
	}
	
	public int getMaximalSpeed() {
		return 130 - (nbCustomers * 10);
	}
	
	public String toString() {
		return "MiniVan [plate id=" + this.plateID + ", weight=" + this.weight +"]";
	}
}
