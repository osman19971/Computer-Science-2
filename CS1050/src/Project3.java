import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Project3 {

	// Variables

	private static List<Student> listOfStudents;
	private static List<GradeItem> listOfGradeItems;
	final static String INPUT_FILE = "Project_03_Input01.txt";
	final static String OUTPUT_FILE = "Project_03_Output01.txt";
	private static String[] splitter;
	private static PrintWriter output;		  // Output
	private static Student student;          // Student 2
	private static GradeItem gradeItem;      // Grade Item 1
	
/************************************************************************************************************/

	public static void main(String[] args) throws IOException {
		 listOfGradeItems = new ArrayList<GradeItem>();
		 listOfStudents = new ArrayList<Student>();

		 processInput();
		 
		 generateReport();
		
		
		
	}

/************************************************************************************************************/	

public static void processInput() throws IOException {
	File INPUT_FILE = new File("Project_03_Input01.txt"); // Importing the file.

	Scanner scan;
	String t1 = "";

	try // Uses Scanner to check if the file exists or not.
	{
		scan = new Scanner(INPUT_FILE);
		System.err.println("Reading data from file" + INPUT_FILE);

	} catch (FileNotFoundException e) {

		System.err.println("File not found");

		return;
		
	}
	while (scan.hasNextLine()) { /*
									 * Scanner continues scanning even if there is an empty space.
									 */
		t1 = scan.nextLine();
		if (t1.isEmpty()) {
			continue;
		}

		splitter = t1.split(",");
//		System.out.println("DEBUG LINE:"+t1);
//		for(String i : splitter) {
//			System.out.println("\tDEBUG READ:"+i);
//		}
		
		if (splitter[0].equals("STUDENT")) {
			processStudentData(splitter);
		}

		else if (splitter[0].equals("GRADE ITEM")) {
			processGradeItemData(splitter);
		
		} else
			throw new IOException("Text file does not start with Student or Grade Item");

	}
}

/************************************************************************************************************/	
// Start of processStudentData method

/** processStudentData
 * Checks second position of the array for "ADD", If valid will store references in student and will 
 * throw exception if it is not. 
 * @param splitter String array that identifies the items from the text file.
 */

public static void processStudentData(String[] splitter) throws IllegalArgumentException {
//	student = new Student(splitter[2], splitter[3], splitter[4], splitter[5]);
	
	if (splitter[1].equals("ADD")) {
		
		
		try {
			student = new Student(splitter[2], splitter[3], splitter[4], splitter[5]);
			}

		catch(IllegalArgumentException e){

			System.err.println(e.getMessage());
			return;
		}
		
		
		
		 if (listOfStudents.contains(student)) {
			 System.err.println ("Student with Student ID " + splitter[2] + " is already in the list");
			}
		 else {
			listOfStudents.add(student); 
			System.err.println("Student with Student ID " + splitter[2] + " was added to the list.");
			 }
		 
		 //"One of the parameters in the student constructor has thrown an exception"
	 }	
		 
	else if (splitter[1].equals("DEL")) {
		
		try {
			 student = new Student(splitter[2], splitter[3], splitter[4], splitter[5]);
			}

		catch(IllegalArgumentException e){
			System.err.println(e.getMessage());
			return;
		}
		
		if (listOfStudents.contains(student)) {
			 listOfStudents.remove(student);
			 System.err.println ("Student with Student ID " + splitter[2] + " was removed from the list.");
			}
		 else {
				 System.err.println ("Student with Student ID " + splitter[2] +  " was not removed from the list");
			 }
	}
	else {
		
		throw new IllegalArgumentException("The second postions has: "+ splitter[1] 
											+ " instead of  ' ADD' or 'DEL" + " in the textfile");

	}

}

// End of processStudentData method

/************************************************************************************************************/	

// Start of test 2b method

/**Test 2b:
 * Checks second position of the array for "ADD", If valid will store references in gradeItem and will
 * throw exception if it is not. 
 * @param splitter String array that identifies the items from the text file.
 */
public static void processGradeItemData(String[] splitter) throws IllegalArgumentException{
	
	
	if (splitter[1].equals("ADD")) {
		
		try {
			gradeItem = new GradeItem(splitter[3], Integer.parseInt(splitter[2]), splitter[4], splitter[5], 
					splitter[6], Integer.parseInt(splitter[7]), Integer.parseInt(splitter[8].trim()));	
			}

		catch(IllegalArgumentException e){
			System.err.println(e.getMessage());

		}
		 if (listOfGradeItems.contains(gradeItem)) {
			 System.err.println ("Grade Item with Grade Item ID " + Integer.parseInt(splitter[2]) + " is already in the list.");
			}
		 else {
				
				 listOfGradeItems.add(gradeItem);
				 System.err.println("Grade Item with Grade Item ID " + Integer.parseInt(splitter[2]) + " was added to the list.");
			 }
		 
	 }	
		 
	else if (splitter[1].equals("DEL")) {
		
		try {
			gradeItem = new GradeItem(splitter[3], Integer.parseInt(splitter[2]), splitter[4], splitter[5], 
					splitter[6], Integer.parseInt(splitter[7]), Integer.parseInt(splitter[8].trim()));	
			}

		catch(IllegalArgumentException e){
			System.err.println(e.getMessage());
		}
		if (listOfGradeItems.contains(gradeItem)) {
			 listOfGradeItems.remove(gradeItem);
			 System.err.println ("Grade Item with Grade Item ID " + Integer.parseInt(splitter[2]) + " was removed from the list.");
			}
		 else {
				 System.err.println ("Was unable to remove gradeItem object to the list");
			 }
	}
	else {
		
		throw new IllegalArgumentException("The second postions has: "+ splitter[1] + " instead of  ' ADD' or 'DEL" + " in the textfile");

	}
	
}

// End of test 2b method

/************************************************************************************************************/	

public static void generateReport() throws IOException {
	
	Student tempStudent = new Student("Number", "First", "last", "email@gmail.com");
	
	Object[] studentObjects = listOfStudents.toArray();
//		for(Object i : studentObjects) System.out.println("DEBUG:"+i);
//		System.out.println("DEBUG LENGTH:"+studentObjects.length);
//		System.out.print(studentObjects[2]);
	
		for (int i = 0; i< studentObjects.length; i++) {
			if (studentObjects[i] instanceof Student){ //check if object actually workks with student
				tempStudent = (Student) studentObjects[i];	
//			 System.out.printf( "%s\t%s\t%s\t%s\n",tempStudent.getStudentID(), tempStudent.getFirstName(), 
//					 									tempStudent.getLastName(), tempStudent.getEmail());
			 System.out.printf( "%s    %s    %s   %s\n",tempStudent.getStudentID(), tempStudent.getFirstName(), 
						tempStudent.getLastName(), tempStudent.getEmail());
			 
			 
			}
		}

//	public GradeItem(String studentID, int gradeItemID, String course, String itemTypes, 
//			String date, int maximumScore, int actualScore)
	GradeItem tempObjects = new GradeItem("studentID", 1, "course", "HW", "data", 100,95);
	
	Object[] gradeItemObjects = listOfGradeItems.toArray();
	
	for (int t = 0; t< gradeItemObjects.length; t++) {
		if(gradeItemObjects[t] instanceof GradeItem) {
			tempObjects = (GradeItem) gradeItemObjects[t];
			//System.out.println(gradeItemObjects[t] + "\n");
			System.out.println("\t\tDEBUG HIT");
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",tempObjects.getStudentID(), tempObjects.getGradeItemID(), 
					tempObjects.getCourse(), tempObjects.getItemTypes(), tempObjects.getMaximumScore(), 
					tempObjects.getActualScore());
		
		}
	}
	
		

	
	//Generates report to output file
	
	File creation = new File("Project_03_Output01.txt"); // Exporting output to a new File.
	System.out.println("Generating Report...");
	try {
		output = new PrintWriter(creation);

	} catch (IOException ex) {
		System.out.printf("Error: unable to export data to file $s\n", ex);

	}
	
/*----------------------------------------------------------*/
//for (Student )

	
	
/*----------------------------------------------------------*/
	 //Header
		output.println("StudentID  FirstName  LastName  Email" 
		 + "\nGrade Items\n" + "GraeItemID  CourseID  Type  Date "
		 		+ " Maximum Score   Actual Score      Grade (%)*"); 
		output.println("===================================================================================" 
		 		+ "\nTotal                             SumOfMaxScore   SumActualScore" 
				+ "    Grade (%)");
		
		// Output report

		
		
		output.println("Sample Output Report" + "\n____________________\n");
//		output.println (student.toString2() + "\nGradeItems\n" + gradeItem.toString2());
		
		

		
		
		output.close();
	
	
}







/************************************************************************************************************/	
}
