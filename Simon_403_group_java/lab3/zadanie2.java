/* SimonSS*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner console = new Scanner(System.in);
	    int res = 1;
	    System.out.print("Enter n: ");
	    int n = console.nextInt();
	    for (int i = 1; i <= n; i++) {
	        res *= i;
	    }
		System.out.println("n! = " + res);
	}
}