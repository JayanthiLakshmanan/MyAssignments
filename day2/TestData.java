package week3.day2;

public class TestData {
	public void enterCredentials() {
		System.out.println("Enter User Credentials");
	}
public void navigateToHomePage() {
	System.out.println("navigating to home page");
}
public static void main(String[] args) {
	TestData td=new TestData();
	td.enterCredentials();
	td.navigateToHomePage();
}
}
