/*
 *GradeItem class holds data about grades that students earned in various courses
 *Calvin Nguyen
 *Project 1
 *Eclipse Java IDE
 *acquiesce: agree or express agreement.
 *"What comes easy won't last, what lasts won't come easy" - Ntsiki KaCaleni, (6.1980)
 *@author Calvin Nguyen
 *@version project 1 
 *@class GradeItem
 */


import java.lang.reflect.Array;

public class GradeItem {
	
	//Variables for the GradeItem
	
	private String studentID;   // StudentID 
	private int gradeItemID;    // gradeItemID
	private String course;      // String course
	private static String[] itemType = {"HW", "Quiz", "Class Work", "Test", "Final"}; /*String Array that 
	                                                                                  holds the valid itemType*/ 
								
	private String itemTypes;   // itemTypes
	private String date;        // date
	private int maximumScore;   // maximumScore
	private int actualScore;    // actualScore
	
/************************************************************************************************************/	 

		// Start if constructor
	
		/**
		 * Constructor for the student class
		 * @param StudentID string identifies the student in gradeItem
		 * @param gradeItemID integer identifies the gradeItemID in gradeItem
		 * @param course string identifies the courses in gradeItem
		 * @param itemType string array identifies the itemType in gradeItem
		 * @param date string identifies the date in gradeItem 
		 * @param maximumScore integer identifies the maximumScore in gradeItem
		 * @param actualScore integer identifies the actualScore in gradeItem
		 */
	
	public GradeItem(String studentID, int gradeItemID, String course, String itemTypes, 
			String date, int maximumScore, int actualScore) throws IllegalArgumentException {
				
		//Exceptions
		
		// Start of the Illegal Argument Exceptions statements
				
		if (studentID == null || studentID.equals("")) {                                                     
			throw new IllegalArgumentException ("Student ID is Blank." 
												+ "\nGradeItem  was not added to the gradeitem list.");
		}
		
		if (gradeItemID <= 0) {                                                                              
			throw new IllegalArgumentException ("Grade Item must not be less than or equal to 0." 
												+ "\nGradeItem  was not added to the gradeitem list." );
			
		}
		if (course == null || course.equals("")) {                                                           
			throw new IllegalArgumentException ("course is blank." 
												+ "\nGradeItem  was not added to the gradeitem list.");
		}
		
		if (itemTypes == null) {                                                                              
			throw new IllegalArgumentException ("Item Type is null." 
												+ "\nGradeItem  was not added to the gradeitem list.");	
		}	
		
		if (date == null || date.equals("")) {                                                               
			throw new IllegalArgumentException ("Date is null or blank." 
												+ "\nGradeItem  was not added to the gradeitem list.");
		}
		if (maximumScore <= 0) {                                                                             
			throw new IllegalArgumentException ("Maximum Score is below or equal to 0. "
												+ "\nGradeItem  was not added to the gradeitem list.");
		}
		if (actualScore < 0 || actualScore > maximumScore) {                                                 
			throw new IllegalArgumentException ("Actual Score is not between 0 and Maximum score. "
												+ "\nGradeItem  was not added to the gradeitem list.");
		}
		if (isValidType(itemTypes)==false) {
			throw new IllegalArgumentException (itemTypes + " is not a valid item type." 
												+ "\nGradeItem  was not added to the gradeitem list.");	
			
		}
		
		//Initialize Instance Variables
		
		this.studentID = studentID;              
		this.gradeItemID = gradeItemID;         
		this.course = course;                   
		this.itemTypes = itemTypes;             
		this.date = date;                       
		this.maximumScore = maximumScore;      
		this.actualScore = actualScore;         
		
		// End of constructor		
		
	}
/************************************************************************************************************/	
	
	// Start of the helper method
	
	/**
	 * Checks if item types are valid or not
	 * @param itemtypes string are compared string array of valid item types
	 * @return true if the item types is equal to any of the items in itemType and returns false if they aren't equal
	 */

		private boolean isValidType(String itemTypes) {
				for (int i = 0; i < GradeItem.itemType.length;i++) {
					if(itemTypes.equals(GradeItem.itemType[i])) {
						return true;
					}
				}
						return false;
	}	
	
	// End of the helper method
			
/************************************************************************************************************/	
		
	// Start of getter methods
	
	/**
	 * This is the getter for private variable student ID
	 * @return String for the Student ID
	 */
	
	public String getStudentID() { // Getters for private variable student ID
		return studentID;
	}
	
	/**
	 * This is the getter for private variable gradeItemID
	 * @return integer for the gradeItemID
	 */
	
	public int getGradeItemID() { // Getters for private variable gradeItemID
		return gradeItemID;
	}
	
	/**
	 * This is the getter for private variable course
	 * @return String for the course
	 */
	
	public String getCourse() { // Getters for private variable course
		return course;
	}
	
	/**
	 * This is the getter for private variable itemType
	 * @return String for the itemType
	 */
	
	public String getItemTypes() { // Getters for private variable itemType
		return itemTypes;
	}
	
	/**
	 * This is the getter for private variable date
	 * @return String for the date
	 */
	
	public String getDate() { // Getters for private variable date
		return date;
	}
	
	/**
	 * This is the getter for private variable maximumScore
	 * @return integer for the maximumScore
	 */
	
	public int getMaximumScore() { // Getters for private variable maximumScore
		return maximumScore; 
	}
	
	/**
	 * This is the getter for private variable actualScore
	 * @return integer for the actualScore
	 */
	
	public int getActualScore() { // Getters for private variable actualScore
		return actualScore; 
	}
	
	// End of the getter methods
	
/************************************************************************************************************/ 
	
	// Start of the Equals Method
	 
	/**
	 * Determines whether two instance of an object contain exactly
	 * @param other is GradeItem parameter that takes other.
	 * @return Returns true if all of the variables equal to each other and 
	 * will return false if any of the variables don't match.
	 */
	
	@Override
	public boolean equals(Object other) {
//		System.out.println("DEBUG: Student Equals Called");
		if(this == other) {
			return true;
		}
		if(this.getClass() != other.getClass()) {
			return false;
		}
		GradeItem temp = (GradeItem) other;
		if (this.studentID.compareTo(temp.getStudentID())==0 && this.gradeItemID==temp.getGradeItemID() 
				&& this.course.compareTo(temp.getCourse())==0 && this.itemTypes.compareTo(temp.getItemTypes())==0
				&& this.date.compareTo(temp.getDate())==0 && this.maximumScore == temp.getMaximumScore()
				&& this.actualScore == temp.getActualScore())
				 {
			
			return true;
		}
		
		return false;
		
		
	}

	
	
	
	
	public boolean equals(GradeItem other) {
		if (this.studentID.equals(other.getStudentID()) && this.gradeItemID == other.getGradeItemID() && 
				this.course.equals(other.getCourse()) && this.itemTypes.equals(other.getItemTypes()) 
				&& this.date.equals(other.getDate()) && this.maximumScore == other.getMaximumScore() && 
				this.actualScore == other.getActualScore() ) {
				return true;
		}
				return false;
		
	// End of the equals method
	}
	
/************************************************************************************************************/
	
	// Start of toString method
	
		/**
		 * This is a toString method that returns the values of the private variables
		 * @return Returns the values for studentID, gradeItemID, course, itemType, date, maxumumScore, and actualScore
		 */	
	
	public String toString() {
		return "Student ID:" + studentID + ", Grade Item ID:" + gradeItemID + ", Course:" + course + ", Item Type:" 
				+ itemTypes + ", Date:" + date + ", Maximum Score:" + maximumScore + ", Actual Score:" + actualScore;
	}
	
	public String toString1() {
		return  "GradeItem ID: " + gradeItemID + "\nStudent ID: " + studentID +  "\nCourse: " + course + "\nItemType: " 
				+ itemTypes + "\nDate: " + date + "\nMaximum Score: " + maximumScore + "\nActual Score: " + actualScore;
	}
	
	// End of toString method
}
