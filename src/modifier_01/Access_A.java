
package modifier_01;

public class Access_A {

	int id = 120;
	String name = "Nadia";
	double salary = 5000; //data variable
	static int age = 50;  //static variable
	static String name1 = "Eti";
	
	public static void main(String[] args) {
		
		int id1 = 150;  //local variable
		String name1 = "Husna";
		
		Access_A obj = new Access_A();
		System.out.println(obj.id);
		
		System.out.println(Access_A.name1);
		System.out.println(id1);
		
	}
	
	
	
	
	
	
}
