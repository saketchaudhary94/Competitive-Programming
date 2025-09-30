import java.util.Scanner;

public class AExcitingBets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		long t = scanner.nextLong(); // Read the number of test cases
		while (t-- > 0) {
			long a = scanner.nextLong(); // Read the value of a
			long b = scanner.nextLong(); // Read the value of b

			// Ensure a is the larger number for simplicity
			if (b > a) {
				long temp = a;
				a = b;
				b = temp;
			}

			// If a and b are equal, the excitement is infinite, so output 0 0
			if (a == b) {
				System.out.println("0 0");
			} else {
				// Calculate the difference, which is the gcd when a != b
				long gcd = a - b;

				// Calculate the minimum number of moves to achieve maximum excitement
				// Either increase or decrease to the nearest multiple of gcd
				long moves = Math.min(b % gcd, gcd - b % gcd);

				// Output the maximum excitement and the minimum moves required
				System.out.println(gcd + " " + moves);
			}
		}
		scanner.close();
    }
}
