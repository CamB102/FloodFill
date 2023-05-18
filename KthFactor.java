package algorithmday1;

import java.util.ArrayList;

public class KthFactor {

	public static void main(String[] args) {
		int n = 12;
		int k = 6;

		int factor = getKthFactor(n, k);

		if (factor == -1) {
			System.out.println("There is no " + k + "th factor of " + n);
		} else {
			System.out.println("The " + k + "th factor of " + n + " is: " + factor);
		}
	}

	public static int getKthFactor(int n, int k) {
		ArrayList<Integer> factors = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				factors.add(i);
			}
		}
		System.out.println("Factor List: " + factors.toString());

		if (0 < k && k <= factors.size()) {
			return factors.get(k - 1);
		} else {
			return -1;
		}
	}
}

