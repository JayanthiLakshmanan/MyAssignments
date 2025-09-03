package week3.day2;

public class TextField extends WebElement {
	public void getText() {
		System.out.println("Get text from TextField");
	}
	public static void main(String[] args) {
	    TextField tf=new TextField();
		tf.click();
		tf.setText("Username");
		tf.getText();
		
	}
	

}
