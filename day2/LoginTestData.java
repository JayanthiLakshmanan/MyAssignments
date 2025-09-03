package week3.day2;

public class LoginTestData extends TestData{
	   
	public void enterUserName() {
		System.out.println("Username is entered");
	}
	public void enterPassword() {
		System.out.println("Password is Entered");
	}

	public static void main(String[] args) {
		LoginTestData ltd=new LoginTestData();
		ltd.enterCredentials();
		ltd.navigateToHomePage();
		ltd.enterUserName();
		ltd.enterPassword();         
		
			
		}

	}

