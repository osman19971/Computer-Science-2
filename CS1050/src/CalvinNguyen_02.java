/**
 *Runs a series of tests to make sure that the Student and GradeItem Class are working properly 
 *Calvin Nguyen and Nestor Ayla
 *Project 2
 *Eclipse Java IDE
 *acquiesce: agree or express agreement.
 *"hard work beats talent when talent doesn't work" - Tim Notke, (8.1987)
 *@author Calvin Nguyen and Nestor Ayla
 *@version project 2 
 *@class CalvinNguyen_02
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CalvinNguyen_02 {
	
	// Variables
	
	private static Student student1;          // Student 1
	private static Student student2;          // Student 2
	private static GradeItem gradeItem1;      // Grade Item 1
	private static GradeItem gradeItem2;      // Grade Item 2
	private static String INPUT_FILENAME = "Project_02_Input07.txt";	  // INPUT_FILENAME
	private static String[] splitter;         // Splitter 
	private static PrintWriter output;		  // Output

/************************************************************************************************************/
	
	//Start of Main method
	
	public static void main(String[] args) throws IOException{
			
		// Run instantiation test
		
		test1A();      											
		
		test1B();       										 

	    File INPUT_FILENAME= new File("Project_02_Input07.txt"); // Importing the file.
	    
	    Scanner scan;   
	    String t1 = "";
	    
	    try                                                    	 // Uses Scanner to check if the file exists or not.
	    {
	    	scan = new Scanner(INPUT_FILENAME);
	    	
	            }
	    catch(FileNotFoundException e)
	    {
	  
	        System.err.println("File not found");
	        
	        return;
	    }   
	    while(scan.hasNextLine()) {                              /* Scanner continues scanning even if there is an empty 
	    															space.*/
	    	t1 = scan.nextLine();
	    	if (t1.isEmpty()) {
	    		continue;
	    	}
	    	
	    	splitter= t1.split(",");                    
	    	
	
	    	
	    	if(splitter[0].equals("STUDENT")) {
	    		processStudentData(splitter);
	    	}
	    	
	    	else if(splitter[0].equals("GRADE ITEM")) {
	    		processGradeItemData(splitter);
	    	}
	    	else
	    		throw new IOException("Text file does not start with Student or Grade Item");
	    	
	    	
	    } 
	 
		File creation = new File("Project_02_Output07.txt");     // Exporting output to a new File.
		
	
		try {
			output = new PrintWriter(creation);
			
				output.println("Running Test 1a:" + "\nStudent {" + student1.toString() 
			    + "}\n" + "\nRunning Test 1b:" + "\nStudent {" + gradeItem1.toString() + "}");
			    
			    output.println("\n" + "\n*********************************************************\n" + "\n");
			    
			    output.println("Running Test 2a:" + "\nStudent Object Data\n" + student2.toString1());
			  
			    output.println("\nRunning Test 2b:" + "\nGradeItemData\n" + gradeItem2.toString1());
			    
			    output.println("\n" + "\n*********************************************************\n" + "\n");
			    
			    output.println("Running Test 3a:");
			    		equalsStudentObjects(student1, student2);
			
			    output.println("\nRunning Test 3b:");
			    		equalsGradeItemObjects(gradeItem1, gradeItem2);
		  output.close();
			
		} catch (IOException ex) {
			System.out.printf("Error: unable to export data to file $s\n", ex);
	
		}
	}
       		
    //End of Main method
 
/************************************************************************************************************/	
	
	// Start of test 1a method
	
	/** Test 1a Checks the each field in student constructors and if conditions are met, hard code the fields 
	 * into student1.
	 */

	public static void test1A() {
		student1= new Student("900123456", "Joe" ,"Doe","joedoe@msudenver.edu");  	
	}
	
	// End of test 1a method
	
/************************************************************************************************************/	
	
	// Start of test 1b method
	
	/** Test 1b Checks the each field in student constructors and if conditions are met, hard code the fields 
	 * into gradeItem1.
	 */

	public static void test1B() {  
		gradeItem1 = new GradeItem ("900123456",1,"23456","HW","20190112",100,95);  
	}
	
	// End of test 1b method
	
/************************************************************************************************************/	
	
	// Start of test 2a method
	
	/** Test 2a 
	 * Checks second position of the array for "ADD", If valid will store references in student2 and will 
	 * throw exception if it is not. 
	 * @param splitter String array that identifies the items from the text file.
	 */

	public static void processStudentData(String[] splitter) throws IllegalArgumentException {
		
		if (splitter[1].equals("ADD")) {

			 student2 = new Student(splitter[2], splitter[3], splitter[4], splitter[5]);
			
			
		} else {
			
			throw new IllegalArgumentException("The second postions has: "+ splitter[1] 
													+ " instead of  ' ADD'" + " in textfile");

		}
		try {
			 student2 = new Student(splitter[2], splitter[3], splitter[4], splitter[5]);
			
			}
	
		catch(IllegalArgumentException e){
			System.err.println("One of the parameters in the student constructor has thrown an exception");
		}
	}
	
	// End of test 2a method
	
/************************************************************************************************************/	
	
	// Start of test 2b method
	
	/**Test 2b:
	 * Checks second position of the array for "ADD", If valid will store references in gradeItem2 and will
	 * throw exception if it is not. 
	 * @param splitter String array that identifies the items from the text file.
	 */
	public static void processGradeItemData(String[] splitter) throws IllegalArgumentException{
		
		if (splitter[1].equals("ADD")) {

			gradeItem2= new GradeItem (splitter[3], Integer.parseInt(splitter[2]), splitter[4], splitter[5], 
					splitter[6], Integer.parseInt(splitter[7]), Integer.parseInt(splitter[8]));	
		}
		else {
			throw new IllegalArgumentException("The second postions has: "+ splitter[1] 
												+ " instead of  ' ADD'" + " in textfile");
		
	}
		try {
			 gradeItem2 = new GradeItem (splitter[3], Integer.parseInt(splitter[2]), splitter[4], splitter[5],
					 splitter[6], Integer.parseInt(splitter[7]),Integer.parseInt(splitter[8]));
			}
	
		catch(IllegalArgumentException e){
			System.err.println("One of the parameters in the student constructor has thrown an exception");

		}
	}
	
	// End of test 2b method
	
/************************************************************************************************************/	
	
	// Start of test 3a method
	
	/**Test 3a
	 * Determines whether two instance of the student objects are the same.
	 * @param Student1 and Student 2 objects refers to the values of both students passed by the Student class.
	 * @return Returns true if all of the variables equal to each other and will return false if any of the 
	 * variables don't match.
	 */
	
	public static boolean equalsStudentObjects(Student student1,Student student2) {
		if (student1.equals(student2)){
			output.println("Student Objects are equal: Student IDs are " + student1.getStudentID());
		return true;
		}
			output.println("Student Objects are unequal: Student IDs are " + student1.getStudentID() 
							+ " and " + student2.getStudentID());
			return false;
		}
	
	// End of test 3a method
	
/************************************************************************************************************/	
	
	// Start of test 3b method
	
	/**Test 3b
	 * Determines whether two instance of the gradeItem objects are the same.
	 * @param gradeItem1 and gradeItem2 objects refers to the values of both students passed by the GradeItem class.
	 * @return Returns true if all of the variables equal to each other and will return false if any of the 
	 * variables don't match.
	 */

	public static boolean equalsGradeItemObjects(GradeItem gradeItem1, GradeItem gradeItem2) {
		if (gradeItem1.equals(gradeItem2)){
			output.println("GradeItem Objects are equal: Student IDs are " + gradeItem2.getStudentID());
			return true;
		}
				
			output.println("GradeItem Objects are unequal: Student IDs are " + gradeItem1.getStudentID() 
							+ " and " + gradeItem2.getStudentID() );
			return false;
				
	}
}

	// End of test 3b method
	
