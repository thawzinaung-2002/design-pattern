package structural.proxy_pattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
	
	private Internet internet = new DefaultInternet();
	private static List<String> bannedSites;
	
	static {
		bannedSites = new ArrayList<>();
		bannedSites.add("facebook.com");
		bannedSites.add("youtube.com");
	}

	@Override
	public void connectToHost(String url) {
		if(bannedSites.contains(url.toLowerCase())) {
			throw new RuntimeException("Acess Denied: connecting to "+ url);
		}
		internet.connectToHost(url);
	}

}
