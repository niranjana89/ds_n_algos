package com.algos;
/**
 * Check whether one String is permutation of the other String
 * @author niranjana
 *
 */
public class CheckPermutation {
	/**
	 * Given: 2 Strings
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * method 1: sort and compare
		 */
		/**
		 * method 2: use count array of 256(total alpha chars) and increment the 
		 * count by 1 for the chars in string1 and while looping string2 reduce the 
		 * count and check if the count is less than 0(return false here); 
		 * else return true
		 */
		
		String a = "Hello";
		String b = "lolee";
		System.out.println(isPermutation(a, b));
	}
	
	private static boolean isPermutation(String a, String b) {
		if(a == null || b == null || a.length() != b.length()) {
			return false;
		}
		char[] aArr = a.toLowerCase().toCharArray();
		char[] bArr = b.toLowerCase().toCharArray(); 
		int[] counts = new int[256];
		
		for(char c: aArr) {
			counts[c] = counts[c]+1;
		}
		
		for(char c: bArr) {
			counts[c] = counts[c] - 1;
			if(counts[c] < 0) {
				return false;
			}
		}
		return true;
	}

}
