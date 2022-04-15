package modifier_01;

public class Access_C {

	public static void main(String[] args) {
		
		Access_A Emti = new Access_A();
		System.out.println(Emti.name);
		
		System.out.println(Access_A.name1);
		
		String name = "Nadia"; // concatenation
		System.out.println("My name is "  + name);
		
		double salary = 50000;
		System.out.println("My expected salary is"  + " " +salary );
	}
}
