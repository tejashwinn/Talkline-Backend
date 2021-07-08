package pandemic.aider.server.model;

import pandemic.aider.server.service.JsonServiceServer;

import java.io.Serializable;
import java.util.ArrayList;

public class PostDetails implements Serializable {
	private final String pincode;
	
	private final String content;
	
	private String postUniqueId;
	
	private final String userUsername;
	
	private final String time;
	
	private final ArrayList<String> userTags;
	
	public PostDetails(String[] strArr) {
		
		postUniqueId = strArr[0];
		userUsername = strArr[1];
		content = strArr[2];
		userTags = JsonServiceServer.strToList(strArr[3]);
		pincode = strArr[4];
		time = strArr[5];
		
	}
	
	public String getTime() {
		
		return time;
	}
	
	public String getPincode() {
		
		return pincode;
	}
	
	public String getContent() {
		
		return content;
	}
	
	public String getPostUniqueId() {
		
		return postUniqueId;
	}
	
	public String getUserUsername() {
		
		return userUsername;
	}
	
	public ArrayList<String> getUserTags() {
		
		return userTags;
	}
	
}
