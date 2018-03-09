package com.risingdevs.java.collections.set.treeset;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class MapValueBasedSorting {

	public static void main(String[] args) {
//		String[] strs = "hemanth kanahaiya hemanth kanahaiya sanjeev neeraj neeraj neeraj".split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("Ashok", 5);
		map.put("kishore", 20);
		map.put("kan", 10);
		map.put("Asha", 10);

		TreeMap<String,Integer> tmap = new TreeMap<String,Integer>(new WordComparator(map));
		tmap.putAll(map);
		tmap.forEach((k,v) -> System.out.println("key: "+k+" value:"+v));

	}
}

class WordComparator implements Comparator<String> {
	HashMap<String,Integer> map;
	public WordComparator(HashMap<String,Integer> map) {
		this.map=map;
	}
	
	@Override
	public int compare(String s1, String s2) {
		Integer i1=map.get(s1);
		Integer i2=map.get(s2);
		
		int diff =i2 - i1;
		if (diff == 0) {
			return s1.compareTo(s2);
		}
		return diff;
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
