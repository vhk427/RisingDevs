	package com.risingdevs.java.collections.set.treeset.app2;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapValueBasedSorting extends TreeSet<Map.Entry<String, Integer>>{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6776947154614099999L;
	
	static TreeMap<String, Integer> treeMap = null;
	
	public boolean update(Map.Entry<String, Integer> update) {
		
		return false;
		
	}

	public static void main(String[] args) {
		String[] strs = "hemanth kanahaiya hemanth kanahaiya sanjeev neeraj neeraj neeraj".split(" ");
		TreeSet<Map.Entry<String, Integer>> set = new TreeSet<>(new Comparator<Map.Entry<String, Integer>>()
		  {
		    @Override
		    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
		    {
		      int valueComparison = o2.getValue().compareTo(o1.getValue());
		      return valueComparison == 0 ? o1.getKey().compareTo(o2.getKey()) : valueComparison;
		    }
		  });
		
		for (String s : strs) {
			if(!set.add(new AbstractMap.SimpleEntry<>(s, 1))) {
//				set.set
			}
		}
		System.out.println(set);
		
	}

	public int compare(String s1, String s2) {
/*		Integer i1 = treeMap.get(s1);
		Integer i2 = treeMap.get(s2);
		if(i1 == null || i2 == null) {
			return s1.compareTo(s2);
		}
		int diff = i2 - i1;
		if (diff == 0) {
			return s1.compareTo(s2);
		}
		return diff;*/
		return s1.compareTo(s2);
	}
}

class Word implements Comparable<Word> {

	String word;
	volatile int count = 0;

	public Word(String word) {
		this.word = word;
	}

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

	@Override
	public int compareTo(Word arg0) {
		return this.word.compareTo(arg0.word);
	}
}
