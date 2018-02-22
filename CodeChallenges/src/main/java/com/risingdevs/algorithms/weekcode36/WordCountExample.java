package com.risingdevs.algorithms.weekcode36;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class WordCountExample {

	public static void main(String[] args) {
		String[] strs = { "ashwin", "ashwin", "ashwin", "hemanth", "hemanth", "hemanth", "kanahaiya", "kanahaiya", "sanjeev", "sanjeev",
				"sanjeev", "sanjeev" };
		TreeMap<String, Integer> set = new TreeMap<>();
		// entrySet.
	}

	static class Word implements Comparable<Word> {

		String word;

		@Override
		public int hashCode() {
			return word.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (getClass() != obj.getClass()) return false;
			Word other = (Word) obj;
			if (word == null) {
				if (other.word != null) return false;
			}
			else if (!word.equals(other.word)) return false;
			return true;
		}

		volatile int count = 1;

		@Override
		public int compareTo(Word o) {
			return word.compareTo(o.word);
		}
	}

	static class WordComparator implements Comparator<Map.Entry<String, Integer>> {

		@Override
		public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
			if (e1.getValue() == e2.getValue()) {
				return e1.getKey().compareTo(e2.getKey());
			}
			return e1.getValue() - e2.getValue();
		}
		/*
		 * @Override
		 */
	}
}
