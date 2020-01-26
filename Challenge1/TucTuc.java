package Challenge1;

public class TucTuc {
	String plateID;
	float weight;
int nbCustomers;
	
	TucTuc(String plateID, float weight, int nbCustomers){
		this.plateID = plateID;
		this.weight = weight;
		this.nbCustomers = nbCustomers;
	}
	
	public int getMaximalSpeed() {
		return 130 - (nbCustomers * 5);
	}
	
	public String toString() {
		return "TucTuc [plate id=" + this.plateID + ", weight=" + this.weight +"]";
	}
}
