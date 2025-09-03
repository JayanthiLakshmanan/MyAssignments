package week3.day2;

public class CheckBoxButton extends Button {
	public void clickCheckButton() {
		System.out.println("check box Clicked");
	}
	public static void main(String[] args) {
		CheckBoxButton cbb=new CheckBoxButton();
		cbb.click();
		cbb.setText("Accept Terms");
		cbb.submit();
		cbb.clickCheckButton();
		
	
		
		
	}
	

}
