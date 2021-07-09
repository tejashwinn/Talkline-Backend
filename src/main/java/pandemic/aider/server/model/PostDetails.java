package pandemic.aider.server.model;

import pandemic.aider.server.service.JsonServiceServer;

import java.io.Serializable;
import java.util.ArrayList;

public class PostDetails implements Serializable {
	
	private final String pincode;
	private final String content;
	private final String postUniqueId;
	private final String userUsername;
	private final String time;
	private final ArrayList<String> userTags;
	
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
	
	public PostDetails(String[] postDetails) {
		postUniqueId = postDetails[0];
		userUsername = postDetails[1];
		content = postDetails[2];
		userTags = JsonServiceServer.strToList(postDetails[3]);
		pincode = postDetails[4];
		time = postDetails[5];
	}
}
