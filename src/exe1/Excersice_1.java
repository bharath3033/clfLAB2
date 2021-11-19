package exe1;

import java.util.Scanner;

import junit.framework.Test;

public class Excersice_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter " + i + " index element : ");
			arr[i] = sc.nextInt();
		}
		SecondSmallestArray t = new SecondSmallestArray();
		System.out.println("Second Smallest element in given array is : " + t.getSecondSmallest(arr));
	}

}