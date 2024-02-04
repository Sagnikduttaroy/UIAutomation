package JavaPrograms;

import java.util.Scanner;

public class JavaArraySorting {

	//Q: Program to print the largest element in an array

	public static void PrintLargestElementInArray(int []arr) {

		int max= arr[0];
		for(int i =0;i<arr.length;i++) {

			if(arr[i]>max) {

				max= arr[i];

			}			
		}
		System.out.println("Largest element in array is: "+max);
	}
	///////////////////////////////////////////////////////////////////////////////////////

	//Q: Program to print the smallest element in an array

	public static void PrintSmalletElementInArray(int []arr) {

		int min= arr[0];
		for(int i =0;i<arr.length;i++) {

			if(arr[i]<min) {

				min= arr[i];

			}			
		}
		System.out.println("Smallest element in array is: "+min);
	}

	/////////////////////////////////////////////////////////////////////////////////////	

	//Q: Java Program to find Second Smallest Number in an Array

	public static void PrintSecondSmallestNumber(int[]arr) {

		int temp;
		for(int i=0;i<arr.length;i++) {

			for(int j= i+1;j<arr.length;j++) {

				if(arr[i]>arr[j]) {


					temp= arr[i];
					arr[i]= arr[j];
					arr[j]= temp;

				}			

			}

		}
		System.out.println("Second Smallest number is: "+arr[1]);

	}
/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Q: Java Program to find second Largest Number in an Array
	public static void PrintSecondLargestNumber(int[]arr) {

		int temp;
		for(int i=0;i<arr.length;i++) {

			for(int j= i+1;j<arr.length;j++) {

				if(arr[i]>arr[j]) {


					temp= arr[i];
					arr[i]= arr[j];
					arr[j]= temp;

				}			

			}

		}
		System.out.println("Second largest number is: "+arr[arr.length-2]);

	}
	/////////////////////////////////////////////////////////////////////////////////////////	

	//Q: Java Program to find Third Largest Number in an Array
	public static void PrintThirdLargestNumber(int[]arr) {

		int temp;
		for(int i=0;i<arr.length;i++) {

			for(int j= i+1;j<arr.length;j++) {

				if(arr[i]>arr[j]) {


					temp= arr[i];
					arr[i]= arr[j];
					arr[j]= temp;

				}			

			}

		}
		System.out.println("Third largest number is: "+arr[arr.length-3]);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int S= sc.nextInt();
		//PrintDuplicateItems(S);
		PrintLargestElementInArray(new int[] {12,15,27,32});
		PrintLargestElementInArray(new int[] {12,15,27,32});
		PrintSmalletElementInArray(new int[] {12,15,27,32});
		PrintSecondSmallestNumber(new int[] {12,15,27,32});
		PrintSecondLargestNumber(new int[] {12,15,27,32});
		PrintThirdLargestNumber(new int[] {12,15,27,32});


	}

}
