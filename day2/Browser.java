package week2.day2;


public class Browser {
	
	public static void main(String[] args) {
		Browser browser=new Browser();
		browser.launchBrowser("Chrome");
		String result =browser.loadUrl();
		System.out.println(result);
	}

	public void launchBrowser(String browserName) {
		System.out.println("Browser launched:"+browserName);
	}
		public String loadUrl() {
			return "URL loaded successfully";
		
		
	}
}
