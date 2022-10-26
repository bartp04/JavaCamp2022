package main;

public class MiniProject4 {
	
	public static void main(String[] args) {
		//220-284
		int number1 = 222;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;
		for(int i = 1 ; i < number1 ; i++) {
			
			if(number1 % i == 0) {
				total1 = total1 + i;
			}
		}
		
		for(int i = 1 ; i < number2 ; i++) {
			if(number2 % i == 0) {
				total2 = total2 + i;
			}
		}
		
		
		if(total1 == number2 & total2 == number1) {
			
			System.out.println("Number one and two are friend numbers.");
		}
		
		else {
			
			System.out.println("Number one and two are not friend numbers.");
		}
	}

}
