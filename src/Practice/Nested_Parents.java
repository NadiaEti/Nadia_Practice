package Practice;

public class Nested_Parents {
	static int id = 20;
	int age = 21;
	
	public static class Nested_Child {
		int age = 30;
		String name = "Emti";
		static double salary = 50000; 
		float num = 500.342345f;
		
		public static void main(String[] args) {
			int id2 = 3;
			Nested_Child ob = new Nested_Child();
			
			System.out.println(ob.age);
			System.out.println(Nested_Child.salary);
			
			System.out.println(ob.name);
			System.out.println(Nested_Parents.id);
			System.out.println(id2);
		}
	}
	public static void main(String[] args) {
		
		Nested_Parents ob1 = new Nested_Parents();
		System.out.println(Nested_Parents.id);
		System.out.println(ob1.age);
		
		Nested_Child ob3 = new Nested_Child();
		System.out.println(ob3.num);
		System.out.printf("$%.2f",ob3.num);  			//Formula:"$%.2f|n",variable
		//System.out.println(id2);
		
		
		
		
		
		
		
		
		
		
		
	}
}
