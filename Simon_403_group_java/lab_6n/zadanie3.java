/*SSS*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	double month_pay, amount, month_int_rate, annual_int_rate = 0, total_pay;
    	System.out.println("1 - Mortgage");
    	System.out.println("2 - Car");
    	System.out.println("3 - Educational");
    	System.out.print("Enter loan type: ");
    	int type = input.nextInt();
    	switch (type) {
    	    case 1:
    	        annual_int_rate = 15;
    	        break;
            case 2:
                annual_int_rate = 10;
    	        break;
            case 3:
                annual_int_rate = 5;
    	        break;
    	}
    	System.out.print("Enter loan term(years): ");
    	int years = input.nextInt();
    	System.out.print("Enter the loan amount: ");
    	amount = input.nextDouble();
    	month_int_rate = annual_int_rate/12/100;
    	month_pay = amount * month_int_rate / (1 - 1 / Math.pow(1 + month_int_rate, years * 12));
    	total_pay = month_pay * years * 12;
    	System.out.println("Monthly payment: " + (int)(month_pay*100)/100.0 + " Rub");
    	System.out.println("Total payment: " + (int)(total_pay*100)/100.0 + " Rub");
	}
}
