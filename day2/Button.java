package week3.day2;

public class Button extends WebElement{
	public void submit() {
		System.out.println("Button submitted");
	}
	public static void main(String[] args) {
		Button bn=new Button();
		bn.click();
		bn.setText("Submit Button");
		bn.submit();
		
		
		
	}

}
