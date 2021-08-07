package com.algos;
/**
 * Replace all the spaces with "%20"
 * @author niranjana
 *
 */
public class URLify {

	public static void main(String[] args) {
		String s1 = "John Smith  ";
		System.out.println(urlify(s1,s1.length()));
	}
	
	private static String urlify(String s1, int len) {
		String[] s1Arr = s1.split("");
		StringBuilder sb = new StringBuilder();
		for(int i =0 ; i< s1Arr.length; i++) {
			if(s1Arr[i].equals(" ")) {
				s1Arr[i] = "%20";
			}
			sb.append(s1Arr[i]);
		}
		
		return sb.toString();
	}

}
