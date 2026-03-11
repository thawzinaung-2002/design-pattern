package structural.proxy_pattern;

public class DefaultInternet implements Internet{

	@Override
	public void connectToHost(String url) {
		System.out.println("Connection to...."+ url);
	}

}
