package methods;

public class MethodsDemo {

	public static void main(String[] args) {

		findingNumber();

	}

	public static void findingNumber() {

		int[] numbers = { 0, 1, 2, 5, 7, 9 };
		int found = 6; // değişken tanımlandığı blok içinde geçerlidir.
		boolean in = false;

		for (int i = 0; i < numbers.length; i++) {

			if (found == i) {
				in = true;
				break;
			}
		}

		String message = "";
		if (in) {
			message = "Number is found: " + found;
			giveMessage(message);

		} else {
			giveMessage("Number is not found: " + found);
		}
	}

	public static void giveMessage(String message) { // parametreli metod
		System.out.println(message);
	}

}
