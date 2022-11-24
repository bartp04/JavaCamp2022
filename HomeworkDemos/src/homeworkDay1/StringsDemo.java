package homeworkDay1;

public class StringsDemo {

	public static void main(String[] args) {
		
		String message = "Today is a diamond.";
		System.out.println(message);
		System.out.println(message.length());
		System.out.println(message.charAt(4));
		System.out.println(message.concat(" Yay!"));
		System.out.println(message.startsWith("Today"));
		System.out.println(message.endsWith("."));
		char[] characters = new char[5];
		message.getChars(0 , 5 , characters , 0); //srcBegin , srcEnd , atama , dstBegin
		System.out.println ( characters );		
		System.out.println (message.indexOf("i"));
		System.out.println (message.lastIndexOf("i")); //her zaman ilk kullanılan harfi verir ama last kodu sağdan aratır.
		
		String newMessage = message.replace('T', 't'); //old char , new char
		System.out.println(newMessage);
		System.out.println(newMessage.substring(2));
		System.out.println(newMessage.substring(2,5)); // [2,5) şeklinde çalışır
		
		for(String msg: message.split(" ")) {
			System.out.println(msg);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		//System.out.println(message.trim());

	}

}


