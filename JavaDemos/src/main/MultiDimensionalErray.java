package main;

public class MultiDimensionalErray {
	
	public static void main(String [] args) {
		
		String[] [] cities = new String [3] [3];
		
		cities [0] [0] = "İstanbul";
		cities [0] [1] = "Bursa";
		cities [0] [2] = "Sakarya";
		cities [1] [0] = "Antalya";
		cities [1] [1] = "Isparta";
        cities [1] [2] = "Burdur";
	    cities [2] [0] = "İzmir";
        cities [2] [1] = "Manisa";
		cities [2] [2] = "Muğla";
		
		for(int i = 0; i <= 2 ; i++) {
			System.out.println ("------------------");
			for(int j = 0 ; j <= 2 ; j++) {
				System.out.println (cities [i] [j]);
				
				}
			}
		
			
		}
				
	}


