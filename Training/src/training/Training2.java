package training;

public class Training2 {
	
	String country;
	
	public Training2 (String country) {
		this.country = country;
	}
	
	

	public static void main(String[] args) {

		Training2 a = new Training2("Australia");
		a.getCountry();
		if(a.getCountry()==true) {
			System.out.println("It returns true");
		} else {
			System.out.println("It returns false");
		}
		
		
	}
	
	public boolean getCountry() {
		if(country.equalsIgnoreCase("India")) {
			return true;			
		}
		
		return false;
	}

}


