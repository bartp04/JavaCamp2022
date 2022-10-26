package main;

public class MiniProject5Alt {
	
	public static void main(String[] args) {
		
		int[] numbers = {1,2,5,7,9};
		int found = 3;
		
		for(int number: numbers) {
			
			if(number == found) {
				
				System.out.println("Number exist");
				return;
			}
		}
		
		System.out.println("Number doesn't exist.");
	}

}
