package main;

public class MiniProject5 {
	
	public static void main(String[] args) {
		
		int[] numbers = {1,2,5,7,9};
		int found = 8;
		boolean in = false;
		
		for( int i = 0; i < numbers.length ; i++) {
			
			if(found == i) {
				in = true;
				break;
			}
		}
			
		if(in) {
			System.out.println("Number is found");
			
		}
		else {
			System.out.println("Number is not found.");
		}
		
		}
	}


