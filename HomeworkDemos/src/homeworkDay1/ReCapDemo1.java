package homeworkDay1;

public class ReCapDemo1 {
	
	public static void main (String []args) {
		
		int num1 = 41;
		int num2 = 45;
		int num3 = 40;
		int largest = num2;
		String report = "Largest number: ";
		
		if(largest<num2) {
			largest = num2;
		}
		
		if(largest<num3) {
			largest = num3;
		}
		
		if(largest<num1) {
			largest = num1;
		}
		

		
		System.out.println( report + largest);
	}
}
	
