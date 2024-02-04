package JavaPrograms;

import java.util.Scanner;

public class JavaPrintStringReverseOrder {

	
	public static void PrintReverseString(String S) {
		
		char[] S1= S.toCharArray();
		
		for(int i=S1.length-1;i>=0;i--) {
			System.out.print(S1[i]);
			
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S= sc.nextLine();
		PrintReverseString(S);

	}

}
