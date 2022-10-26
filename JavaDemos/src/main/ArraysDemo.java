package main;

public class ArraysDemo {
	
	public static void main(String[] args) {
		
		String[] students = new String[3];
		students[0] = "Barış";
		students[1] = "Oğuz";
		students[2] = "Arda";
		
		for(int i = 0; i < students.length; i++) {
			
			System.out.println(students[i]);
		}
		
		for(String student: students) {
			System.out.println(student);
		}
	}
}
