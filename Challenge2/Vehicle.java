package Challenge2;

public abstract class Vehicle {
	String plateID;
	float weight;
	
	Vehicle(String plateID, float weight){
		this.plateID = plateID;
		this.weight = weight;
	}
	
	public abstract int getMaximalSpeed();
	
	public String toString() {
		return " [plate id=" + this.plateID + ", weight=" + this.weight +"]";
	}
}
