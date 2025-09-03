package week3.day2;

public class WebElement {
	 public void click() {
		 System.out.println("WebElement Clicked");
	 }
	 public void setText(String text) {
	  System.out.println("Text set to:"+text);
	 }
		public static void main(String[] args) {
			WebElement we=new WebElement();
			we.click();
			we.setText("Welcome to WebElement");
			

		}
		
	}


