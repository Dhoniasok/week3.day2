package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArray {
	public static void main(String[] args) {
		int[] arr = {11,12,14,15,16,17,14,18,19,20,11,12};
		List<Integer> learner =new ArrayList<Integer>();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				if(arr[i]==arr[j+1])
					learner.add(arr[i]);
			}	
		}
		System.out.println(learner);
	}

}
