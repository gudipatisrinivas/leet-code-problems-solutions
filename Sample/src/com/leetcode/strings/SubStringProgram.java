package com.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a string str, find the length of the longest substring without repeating characters. 
For “ABDEFGABEF”, the longest substring are “BDEFGA” and “DEFGAB”, with length 6.
For “BBBB” the longest substring is “B”, with length 1.
 * 
 * 
 * 
 */

public class SubStringProgram {

	private static String longestSubString(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		Map<String, Integer> result = new HashMap<>();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					String subStr = str.substring(i, j - 1);
					result.put(subStr, subStr.length());
				}
			}
		}
		result.entrySet().stream().sorted(Map.Entry.comparingByValue());
		return result.entrySet().iterator().next().getKey();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestSubString("srinivas"));
	}
}
