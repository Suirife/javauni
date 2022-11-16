/*Simon 16.11*/
import java.util.Scanner;
public class Zadanie_1
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if ((n<10) && (n>-1)) {
			switch (n) {
				case 0 -> System.out.println("Ноль");
				case 1 -> System.out.println("Один");
				case 2 -> System.out.println("Два");
				case 3 -> System.out.println("Три");
				case 4 -> System.out.println("Четыре");
				case 5 -> System.out.println("Пять");
				case 6 -> System.out.println("Шесть");
				case 7 -> System.out.println("Семь");
				case 8 -> System.out.println("Восемь");
				case 9 -> System.out.println("Девять");
			}
		}
		else {
			System.out.println("Err");
		}
	}
}
