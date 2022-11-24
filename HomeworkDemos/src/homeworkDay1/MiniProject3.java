package homeworkDay1;

public class MiniProject3 {

	public static void main(String[] args) {
		
		//Mükemmel sayılar,kendisi hariç tam bölenlerinin toplamının kendisine eşit olan sayılardır.
		
        int number = 284;
        int total = 0;
        
        for(int i = 1 ; i < number ; i++) {
        	
        	if(number % i == 0) {
        		
        		total = total + i;
        	}
        }
        
        if(number == total) {
        	System.out.println("Perfect number.");
        }
        
        else {
        	System.out.println("Not a perfect number.");
        }
		
	}

}
