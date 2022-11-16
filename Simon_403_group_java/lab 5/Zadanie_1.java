/*Simon 16.11*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if ((n<10) && (n>-1)) {
			switch (n) {
				case 0:
					System.out.println("Ноль");
					break;
				case 1:
					System.out.println("Один");
					break;
				case 2:
					System.out.println("Два");
					break;
				case 3:
					System.out.println("Три");
					break;
				case 4:
					System.out.println("Четыре");
					break;
				case 5:
					System.out.println("Пять");
					break;
				case 6:
					System.out.println("Шесть");
					break;
				case 7:
					System.out.println("Семь");
					break;
				case 8:
					System.out.println("Восемь");
					break;
				case 9:
					System.out.println("Девять");
					break;
			}
		}
		else {
			System.out.println("Err");
		}
	}
}
