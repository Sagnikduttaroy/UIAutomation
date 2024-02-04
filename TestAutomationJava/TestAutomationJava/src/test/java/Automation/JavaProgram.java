package Automation;

public class JavaProgram {

	static String name= "I am Software Engineer";
	static int count;
	
	public static void convertToChar() {
		
		char[]A= name.toCharArray();
		for (int i =0; i<=A.length;i++) {
			
			System.out.println(A[i]);
		}
		
		
	}
	
	public static void removeSpace() {
		
		String nameNew= name.replaceAll("\\s", "");
		System.out.println("new String is :"+nameNew);
		
	}
	
	public static void countNumber() {
		
		for(int i = 0; i < name.length(); i++) {    
            if(name.charAt(i) != ' ')    
                count++;    
		}
		
		System.out.println("Total count of number in string is:"+count);
	}

	public static void main(String[] args) {
		//convertToChar();
		//removeSpace();
		countNumber();
		
	}

}
