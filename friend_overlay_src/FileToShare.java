package friend_overlay_src;

import java.time.LocalTime;

public class FileToShare {
	public String identifier;
	public Boolean own;
	private Friend friend;
	private String path;
	public LocalTime Timeout;
	private static long timeoutDuration = 1800;
	
	FileToShare(String identifier, boolean own, Friend f, String path){
		this.Timeout = LocalTime.now().plusSeconds(timeoutDuration);
		this.identifier = identifier;
		this.own = own;
		if (!own) {
			this.setFriend(f);
		} else {
			this.setPath(path);
		}
	}


	
	void Update(Friend f){
		this.setFriend(f);
		this.Timeout = LocalTime.now().plusSeconds(timeoutDuration);
	}
	
	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	

}
