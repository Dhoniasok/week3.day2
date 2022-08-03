package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data = {5,2,11,7,6,9};
		List<Integer> unique1 = new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {		
			unique1.add(data[i]);
		}
		Collections.sort(unique1);
		int a =unique1.size();
		System.out.println(unique1.get(a-2));
	}

}
