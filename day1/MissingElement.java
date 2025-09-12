package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		//given array
		int[] array= {1,2,3,4,10,6,8};
		//convert to list and sort
		List<Integer>list=new ArrayList<>();
		for(int num:array) {
			list.add(num);
		}
		Collections.sort(list);
		System.out.println("sorted list:"+list);
		//check gaps
		for(int i=0;i<list.size()-1;i++) {
			int current=list.get(i);
			int next=list.get(i+1);
			//if there is a gap
			if(current+1!=next) {
				for(int j=current+1;j<next;j++) {
					System.out.println(j+"");
				}
			}
		}

	}

}
