/**
 * @author Matthew Romleski
 */

package sr;

public class UndergradStudent extends Student{
	
	public String skipClass() {
		return "Skip Class";
	}
	
	@Override
	public String toString() {
		
		String message = "";
		
		message += "This is an undergrad's toString() method.\n";
		
		return message;
		
	}
	
}
