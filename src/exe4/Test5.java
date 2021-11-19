package exe4;

import java.util.Arrays;
import java.util.LinkedHashSet;

class Test5 {
	public int[] modifyArray(int[] arr) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int[] result = new int[set.size()];
		for (int i = 0; i < set.size(); i++) {
			result[i] = (int) set.toArray()[i];
		}
		Arrays.sort(result);
		return result;
	}
}
