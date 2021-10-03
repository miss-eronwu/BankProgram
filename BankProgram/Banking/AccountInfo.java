package Banking;

public class AccountInfo {
    
    
    String firstName;
    String lastName;
  
    public AccountInfo(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;

    }
    
 
    public String getFirstName(String firstName) {
	return firstName;
    }
    
    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }
    
    
    public String getLastName(String lastName) {
	return lastName;
    }
    
    public void setLastName(String lastName) {
  	this.lastName = lastName;
      }
    
    public String toString() {	
	
	return "Welcome " + firstName + " " + lastName + "!";
    }
    

}
