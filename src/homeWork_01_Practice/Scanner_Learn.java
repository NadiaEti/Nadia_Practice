package homeWork_01_Practice;

import java.util.Scanner;

public class Scanner_Learn {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter your First name");
		String fname = scan.nextLine();
		System.out.println("My First name is "+ fname);
		
		System.out.println("Enter your Last name");
		String lname = scan.nextLine();
		System.out.println("My last name is "+ lname);
		
		
		System.out.println("Enter your age");
		int age = scan.nextInt();
		System.out.println("My age is: "+ age);
		
		System.out.println("Did you get job");
		boolean checkJobStatus = scan.nextBoolean();
		System.out.println("Job status: "+ checkJobStatus);
		
		System.out.println("Enter your expected salary");
		double salary = scan.nextDouble();
		System.out.println("My Salary is : "+ salary);
		
		
		
		
		
		
		
		
	}
	
}
