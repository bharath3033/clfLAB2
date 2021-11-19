package exe4;

import java.util.Scanner;

public class Excersice_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test5 t = new Test5();
		System.out.print("Enter the size of the Array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Array before duplicate removal descending sort : ");
		for (int i = 0; i < size; i++) {
			System.out.print("Enter " + i + " index element : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Array after duplicate removal descending sort : ");
		for (int i = t.modifyArray(arr).length - 1; i >= 0; i--) {
			System.out.print(t.modifyArray(arr)[i] + " ");
		}
	}
}
