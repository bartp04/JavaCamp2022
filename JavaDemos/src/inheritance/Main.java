package inheritance;

public class Main {
	
	public static void main(String[] arguments) {
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.firstName ="Arda ";
		customer.lastName = "Akca ";
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		Person[] people = new Person[2];
		people[0] = customer;
		people[1] = employee;
		
		System.out.println(people[0].firstName + people[0].lastName );
		
		
		
		
	}

}
