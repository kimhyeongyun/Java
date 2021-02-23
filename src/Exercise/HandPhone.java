package Exercise;

public class HandPhone {
	String model;
	int amount_of_elec;
	
	public HandPhone(String model) {
		this.model = model;
	}
	
	void charge(OutElect aaa) {
		aaa.Elec -=100;
		
	}
 	
	
	
	
}
