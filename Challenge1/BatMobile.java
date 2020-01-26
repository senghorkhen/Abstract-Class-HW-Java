package Challenge1;

public class BatMobile {
	String plateID;
	float weight;
	boolean isBatmanHere = false;
	
	BatMobile(String plateID, float weight, boolean isBatmanHere){
		this.plateID = plateID;
		this.weight = weight;
		this.isBatmanHere = isBatmanHere;
		
	}
	
	public int getMaximalSpeed() {
		int speed;
		if(isBatmanHere) {
			speed = 500;
		}else {
			speed =110;
		}
		return speed;
	}
	
	public String toString() {
		return "BatMobile [plate id=" + this.plateID + ", weight=" + this.weight +"]";
	}
}	