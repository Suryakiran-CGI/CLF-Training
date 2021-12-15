package Arrays;

import java.util.Scanner;

class Students{
	int rollno;
	String name;
}

public class ArrayDemo {
	static byte siz = 5;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*1D - ARRAY
		 * int arr[] = {121,1,3,4,5,5,6};
		 * 
		 * 2D - ARRAY
		int arr1[] = {12,13,14,15,26};
		int arr2[] = {21,31,42,53,22};
		int arr3[] = {40,50,60,70,87};
		
		int res[][] = {arr1,arr2,arr3};
        
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.print(" "+ res[i][j]);
			}
			System.out.println();
		}*/
		
		/*ENHANCED LOOPS [FOR]*/
		int arr1D[] = {10,20,30,40,50};
		for (int res : arr1D) {
			System.out.print(res+" ");
		}System.out.println();
		
		int a[] = {1,2,3,4};
		int b[] = {9,8,7,6};
		int c[] = {4,5,6,7};
		int arr2D[][] = {a,b,c};
		
		for (int x[] : arr2D) {
			for(int y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
