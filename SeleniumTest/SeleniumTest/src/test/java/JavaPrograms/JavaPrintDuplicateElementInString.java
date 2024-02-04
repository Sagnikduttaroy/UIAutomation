package JavaPrograms;

import java.util.Scanner;

public class JavaPrintDuplicateElementInString {



	public static void PrintDuplicateItems(String S) {
		
		
		char[] carray = S.toCharArray();
	      System.out.println("The string is:" + S);
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < S.length(); i++) {
	         for (int j = i + 1; j < S.length(); j++) {
	            if (carray[i] == carray[j]) {
	               System.out.print(carray[i] + " ");
	               break;
		
	            }
	         }
	      }

	}
	
	public static void DuplicateWordInSentence(String Provided) {
		
		String[] Spiltted= Provided.split("//s");
		System.out.println(Spiltted);
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S= sc.nextLine();
		//PrintDuplicateItems(S);
		DuplicateWordInSentence(S);

	}

}
