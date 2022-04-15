package Practice;

import java.util.Scanner;

public class Scanner_Learn {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		float SalesTax = 0.088f;
		
		 System.out.println("Qty of Cucumbers");
		 int QCucumbers = scan.nextInt();
		 System.out.println("Price per Cucumbers box :  " );
		 double PCucumbers = scan.nextDouble();
		 double totalCucumbers = QCucumbers*PCucumbers;
		 System.out.println("Price for Cucumbers : "+totalCucumbers);
			
		System.out.println("Qty of Tomatos");
		 int QTomatos = scan.nextInt();
		 System.out.println("Price per Tomatos box:  " );
		 double PTomatos = scan.nextDouble();
		 double totalTomatos=QTomatos*PTomatos;
		 System.out.println("Price for Tomatos : "+totalTomatos);
			
		 double Subtotal = (totalCucumbers + totalTomatos );
		 double TotalTax = (Subtotal*SalesTax);
		 double TotalAfterSalesTax = (Subtotal + TotalTax);
			
			System.out.printf("\t\t\t\t\t\t\t\t stotal = $ %.2f", + Subtotal  );
			System.out.println();
			System.out.printf("\t\t\t\t\t\t\t\t Sales Tax = $ %.3f", TotalTax);
			System.out.println();
			System.out.printf("\t\t\t\t\t\t\t\t Total = $ %.2f",TotalAfterSalesTax );
			
		scan.close();
	
		
		
		
		
	}
	
}
