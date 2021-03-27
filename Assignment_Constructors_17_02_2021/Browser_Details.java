package Assignment_Constructors_17_02_2021;
import java.util.*;

public class Browser_Details {

	public static void main(String[] args) {
		ArrayList<String> plugins = new ArrayList<String>();
		plugins.add("AdobeFlashPlayer");
		plugins.add("youtubeflashvideoPlayer");
		plugins.add("BlazeMeter");
		
		Browser b1 = new Browser("ChomreBrowser","google",89.95,plugins);
		System.out.println(b1.plugins_supported);
		System.out.println(b1.getBrowserName());
		System.out.println(b1.getcurrentVersion());

	}

}
