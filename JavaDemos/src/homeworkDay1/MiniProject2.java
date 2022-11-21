package homeworkDay1;

public class MiniProject2 {
	
	public static void main(String[] args) {
		
		char letter = 'a';
		
		switch(letter) {
		
		case 'A':
		case 'a':
		case 'I':
		case 'ı':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("Bold vowel.");
			return;
			
		}
		
		switch(letter) {
			
			case 'E':
			case 'e':
			case 'İ':
			case 'i':
			case 'Ö':
			case 'ö':
			case 'Ü':
			case 'ü':
				System.out.println("Thin vowel.");
				break;
				default:
					System.out.println("Invalid letter.");
	
	}
}		
}		
	

