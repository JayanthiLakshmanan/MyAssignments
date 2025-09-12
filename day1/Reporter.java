package week4.day1;

public class Reporter {
	// Overloaded method with two parameters
    public void reportStep(String msg, String status) {
        System.out.println("Message: " + msg + " | Status: " + status);
    }

    // Overloaded method with three parameters
    public void reportStep(String msg, String status, boolean snap) {
        System.out.println("Message: " + msg + " | Status: " + status);
        if (snap) {
            System.out.println("Snapshot: Taken");
        } else {
            System.out.println("Snapshot: Not taken");
        }
    }
    public static void main(String[] args) {
        // Create object
        Reporter rp = new Reporter();

        // Call the first version (2 arguments)
        rp.reportStep("Login test passed", "PASS");

        // Call the second version (3 arguments)
        rp.reportStep("Login test failed", "FAIL", true);
   
	}

}
