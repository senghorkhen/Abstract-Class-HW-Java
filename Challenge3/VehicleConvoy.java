package Challenge3;

import java.util.ArrayList;
import java.util.Arrays;

public class VehicleConvoy {
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public void  addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	// get maximal speed
	public int getMaximalSpeed() {
		int min = vehicles.get(0).getMaximalSpeed(); // index 0
		for(int i=0; i<vehicles.size(); i++) {
			if(vehicles.get(i).getMaximalSpeed() < min) {
				min = vehicles.get(i).getMaximalSpeed();
			}
		}
		return min;
	}
}
