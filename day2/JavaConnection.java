package week3.day2;

public  class JavaConnection implements DatabaseConnection {
	
	public void connect() {
		System.out.println("Database is connected");
	}
	public void disconnect() {
		System.out.println("Database is Disconnected");
	}
	public void executeUpdate() {
		System.out.println("Executed Database is updated");
	}
	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}

}
