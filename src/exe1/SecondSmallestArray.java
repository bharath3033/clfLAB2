package exe1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SecondSmallestArray {
	public int getSecondSmallest(int[] arr) {
		List<Integer> lst = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			lst.add(arr[i]);
		}
		Collections.sort(lst);
		return lst.get(1);
	}
}