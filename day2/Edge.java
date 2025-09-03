package week3.day2;

public class Edge extends Browser {
	public void takeSnap() {
		System.out.println("Edge is taking a screenshot");
	}
	public void clearCookies() {
		System.out.println("Edge cookies cleared");
	}
	public static void main(String[] args) {
		Edge edge=new Edge();
		edge.openURL();
		edge.takeSnap();
		edge.clearCookies();
		edge.navigateBack();
		edge.closeBrowser();
		System.out.println();
	}

}
