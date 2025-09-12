package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findIntersection {

	public static void main(String[] args) {
		//declare arrays
		Integer[] array1= {3,2,11,4,6,7};
		Integer[] array2= {1,2,8,4,9,7};
		//convert arrays to list
		List<Integer>list=Arrays.asList(array1);
		List<Integer>list1=Arrays.asList(array2);
		//create a new List to store intersection
		List<Integer>intersection=new ArrayList<>();
		//compare elements
		for(Integer num:list) {
			if(list1.contains(num)) {
				intersection.add(num);
				
			}
		}
		//print intersection
		System.out.println(intersection);
		
	}

}
