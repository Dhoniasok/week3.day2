package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindIntersection {
	public static void main(String[] args) {

		int[] nums1 = {3,2,11,4,6,7};
		int[] nums2 = {1,2,8,4,9,7};

		Set<Integer> unique1 = new HashSet<Integer>(); 
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i]==nums2[j]) {
					unique1.add(nums1[i]);	
				}
			}		
		}	
		System.out.println(unique1);

}
}
