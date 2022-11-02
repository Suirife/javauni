
/* SimonSS*/
import java.util.Scanner;
public class Main
{
	
    public static void main(String[] args) {
	    Scanner console = new Scanner(System.in);
	    System.out.print("Enter a: ");
	    float a = console.nextFloat();
	    System.out.print("Enter b: ");
	    float b = console.nextFloat();
	    float sum, dif, prod;
	    sum = a + b;
	    dif = a - b;
	    prod = a * b;
		System.out.println("Sum: " + sum + " Dif: " + dif + " Prod: " + prod);
	}
}