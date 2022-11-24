package methods;

public class MethodsDemo2 {

	public static void main(String[] args) {

		String message = "Weather is great today.";
		add(message.substring(0, 7));
		int number = number();
		System.out.println(number);
		String city = getCity();
		add(city);
		int summation = sum(5, 7);
		System.out.println(summation);
		System.out.println(	sum2(1, 2, 3, 4, 5));

	}

	public static void add(String message) {

		System.out.println(message);

	}

	public static void delete() {

		System.out.println("Deleted.");
	}

	public static void update() { // void operasyon: emir kipi gibi

		System.out.println("Updated.");
	}

	public static int number() {

		return 5; // değer döndür
	}

	public static String getCity() {

		return "Ankara";
	}

	public static int sum(int num1, int num2) {

		return num1 + num2;
	}

	public static int sum2(int... numbers) {

		int total = 0;

		for (int number : numbers) {

			//total = total + number; 
			total += number; //aynısı

		}

		return total;

	}

}
