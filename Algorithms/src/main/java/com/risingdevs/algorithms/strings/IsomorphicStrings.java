package com.risingdevs.algorithms.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 609756469
 *         Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 *         For example,"egg" and "add" are isomorphic, "foo" and "bar" are not
 */
public class IsomorphicStrings {

	public static void main(String[] args) {
		isIsomorphic("egg", "add");
		isIsomorphic("foo", "bar");
	}

	static boolean isIsomorphic(String s1, String s2) {
		if (s1 == null || s1.isEmpty() || s2 == null || s2.isEmpty()) {
			System.out.println("S1 or s2 is empty");
			return false;
		}
		if (s1.length() != s2.length()) {
			System.out.println("S1 and s2 length is not same");
			return false;
		}
		Map<Character, Character> map = new HashMap<Character, Character>();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			if (map.containsKey(c1[i])) {
				if (map.get(c1[i]) != c2[i]) {
					System.out.println("S1 and s2 are not Isomorphic");
					return false;
				}
			}
			else {
				map.put(c1[i], c2[i]);
			}
		}
		System.out.println("S1 and s2 are Isomorphic");
		return true;
	}
}
