package week4.day1;

public class SubClass extends SuperClass{
	//overriding the method
	void displayMessage() {
		System.out.println("Message from Subclass");
		super.displayMessage();
	}

	public static void main(String[] args) {
	    SubClass suc=new SubClass();
	    suc.displayMessage();
	    

	}

}
