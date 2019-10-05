//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class Project2 {
//	private static Student Student1;
//	private static Student Student2;
//	private static GradeItem gradeItem1;
//	private static GradeItem gradeItem2;
//
//	public static void main(String[] args) throws FileNotFoundException {
//
//		// test1A will be run
//		test1A();
//
//		// test1B will be run
//		test1B();


/*********************************************************************************************************/

//		// Out put
//		File creation = new File("Project_02_Input01.txt");
//
//		try {
//			PrintWriter output = new PrintWriter(creation);
//			output.println("STUDENT,ADD,900123456,Joe,Doe,joedoe@msudenver.edu");
//			output.println("GRADE ITEM,ADD,1,900123456,23456,HW,20190112,100,95");
//			output.close();
//		} catch (IOException ex) {
//			System.out.printf("Error: $s\n", ex);
//
//		}
//	}
//}



/*********************************************************************************************************/



/*Console outprint code

//    System.out.println("Running Test 1a:" + "\nStudent {" + student1.toString() 
//    + "}\n" + "\nRunning Test 1b:" + "\nStudent {" + gradeItem1.toString());
//    
//    System.out.println("\n"+"\n" + "*********************************************************" +"\n" + "\n");
//    
//    System.out.println("Running Test 2a:" + "\nStudent Object Data\n" + student2.toString1());
//  
//    System.out.println("\nRunning Test 2b:" + "\nGradeItemData\n" + gradeItem2.toString1());
//    
//    System.out.println("\n"+"\n" + "*********************************************************" +"\n" + "\n");
//    
//    System.out.println("Running Test 3a:");
//    		equalsS(student1, student1);
//    		equalsS(student1, student2);
//    		
//    		
//    System.out.println("\nRunning Test 3b:");
//    		equalsG(gradeItem2, gradeItem2);
//    		equalsG(gradeItem1, gradeItem2);
//		
//		

	
	
	
/*********************************************************************************************************/

	
	
	
//		
//		
//		
//		
//		
//		//Importing Files
//	    // declarations & initializations
//
////	    File fileName = new File("C:\\Users\\SURFACE\\Desktop\\Eclipse 2019\\CS2\\Project_02_Input01.txt");
//	//    
////	    Scanner scan = null;
//	//
////	    // attempts to create scanner for file
////	    try
////	    {
////	    	scan = new Scanner(fileName);
////	    	
////	        while(scan.hasNextLine()) {
////	        	System.out.println(scan.nextLine());
////	        }
////	    }
////	    catch(FileNotFoundException e)
////	    {
//	//  
////	        System.err.println("\n" + "File not found");
////	        return;
////	    }
//		
////		String fileName = ("C:\\Users\\SURFACE\\Desktop\\Eclipse 2019\\CS2");
////	    File file = new File(fileName);
//	//   
////	    try (Scanner scanner = new Scanner(file)) {
////	      String line;
////	      boolean hasNextLine = false;
////	      while(hasNextLine = scanner.hasNextLine()) {
////	        line = scanner.nextLine();
////	        System.out.println(line);
////	      }
////	    }
//		//Output results to a text file


///***************************************************************************************************************/   


//	public static void main(String[] args) throws FileNotFoundException{
//		
//		//test1A will be run	
//		test1A();
//		
//		//test1B will be run
//		test1B();
//		
//
//		
//		//Importing Files
//	    // declarations & initializations
//
//	    File fileName = new File("Project_02_Input01.txt");
//	    
//	    Scanner scan = null;
//	    
//	    
//	 
//
//	    // attempts to create scanner for file
//	    try
//	    {
//	    	scan = new Scanner(fileName);
//	    	
//	        while(scan.hasNextLine()) {
//	        	
//	        	System.out.println(scan.nextLine());
//	        }
//	    }
//	    catch(FileNotFoundException e)
//	    {
//	  
//	        System.err.println("\n" + "File not found");
//	        return;
//	    }   
//	    
//	}	
//		
//		/*Test 1a
//		 * Checks constructors with parameters for each field and the toString() method for each class*/
//		/**
//		 * This is the getter for private variable student ID
//		 * @return String for the Student ID
//		 */
//		
//		public static void test1A() {
//			Student1 = new Student("900912347" ,"Richard", "William", "Rwilliam@gmail.com");
//			Student2 = new Student("900998765", "Steven", "Kim", "SKim@gmail.com");
//			System.out.println(Student1.toString());
//			System.out.println(Student2.toString());
//			}
//			
//		/*Test 1b
//		 * Checks constructors with parameters for each field and the toString() method for each class*/
//			//String studentID, int gradeItemID, String course, String[] itemType, String date, int maximumScore, int actualScore)
//		
//		public static void test1B() {
//			gradeItem1 = new GradeItem("102345678", 1, "Math", "HW", "9/12/19", 100, 98);
//			gradeItem2 = new GradeItem("109876543", 4, "Physics", "Test", "12/23/19", 50, 25);
//			System.out.println(gradeItem1.toString());
//			System.out.println(gradeItem2.toString());
//		
//		}
//		
//		/*Test 2a
//		 * Checks the Constructors getters, and the reading of data from a second input data file
//		 */
//		
//		public static void processStudentData(String[] splitted) {
//			int numberOfItems= splitted.length;
//			for (int i=0; i<numberOfItems; i++) {
//				System.out.println(i);
//			}
//			
//	    	
//		}
//		
//	}
//		
//
//
//
//
