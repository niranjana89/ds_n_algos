package com.algos;
/**
 * Check whether a string's permutation is Palindrome or not
 * @author niranjana
 *
 */
public class CheckPermutationPalindrome {

	public static void main(String[] args) {
		System.out.println(checkPalindrome("Tact Coa"));
	}
	
	private static boolean checkPalindrome(String input) {
		// size-26: we converted the chars to lowercase
		int[] counts = new int[26];
		int countOdd = 0;
		for(char c: input.toLowerCase().toCharArray()) {
			if(c != ' ') {
				counts[c] = counts[c] + 1;
				if(counts[c]%2 == 1) {
					countOdd++;
				}else {
					countOdd--;
				}
			}
		}
		return countOdd<2;
	}

}
