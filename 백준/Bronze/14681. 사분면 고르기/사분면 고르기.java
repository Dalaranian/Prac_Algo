import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		int x, y;

		x = stdIn.nextInt();
		y = stdIn.nextInt();

		if (x == 0 && y == 0) {
			System.exit(0);
		}

		if (x < 0) {
			if (y < 0) {
				System.out.println("3");
			} else if (y > 0) {
				System.out.println("2");
			}
		} else if (x > 0) {
			if (y < 0) {
				System.out.println("4");
			} else if (y > 0) {
				System.out.println("1");
			}
		}
	}
}