package main;

public class ReCapDemo2 {
	
	public static void main(String[] args) {
		
		double[] myList = {1.2 , 1.3 , 4.5 , 5.3 , 6.5};
		double total = 0;
		double max = myList[1];
		
		for(double number:myList) {
			if(max<number) {
				max = number;
			}
			
			total = total + number;
			System.out.println(number);
			
		}
		
		System.out.println("The sum = " + total);
		System.out.println("The maximum number = " + max);
		
		}
		
	}


