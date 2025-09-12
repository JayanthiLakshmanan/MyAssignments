package week4.day2;

import java.util.Set;
import java.util.TreeSet;

public class UniqueName {
	public static void main(String[] args) {
		
		String name="google";
		char[] charArray=name.toCharArray();
		//create set
		Set<Character> unique=new TreeSet<Character>();
		for(int i=0;i<charArray.length;i++) {
			unique.add(charArray[i]);
		}
			System.out.println("unique are:"+unique);
    }


   }
