package pandemic.aider.server.model;

import java.io.Serializable;

public class UserDetails implements Serializable {
	private final String uniqueId;  //generated while signing up
	private final String name;      //name entered by the user
	private final String username;  //username entered
	private final String time;      //date and time the user was created
	private final String phoneNo;   //for phone no of user
	private String password;        //password entered by the user
	
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
	
	public UserDetails(String[] userDetails) {
		uniqueId = userDetails[0];
		name = userDetails[1];
		username = userDetails[2];
		password = userDetails[3];
		time = userDetails[4];
		phoneNo = userDetails[5];
	}
}


