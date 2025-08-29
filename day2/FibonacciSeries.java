package week2.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int first=0;
		int second=1;
		System.out.print("Fibonacci Series up to"+n+":");
		for(int i=0;i<=n;i++) {
			System.out.print(first+"");
		int next=first+second;
		first=second;
		second=next;
		}
	}
	
}
