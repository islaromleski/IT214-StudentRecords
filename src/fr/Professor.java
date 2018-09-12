/**
 * @author Matthew Romleski
 */

package fr;

public class Professor {
	private int id = -999999999;
	private String firstName = "N/A";
	private String lastName = "N/A";
	
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
	
	@Override
	public String toString() {
		
		String message = "";
		message = message + "Id Number: " + this.getId() + "\n";
		message = message + "Full Name: " + this.getFullName() + "\n";
		message = message + "First Name: " + this.getFirstName() + "\n";
		message = message + "Last Name: " + this.getLastName() + "\n";
		
		return message;
		
	}
	
}
