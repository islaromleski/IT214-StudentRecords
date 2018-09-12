/**
 * @author Matthew Romleski
 */

package sr;

import fr.Professor;

public class Student {
	private int id = -999999999;
	private String firstName = "N/A";
	private String lastName = "N/A";
	private boolean isCommuter = false;
	private Professor advisor = null;
	
	public String getFullName() {
		return this.lastName + ", " + this.firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String newName) {
		this.firstName = newName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setStudentId(int newId){
		this.id = newId;
	}	
	
	public boolean getIsCommuter() {
		return this.isCommuter;
	}
	
	public void setIsCommuter(boolean aCommuter) {
		this.isCommuter = aCommuter;
	}
	
	public Professor getAdvisor(){
		return this.advisor;
	}
	
	public void setAdvisor(Professor newAdvisor) {
		this.advisor = newAdvisor;
	}
	
	@Override
	public String toString() {
		
		String message = "";
		message = message + "Id Number: " + this.getId() + "\n";
		message = message + "Full Name: " + this.getFullName() + "\n";
		message = message + "First Name: " + this.getFirstName() + "\n";
		message = message + "Last Name: " + this.getLastName() + "\n";
		message = message + "Is Commuter: " + this.getIsCommuter() + "\n";
		
		return message;
		
	}
	
}
