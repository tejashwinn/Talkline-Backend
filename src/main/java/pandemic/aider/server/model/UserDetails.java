package pandemic.aider.server.model;

import java.io.Serializable;

/*
 * Class Credential used to store the credentials of the user
 * All the variable-members are private and can be accessed and modified using only the setter and getter methods
 * concept => Encapsulation
 */
public class UserDetails implements Serializable {
	
	private final String uniqueId; //generated while signing up
	
	private final String name;     //name entered by the user
	
	private final String username; //username entered by the user
	
	private String password; //password entered by the user
	
	private final String time;     //date and time the user was created
	
	private final String phoneNo; //for phone no of user
	
	public UserDetails(String[] arr) {
		
		uniqueId = arr[0];
		name = arr[1];
		username = arr[2];
		password = arr[3];
		time = arr[4];
		phoneNo = arr[5];
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getUsername() {
		
		return username;
	}
	
	public String getPassword() {
		
		return password;
	}
	
	public void setPassword(String password) {
		
		this.password = password;
	}
	
	public String getTime() {
		
		return time;
	}
	
	public String getUniqueId() {
		
		return uniqueId;
	}
	
	public String getPhoneNo() {
		
		return phoneNo;
	}
	
}
