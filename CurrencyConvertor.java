package internSavy;
import java.util.*;

class CurrencyCalculations{
	
	private double dollorValue;
	public CurrencyCalculations(double dollorValue) {
		this.dollorValue=dollorValue;
	}
	
	public double Euro(double dollorValue) {
		return (dollorValue*0.89);
	}
	public double PoundSterling(double dollorValue) {
		return (dollorValue*0.76);
	}
	public double AustralianDollor(double dollorValue) {
		return (dollorValue*1.46);
	}
	public double CanadianDollor(double dollorValue) {
		return (dollorValue*1.32);
	}
	public double SwissFranc(double dollorValue) {
		return (dollorValue*0.86);
	}
	public double IndianRupees(double dollorValue) {
		return (dollorValue*82.08);
	}
}

public class CurrencyConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
		int x=0,userInput;
		double dollorValue;
		
		System.out.println("****** WELCOME TO CURRENCY CONVERTOR PROJECT ******");
		
		System.out.println("Enter how much dollor you want to convert : ");
	    dollorValue=sc.nextDouble();
	    CurrencyCalculations c=new CurrencyCalculations(dollorValue);
		
		do {
			
			System.out.println("Enter the currency code : \n 1.Dollor to Euro(EUR) \n 2.Dollor to Pound sterling(GBP) \n 3.Dollor to Australian Dollor(AUG) \n 4.Dollor to Canadian Dollor(CAD) \n 5.Dollor to Swiss Franc(CHF) \n 6.Dollor to Indian Rupees(INR) ");
			 userInput=sc.nextInt();
		
			switch(userInput) {
			
						case 1:
							System.out.println("Conversion Dollor to Euro(EUR)");
							double a1=c.Euro(dollorValue);
							System.out.println("Euro(EUR) value of "+dollorValue+ " dollor is "+a1);
							break;
							
						case 2:
							System.out.println("Conversion Dollor to Pound sterling(GBP)");
							double a2=c.PoundSterling(dollorValue);
							System.out.println("Pound sterling(GBP) value of "+dollorValue+ " dollor is "+a2);
							break;
							
						case 3:
							System.out.println("Conversion Dollor to Australian Dollor(AUG))");
							double a3=c.AustralianDollor(dollorValue);
							System.out.println("Australian Dollor(AUG) value of "+dollorValue+ " dollor is "+a3);
							
							break;
							
						case 4:
							System.out.println("Conversion Dollor to Canadian Dollor(CAD))");
							double a4=c.CanadianDollor(dollorValue);
							System.out.println("Canadian Dollor(CAD) value of "+dollorValue+ " dollor is "+a4);
							break;
							
						case 5:
							System.out.println("Conversion Dollor to Swiss Franc(CHF))");
							double a5=c.SwissFranc(dollorValue);
							System.out.println("Swiss Franc(CHF) value of "+dollorValue+ " dollor is "+a5);
							break;
							
						case 6:
							System.out.println("Conversion Dollor to Indian Rupees(INR))");
							double a6=c.IndianRupees(dollorValue);
							System.out.println("Indian Rupees(INR) value of "+dollorValue+ " dollor is "+a6);
							break;
							
						default:  System.out.println("please choose valid choice");
						
			    }
			
			
		}while(userInput<6);
		
	}

}
