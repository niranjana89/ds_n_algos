package com.algos;

import com.ds.HashTable;

public class IsUniqueCharInStr {
	/**
	 * Brute force method - isUnique(String[] strArr)
	 * Using HashTable - isUniqueByHashTable(String[] a)
	 * Using bitVector - Not implemented
	 * Can you solve it in O(n log n) time ? How the solution look like ?
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "Helo";
		String[] strArr = input.toLowerCase().split("");
		System.out.println(isUnique(strArr));	
		System.out.println(isUniqueByHashTable(strArr));
	}
	
	/**
	 * Return false if any String  is duplicated; else true - Brute Force Method
	 * Time Complexity - O(n^2) 
	 * 
	 * @param strArr
	 * @return
	 */
	private static boolean isUnique(String[] strArr) {
		for( int i = 0; i < strArr.length-1; i++) {
			for(int j = i+1; j < strArr.length; j++) {
				if(strArr[i].equals(strArr[j])) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Return false if duplicate found; else true - Using HashTable 
	 * Time Complexity - O(n)
	 *
	 * @param a
	 * @return
	 */
	private static boolean isUniqueByHashTable(String[] a) {
		// Refer hashtable implementation in datastructure
		HashTable tbl = new HashTable(a.length);
		for(String str : a) {
			tbl.put(str, str);
		}
		if(tbl.count() != a.length) {
			return false;
		}
		return true;
	}

}
