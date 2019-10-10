/*
 *Student class holds student data
 *Calvin Nguyen
 *Project 1
 *Eclipse Java IDE
 *acquiesce: agree or express agreement.
 *"What comes easy won't last, what lasts won't come easy" - Ntsiki KaCaleni, (6.1980)
 *@author Calvin Nguyen
 *@version project 1 
 *@class Student
 */


public class Student {

	// Variables for student

	private String studentID;   // Student ID
	private String firstName;   // First Name
	private String lastName;    // Last Name
	private String email;       // Email

/************************************************************************************************************/	
	
	// Start of constructor
	
	/**
	 * Constructor for the student class
	 * @param StudentID string that identifies student
	 * @param firstName string that identifies the first name of the student
	 * @param lastName string that identifies the last name of the student
	 * @param email string that identifies the email of the student
	 */
	
	public Student(String studentID, String firstName, String lastName, String email) throws IllegalArgumentException {

		// Start of the Illegal Argument Exceptions statements

		if (studentID == null || studentID.equals("")) {   
			throw new IllegalArgumentException("Error: Student ID is blank." 
												+ "\nStudent was not added to the student list.");
		}
		if (firstName == null || firstName.equals("")) {                                                
			throw new IllegalArgumentException("Error: First name is blank." 
												+ "\nStudent was not added to the student list.");
		}
		if (lastName == null || lastName.equals("")) {                                                  
			throw new IllegalArgumentException("Error: Last name is blank." 
												+ "\nStudent was not added to the student list.");
		}
		if (email == null || email.equals("")) {                                                        
			throw new IllegalArgumentException("Error: Email is Blank." 
												+ "\nStudent was not added to the student list.");
		}
	
		if (!email.contains("@")) {   
			throw new IllegalArgumentException("Error: Email Address " + email 
										+ " is invalid." + "\nStudent was not added to the student list.");
		}
	
		// Initializing Variables

		this.studentID = studentID;  
		this.firstName = firstName;  
		this.lastName = lastName;    
		this.email = email;          

	}
	
	//  End of constructor.
	
/************************************************************************************************************/
	
	// Start of Getter methods.
	
	/**
	 * This is the getter for private variable student ID
	 * @return String for the Student ID
	 */

	public String getStudentID() { 
		return studentID;
	}
	
	/**
	 * This is the getter for private variable first Name
	 * @return String for the first Name
	 */

	public String getFirstName() { 
		return firstName;
	}
	
	/**
	 * This is the getter for private variable first Name
	 * @return String for the last Name
	 */

	public String getLastName() {  
		return lastName;
	}
	
	/**
	 * This is the getter for private variable first Name
	 * @return String for the email
	 */

	public String getEmail() {    
		return email;
	}
	
	// End of Getter methods
	
/************************************************************************************************************/
	
	// Start of equals method 
	
	/**
	 * Determines whether two instance of an object are the same
	 * @param other student references other students that hold the same object
	 * @return Returns true if all of the variables equal to each other 
	 * 	and will return false if any of the variables don't match.
	 */
	
	@Override
	public boolean equals(Object other) {

		if(this == other) {
			return true;
		}
		if(this.getClass() != other.getClass()) {
			return false;
		}
		Student temp = (Student) other;
		if (this.studentID.compareTo(temp.getStudentID())==0 && this.firstName.compareTo(temp.getFirstName())==0
				&& this.lastName.compareTo(temp.getLastName())==0 && this.email.compareTo(temp.getEmail())==0) {
			
			return true;
		}
		
		return false;
		
		
	}
	
	public boolean equals(Student other) {
		if (this.studentID.compareTo(other.getStudentID())==0 && this.firstName.compareTo(other.getFirstName())==0
				&& this.lastName.compareTo(other.getLastName())==0 && this.email.compareTo(other.getEmail())==0) {
			
			return true;
		}

			return false;
	}

	// End of equals method
	
/************************************************************************************************************/	
	// Start of toString Method
	
	/**
	 * Returns the values of the private variables
	 * @return Returns the values for studentID, firstName, lastName, and email
	 */
	
	public String toString() {
		return "student ID:" + studentID + ", firstName:" + firstName + 
				", lastName:" + lastName + ", emailAddress:" + email;
	
	}
	public String toString1() {
		return "Student ID:" + studentID + "\nFirst Name:" + firstName + 
				"\nLast Name:" + lastName + "\nEmail Address:" + email;
		
		
	// End of toString method
		}

}