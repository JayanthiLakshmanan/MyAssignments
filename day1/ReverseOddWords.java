package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		String[] words=test.split(" ");
		  for(int i=0;i<words.length;i++) {
			  if(i%2!=0) {
				  words[i]=reverseWord(words[i]);
			  }
			
		}
		  String result=String.join(" ", words);
		  System.out.println(result);

	}

	private static String reverseWord(String word) {
		char[] chars=word.toCharArray();
		int left=0,right=chars.length-1;
		  while(left<right) {
			  char temp=chars[left];
			  chars[left]=chars[right];
			  chars[right]=temp;
			  left++;
			  right--;
		  }
		return new String(chars);
	}

}
