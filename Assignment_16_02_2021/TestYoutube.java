package Assignment_16_02_2021;

public class TestYoutube {

	public static void main(String[] args) {
		YoutubeApp user1 = new YoutubeApp();
		user1.sign_in("test@gmail.com", "test123")
		.search("Kannada Songs")
		 .select("autoraja")
		  .settings(1080)
		   .fullscreen("Fullscreen")
		    .likeVideo("autoraja")
		     .subscribe("anand audio")
		      .menu()
		      .history("autoraja")
		       .Logout();
		System.out.println("--------------------------------");
		YoutubeApp user2 = new YoutubeApp();
		user2.sign_in("test@gmail.com", "Test123")
		.search("Testing")
		 .likeVideo("NaveenAutomationLabsvideo")
		  .subscribe("NaveenAutomationLabs")
		   .history("NaveenAutomationLabs")
		    .Logout();
		}

}
