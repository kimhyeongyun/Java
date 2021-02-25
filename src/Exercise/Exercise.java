package Exercise;

public class Exercise {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OutElect outelec = new OutElect(1000);
		
		HandPhone handphone = new HandPhone("samsung");
		
		handphone.charge(outelec);
		
		System.out.println(outelec.Elec);
		
	}

}
