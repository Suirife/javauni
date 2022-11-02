/* SimonSS */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner console = new Scanner(System.in);
	    int res = 1;
	    System.out.print("Enter n: ");
	    int n = console.nextInt();
	    for (int i = 0; i < n; i++) {
	        res *= 2;
	    }
		System.out.println("2^" + n + " = " + res);
	}
}