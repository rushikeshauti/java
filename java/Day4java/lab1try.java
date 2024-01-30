package Day4java;
	import java.util.Scanner;
	class BlankNameException extends Exception {
	    public BlankNameException(String message) {
	        super(message);
	    }
	}
	public class lab1try  {
	    private String firstname;
	    private String lastname;
	    private String gender;

	    lab1try(String firstname, String lastname, String gender) throws BlankNameException {
	        if (firstname.isBlank() || lastname.isBlank()) {
	            throw new BlankNameException("First name or last name cannot be blank");
	        }
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.gender = gender;
	    }
	    public void showData() {
	        System.out.println("First Name: " + firstname);
	        System.out.println("Last Name: " + lastname);
	        System.out.println("Gender: " + gender);
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter First Name: ");
	        String firstNameInput = scanner.nextLine();
	        
	        System.out.print("Enter Last Name: ");
	        String lastNameInput = scanner.nextLine();

	        System.out.print("Enter Gender: ");
	        String genderInput = scanner.nextLine();

	        try {
	        	lab1try employee = new lab1try(firstNameInput, lastNameInput, genderInput);
	            employee.showData();
	        } catch (BlankNameException e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
}
