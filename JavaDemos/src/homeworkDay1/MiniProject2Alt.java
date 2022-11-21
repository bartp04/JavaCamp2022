package homeworkDay1;

public class MiniProject2Alt {
	
	public static void main(String[] args) {
		
		char letter = '1';
		char[] bold = {'A','I','O','U','a','ı','o','u'};
		char[] thin = {'E','İ','Ö','Ü','e','i','ö','ü'};
		boolean found = false;
		boolean vowelBold = true;
		
		
		for(int i = 0 ; i < bold.length ; i++) {
			
			if(letter == bold[i]) {
				vowelBold = true;
				found = true;
				break;
			}
			
			else if(letter == thin[i]) {
				vowelBold = false;
				found = true;
				break;
		   }
		}
		
		if(found && vowelBold) {
			System.out.println("Bold letter.");
		}
		
		else if (found && !vowelBold) {
			System.out.println("Thin letter.");
		}
		else
		{
			System.out.println("Invalid character.");
		}
	}

}
