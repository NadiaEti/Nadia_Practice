package homeWork_01_Practice;

public class Learn_Variable_type {
	
	
	public static void main(String[] args) {

		String Name = "Nadia Eti";
		System.out.println("Employees Name: " +  Name);
		
		
		System.out.print("Salary:  ");
		double salary = 20000.500;
		System.out.println(salary);
		double AnnualGrossSalary=salary*12;
		double AnnualNetSalary= AnnualGrossSalary - (AnnualGrossSalary* .1);
		
		
		
		System.out.println("Annual Gross Salary: " + AnnualGrossSalary);
		System.out.print("Annual Net Salary: " + AnnualNetSalary);
		
		
		
	}

}
