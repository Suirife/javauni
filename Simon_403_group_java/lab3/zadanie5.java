
/* SimonSS*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner console = new Scanner(System.in);
	    System.out.print("c: ");
	    double c = console.nextFloat();
	    System.out.print("a: ");
	    double a = console.nextFloat();
	    double b;
	    if (c <= a) {
	        System.out.println("Error");
	    }
	    else {
	        b = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
	        System.out.println("b = " + b);
	    }
	}
}