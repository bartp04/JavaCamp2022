package main;

public class MiniProject1 {
	
	public static void main(String[] args) {
		
		int number = 34;
		/* int remainder = number % 2;
		System.out.println(remainder); */
		boolean isPrime = true;
		
		if(number == 2) {
			System.out.println("Odd");
			return;
		}
		
		if(number == 1) {
			System.out.println("Even");
			return;
		}
		
		if(number<1) {
			System.out.println("Invalid number.");
			return;
		}
		
		for(int i = 2 ; i < number ; i++) {
			
			if( number % i == 0) {
				isPrime = false;
			}
		/*else{
				isPrime = true;
			} */
			
	
		}
		
		if(isPrime) { //isPrime == true ile aynı kullanım.
			System.out.println("Odd");
		}
		
		else {
			System.out.println("Even");
		}
		
		
	}
}
