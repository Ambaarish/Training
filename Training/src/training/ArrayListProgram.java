package training;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram {
	
	String EmployeeName ;
	int EmployeeAge ;
	String EmployeeCity;
	
	public ArrayListProgram(String EmployeeName , int EmployeeAge , String EmployeeCity) {
		this.EmployeeName = EmployeeName;
		this.EmployeeAge = EmployeeAge;
		this.EmployeeCity = EmployeeCity;
	}
	

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Ambu");
		ar.add("Amb");
		ar.add("Ambaarish");
		
		for(int i=0 ; i<ar.size() ; i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("**********************");
		
		Iterator<String> it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("**********************");
		
		ArrayListProgram emp1 = new ArrayListProgram("Amb" , 21 , "Chennai");
		ArrayListProgram emp2 = new ArrayListProgram("Ambu", 22, "Bangalore");
		ArrayListProgram emp3 = new ArrayListProgram("Ambaarish", 23, "Mumbai");
		
		ArrayList<ArrayListProgram> ar1 = new ArrayList<ArrayListProgram>();
		ar1.add(emp1);
		ar1.add(emp2);
		ar1.add(emp3);
		
		Iterator<ArrayListProgram> it1 = ar1.iterator();
		while(it1.hasNext()) {
			ArrayListProgram ar2 = it1.next();
			System.out.println(ar2.EmployeeName);
			System.out.println(ar2.EmployeeAge);
			System.out.println(ar2.EmployeeCity);
		}
		
	}

}
