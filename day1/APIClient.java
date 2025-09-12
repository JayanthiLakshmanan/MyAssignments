package week4.day1;

public class APIClient {
	//overloaded method with one argument
	public void sendRequest(String endpoint) {
		System.out.println("Sending request to Endpoint:"+endpoint);
	}
//overloaded method with three arguments
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("Sending request to endpoint:"+endpoint);
		System.out.println("Request Body:"+requestBody);
		if(requestStatus) {
		 System.out.println("Request was successfull");
		}
		 else {
			 System.out.println("Request Failed");
		 }
	}
	
	public static void main(String[] args) {
		APIClient client=new APIClient();
		//call version 1
		client.sendRequest("https://api.example.com/getdata");
		System.out.println("-----------------------------------");
		//call version 2
		client.sendRequest("https://api.example.com/PostData","{id-101,name:John}",true);
		
	}
		
	}


