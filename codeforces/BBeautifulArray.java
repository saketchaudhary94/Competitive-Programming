package CP.codeforces;
import java.util.Scanner;

public class BBeautifulArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Read the number of test cases
		while (t-- > 0) {
			long n = scanner.nextLong(); // Read n
			long k = scanner.nextLong(); // Read k
			long b = scanner.nextLong(); // Read b
			long s = scanner.nextLong(); // Read s

			// Calculate the minimum and maximum possible sum s
			long minimum_s = k * b;
			long maximum_s = (k * b) + (k - 1) * n;

			// Check if the given sum s is within the possible range
			if (s < minimum_s || s > maximum_s) {
				System.out.println("-1"); // If not, print -1
			} else {
				long[] ans = new long[(int) n]; // Initialize the array with zeros
				ans[0] = minimum_s; // Set the first element to minimum_s
				s -= minimum_s; // Reduce s by minimum_s

				// Distribute the remaining s across the array
				for (int i = 0; i < n; i++) {
					long add = Math.min(k - 1, s); // Calculate the amount to add to ans[i]
					ans[i] += add; // Add the calculated amount to ans[i]
					s -= add; // Reduce s by the added amount
				}

				// Output the resulting array
				for (long value : ans) {
					System.out.print(value + " ");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}
