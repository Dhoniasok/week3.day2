package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {
	public static void main(String[] args) {

		int[] nums = {2,4,6,5,6,3,2,5,6,2,4,-1};

		Map<Integer , Integer> arr = new TreeMap <Integer , Integer>();
		for (int i = 0; i < nums.length; i++) {
			arr.put(nums[i], arr.getOrDefault(nums[i], 0)+1);
		}	
		System.out.println(arr);
	}

}
