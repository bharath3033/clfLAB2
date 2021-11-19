package exe3;

import java.util.Scanner;

class Excersice_3 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the size of Array : ");
	    int size = sc.nextInt();
		int arr[] = new int[size];
		ReverseOrder t = new ReverseOrder();
		
		System.out.println("Before reversed digits sort are below: ");
		for(int i=0;i<arr.length;i++){
		    System.out.print("Enter "+i+" index element : ");
		    arr[i] = sc.nextInt();
		}
       
        System.out.print("After reversed digits sort : ");
        for(int i : t.getSorted(arr)){
           System.out.print(i+" ");
        }
}
}