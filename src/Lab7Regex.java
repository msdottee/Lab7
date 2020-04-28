import java.util.Scanner;

public class Lab7Regex {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter a valid Name: ");
		String name = scnr.nextLine();
		
		validateName(name);
		
		System.out.println();
		
		System.out.print("Please enter a valid email: ");
		String email = scnr.nextLine();
		
		validateEmail(email);
		
		System.out.println();
		
		System.out.print("Please enter a valid phone number: ");
		String phone = scnr.nextLine();
		
		validatePhone(phone);
		
		System.out.println();
		
		System.out.print("Please enter a valid date: ");
		String date = scnr.nextLine();
		
		validateDate(date);
		
		System.out.println();
		
		System.out.print("Please enter a valid HTML: ");
		String HTML = scnr.nextLine();
		
		validateHTML(HTML);

	}

	public static boolean validateName(String name) {

		// change this to pass ALL tests
		String regex = "[A-Z][a-z]{1,29}(\\s[A-Z][a-z]{1,29})?";

		if (name.matches(regex)) {
			System.out.println("Name is valid!");
			return true;
		} else {
			System.out.println("Sorry, name is not valid!");
			return false;
		}
	}

	public static boolean validateEmail(String email) {

		// change this to pass ALL tests
		String regex = "[a-zA-Z0-9]{5,30}@[a-zA-Z0-9]{3,10}\\.[a-zA-Z0-9]{2,3}";

		if (email.matches(regex)) {
			System.out.println("Email is valid!");
			return true;
		} else {
			System.out.println("Sorry, email is not valid!");
			return false;
		}
	}
	
	public static boolean validatePhone(String phone) {

		// change this to pass ALL tests
		String regex = "\\d{3}-\\d{3}-\\d{4}";

		if (phone.matches(regex)) {
			System.out.println("Phone number is valid!");
			return true;
		} else {
			System.out.println("Sorry, phone is not valid!");
			return false;
		}
	}
	
	public static boolean validateDate(String date) {

		// change this to pass ALL tests
		String regex = "\\d{2}/\\d{2}/\\d{4}";

		if (date.matches(regex)) {
			System.out.println("Date is valid!");
			return true;
		} else {
			System.out.println("Sorry, date is not valid!");
			return false;
		}
		
	}
	
	public static boolean validateHTML(String HTML) {
		
		String regex = "<([a-zA-Z]*\\d*)>.*</([a-zA-Z]*\\d*)>";
		
		if(HTML.matches(regex)) {
			System.out.println("HTML is valid!");
			return true;
		} else {
			System.out.println("HTML is not valid!");
			return false;
		}
	}
	
	

}
