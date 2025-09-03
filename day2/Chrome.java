package week3.day2;

public class Chrome extends Browser {
	public void openIncognito() {
		System.out.println("Chrome is opening Incognito mode");
	}
	public void clearCache() {
		System.out.println("chrome cache cleared");
	}
	public static void main(String[] args) {
		Chrome chrome=new Chrome();
		chrome.openURL();
		chrome.openIncognito();
		chrome.clearCache();
		chrome.closeBrowser();
		System.out.println();
		
	}
	

}
