package JavaPrograms;

import java.util.Scanner;

public class JavaArrayprograms {

	//Q: How to Reverse a Number in Java
	
	public static void ReverseArray(int number) {
		int reverse =0;
		
		while(number!=0) {
			
			int reminder= number%10;
			reverse = reverse*10+reminder;
			number = number/10;			
		
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Sc= new Scanner(System.in);
		int number= Sc.nextInt();
		ReverseArray(number);

	}

}
