package homeworkDay1;

public class Switch {
	
	public static void main(String[] args) {
		
		char grade = 'B';
		
		switch(grade) {
		case 'A':
			System.out.println( "Perfect, you have passed.");
			break;
		case 'B':
			System.out.println("Great,you have passed.");
//			break;
//		case 'C':
			System.out.println("Good, you have passed.");
			break;
		case 'D':
			System.out.println("You have passed.");
		case 'F':
			System.out.println("You have failed.");
			break;
			default:
				System.out.println("Unvalid grade.");
				
			}
	}
}


