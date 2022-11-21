package homeworkDay1;

public class LoopDemo {
	
	public static void main(String []args) {
		
		for (int i = 1; i <= 10; i++) { //i'nin hükmü döngü bitene kadardır.
			System.out.println(i);
			
		}
		
		for(int i = 7; 9 > i & i > 0; i--) { //azaltmada sınır belirlenmezse tipin sınırına kadar uzar.
			System.out.println(i);
		}
		
		System.out.println("For Loop is over.");
		
		int i = 0;
		
		while(i < 10) {
			
			i++; //Kaçar kaçar artacağı belirlenmezse sonsuz döngü olur. (infinite loop)
			System.out.println(i);
									
		}
		
		System.out.println("While loop is over.");
		
		//Do-While
		int a = 0;
		
		do {   //While dönhüsünden farkı şart sağlamasa bile do'nun içindeki şartın çalışmasıdır.
			a++; 
			System.out.println(a);
		} while(a < 10);
		
		System.out.println("Do-While loop is over.");
			
		
		

			
			
		
	}

}
