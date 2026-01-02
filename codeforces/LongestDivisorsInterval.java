package CP.codeforces;
import java.util.Scanner;

public class LongestDivisorsInterval {
	public static void main(String[] args) {
		// Calculate the least common multiple (LCM) of numbers from 1 to 49
		long a = 1;
		for (long i = 2; i <= 50; i++) {
			a = lcm(a, i);
		}
		// Output the LCM of numbers from 1 to 49
		// System.out.println(a);

		// Create a Scanner object to read input
		Scanner scanner = new Scanner(System.in);
		// Read the number of test cases
		int t = scanner.nextInt();
		while (t-- > 0) {
			// Read the integer n for each test case
			long n = scanner.nextLong();

			// Initialize i to 1, which will be used to find the maximum interval
			int i = 1;
			// Increment i until n is not divisible by i
			while (n % i == 0) { // O(60)
				i++;
			}
			// Output the size of the maximum interval
			System.out.println(i - 1);
		}
		// Close the scanner
		scanner.close();
	}

	// Helper method to calculate the least common multiple (LCM) of two numbers
	private static long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}

	// Helper method to calculate the greatest common divisor (GCD) of two numbers
	private static long gcd(long a, long b) {
		while (b != 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}

// Time Complexity (TC): O(60) ~ O(log2(n))
// Space Complexity (SC): O(1)
