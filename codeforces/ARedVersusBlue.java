package CP.codeforces;
import java.util.Scanner;

public class ARedVersusBlue {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Read the number of test cases
		while (t-- > 0) {
			int n = scanner.nextInt(); // Read n
			int r = scanner.nextInt(); // Read r
			int b = scanner.nextInt(); // Read b
			StringBuilder s = new StringBuilder(); // Initialize the result string

			// Calculate the number of 'R's to be placed between each 'B'
			int length_of_red = r / (b + 1);
			// Calculate the extra 'R's that need to be distributed
			int extra_red = r % (b + 1);

			// Loop to construct the string with minimum consecutive wins
			for (int times = 1; times <= b + 1; times++) {
				// Add the calculated number of 'R's
				for (int i = 0; i < length_of_red; i++) {
					s.append('R');
				}

				// Distribute the extra 'R's
				if (extra_red > 0) {
					s.append('R');
					extra_red--;
				}

				// Add 'B' except for the last segment
				if (times != b + 1) {
					s.append('B');
				}
			}

			// Output the constructed string
			System.out.println(s.toString());
		}
		scanner.close();
	}

	// Time Complexity (TC): O(100)
	// Space Complexity (SC): O(100)
}
