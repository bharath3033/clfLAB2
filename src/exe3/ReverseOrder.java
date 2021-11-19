package exe3;

import java.util.Arrays;

class ReverseOrder {

	static int reversDigits(int num) {
		int rev_num = 0;
		while (num > 0) {
			rev_num = rev_num * 10 + num % 10;
			num = num / 10;
		}
		return rev_num;
	}

	public int[] getSorted(int[] arr) {
		int rev_arr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			rev_arr[i] = reversDigits(arr[i]);
		}

		Arrays.sort(rev_arr);
		return rev_arr;
	}
}