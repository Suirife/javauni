/* SimonSS*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner console = new Scanner(System.in);
	    System.out.print("Enter h: ");
	    float h = console.nextFloat();
	    double res;
	    res = Math.sqrt(2*h/9.8);
		System.out.println("Time: " + res);
	}
}