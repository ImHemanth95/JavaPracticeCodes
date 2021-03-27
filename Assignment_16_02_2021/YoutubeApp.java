package Assignment_16_02_2021;

public class YoutubeApp {
	
	
public YoutubeApp sign_in(String email,String password) {
		System.out.println("Sign_in with email = "+email+"and password = "+password);
		return this;
	}
public YoutubeApp sign_up(String email,String username,String Password,String phonenumber) {
		System.out.println("Sign_up with email = "+email+"and username = "+username+"with update your password"+Password+"enter phonenumber to reg = "+phonenumber);
		return this;
    }
public YoutubeApp search(String content) {
		System.out.println("you tried searching this = "+" "+content);
        return this;		
	}
public YoutubeApp select(String video) {
		System.out.println("you selected this = "+" "+video+" "+"video started playing");
		return this;
	}
public YoutubeApp settings(int quality) {
		System.out.println("you selected quality of video to = "+" "+quality);
		return this;
	}
public YoutubeApp fullscreen(String size) {
		System.out.println("you are viewing your video in = "+" "+size+" "+"now");
		return this;
	}
public YoutubeApp likeVideo(String video_1) {
		System.out.println("you liked this video = "+" "+video_1);
		return this;
	}
public YoutubeApp dislikeVideo(String video_2) {
		System.out.println("you liked this video = "+" "+video_2);
		return this;
	}
public YoutubeApp subscribe(String channel_name) {
		System.out.println("you subscribed this channel = "+channel_name);
		return this;
	}
public YoutubeApp menu() {
		System.out.println("you are now viewing your youtube menu");
		return this;
	}
public YoutubeApp history(String viewedvidoeo) {
	//select(viewedvidoeo);
	System.out.println("you viewed history is = "+" "+viewedvidoeo);
	return this;
}
public YoutubeApp Logout() {
	System.out.println("logged out,please click on signIn button to login again");
	return this;
}

	
}




