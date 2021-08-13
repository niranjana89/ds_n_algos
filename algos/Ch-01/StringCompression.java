package com.algos.arrays;

public class StringRotation {

	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		//check one is rotation of another
		String s3 = s1+s1;
		System.out.println(isSubstring(s3, s2));
	}

	private static boolean isSubstring(String s3, String s2) {
		if(s3.length() != 2*s2.length()) {
			return false;
		}
		if(s3.indexOf(s2) > 0) return true;
		return false;
	}

}
