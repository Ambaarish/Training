package training;

public class Training1 {
	
	int a;
	int b;
	String str1 = "Hello";
	String str2 = "Moto";
	static int x = 5;
	static float y = 6.5f;
			
	
	public Training1(int a , int b) {
		this.a = a;
		this.b = b;
	}
	
	

	public static void main(String[] args) {
		
		Training1 t = new Training1(5, 4);
		int c = t.a+t.b ;
		System.out.println("The number is "+c);
		System.out.println(t.str1+" "+t.str2);
		System.out.println(t.getMethod());
		int z = (int) y;
		String g = Integer.toString(z);
		System.out.println(g);
		System.out.println(z);
		System.out.println(x += 5);
		

		
	}
	
	public String getMethod() {
		return str2;
	}

}
