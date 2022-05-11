package unitTesting;

import java.util.StringTokenizer;

public class TestingSomething {

	public static int findMax(int arr[]) {
		// int max = arr[0];
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;
	}

	// reverse a string
	public static int cube(int num) {
		return num * num * num;
	}

	public static String reverseString(String str) {

		StringBuilder sbResult = new StringBuilder();
		StringTokenizer st = new StringTokenizer(str, "");

		while (st.hasMoreTokens()) {
			StringBuilder sb = new StringBuilder();
			sb.append(st.nextToken());
			sb.reverse();
			sbResult.append(sb.toString());
			sbResult.append(" ");

		}
		return sbResult.toString();

	}

}
