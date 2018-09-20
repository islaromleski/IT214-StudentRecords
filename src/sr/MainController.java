/**
 * @author Matthew Romleski
 */

package sr;

import fr.Professor;
import java.util.ArrayList;
import java.util.List;

public class MainController {

	public static void main(String[] args) {
		
		Student students[] = new Student[4];
		
		Student aStudent1 = new UndergradStudent();
		Student aStudent2 = new Student();
		Student aStudent3 = new Student();
		Student aStudent4 = new Student();

		aStudent1.setFirstName("Jim");
		aStudent2.setFirstName("Sarah");
		aStudent1.setFirstName("Cathy");
		aStudent1.setFirstName("James");
		
		students[0] = aStudent1;
		students[1] = aStudent2;
		students[2] = aStudent3;
		students[3] = aStudent4;
		
		int i = 0;
		
		while(i < 4) {
			System.out.println(students[i].toString());
			System.out.println(students[i].skipClass());
			i++;
		}
	}
}

//Program Version 1

/*
ConsoleView aView = new ConsoleView();
TextConnection aTextConnection = new TextConnection();
List<String> aFile = new ArrayList<String>();

aFile = aTextConnection.getFile("C:\\Users\\mroml\\Dropbox\\Documents\\Coding\\Java\\StudentRecords", "StudentRecords.csv");

String[] studentStrings = null;
List<Student> listOfStudents = new ArrayList<Student>();
Student aStudent = null;

//Prints out the each string in the aFile list.
for(String s: aFile) {
				
	studentStrings = s.split(",");
	aView.print("Student ID: " + studentStrings[0]);
	aView.print("First Name: " + studentStrings[1]);
	aView.print("Last Name: " + studentStrings[2]);
	aView.print("Commutes: " + studentStrings[3] + "\n");
	
	//aView.print("Student: " + s);
	
}
*/

// Program version 2

/*
// Create Professor Objects from the Professor class.
Professor aProfessor1 = new Professor();
Professor aProfessor2 = new Professor();

//Set information for the advisors.
aProfessor1.setFirstName("Jane");
aProfessor1.setLastName("Smith");

aProfessor2.setFirstName("Bob");
aProfessor2.setLastName("Kohl");

// This creates Student Objects from the Student class.
Student aStudent1 = new Student();
Student aStudent2 = new Student();
Student aStudent3 = new Student();
Student aStudent4 = new Student();
Student aStudent5 = new Student();

//Creates an object to interact with the console
ConsoleView aView = new ConsoleView();

//Set information for the students.
aStudent1.setStudentId(12676184);

aStudent1.setFirstName("Matthew");
aStudent2.setFirstName("John");
aStudent3.setFirstName("Jacob");
aStudent4.setFirstName("Samantha");
aStudent5.setFirstName("Isla");

aStudent1.setLastName("Romleski");
aStudent2.setLastName("Doe");

aStudent1.setAdvisor(aProfessor1);
aStudent2.setAdvisor(aProfessor2);

//Creates an array to hold the students.
Student[] studentArray = new Student[5];
studentArray[0] = aStudent1;
studentArray[1] = aStudent2;
studentArray[2] = aStudent3;
studentArray[3] = aStudent4;
studentArray[4] = aStudent5;
*/

// Old way of printing out information.

/*
*aView.print(aStudent1.getId() + "");
*aView.print(aStudent1.getFirstName());
*aView.print(aStudent1.getLastName());
*aView.print("");
*aView.print(aStudent2.getId() + "");
*aView.print(aStudent2.getFirstName());
*aView.print(aStudent2.getLastName());
*
*
*aView.print(aStudent1.toString());
*aView.print(aStudent1.getAdvisor().getFullName());
*
*aView.print(aStudent2.toString());
*aView.print(aStudent2.getAdvisor().getFullName());
*/