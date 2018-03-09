package com.risingdevs.java.threads.concurrency.map;

import java.util.Iterator;

public class CustomHashMap<K, V> implements Iterable<CustomHashMap.Entry<K, V>> {

	static class Entry<K, V> {

		@Override
		public String toString() {
			return "Entry [k=" + k + ", v=" + v + "]";
		}

		public Entry(int hash, K k, V v) {
			this.hash = hash;
			this.k = k;
			this.v = v;
		}

		int hash;
		K k;
		V v;
		Entry<K, V> next;
	}
	
	int thresold = 0;
	int size = 0;
	int capacity = DEFAULT_INITIAL_CAPACITY;
	float loadFactor = DEFAULT_LOAD_FACTOR;
	Entry<K, V>[] table;
	/**
	 * The default initial capacity - MUST be a power of two.
	 */
	static final int DEFAULT_INITIAL_CAPACITY = 16;
	/**
	 * The load factor used when none specified in constructor.
	 */
	static final float DEFAULT_LOAD_FACTOR = 0.75f;

	public CustomHashMap() {
		table = new Entry[capacity];
		thresold = (int) (capacity * loadFactor);
	}

	public void put(K k, V v) {
		int hash = k.hashCode();
		int index = hash & capacity - 1;
		if (table[index] == null) {
			table[index] = new Entry(hash, k, v);
			return;
		}
		Entry<K, V> oldEntry = table[index];
		if (oldEntry.k.equals(k)) {
			oldEntry.v = v;
			return;
		}
		while (oldEntry.next != null) {
			oldEntry = oldEntry.next;
			if (oldEntry.k.equals(k)) {
				oldEntry.v = v;
				return;
			}
		}
		oldEntry.next = new Entry(hash, k, v);
		return;
	}

	public V get(K k) {
		int hash = k.hashCode();
		int index = hash & capacity - 1;
		if (table[index] == null) {
			return null;
		}
		Entry<K, V> oldEntry = table[index];
		if (oldEntry.k.equals(k)) {
			return oldEntry.v;
		}
		while (oldEntry.next != null) {
			oldEntry = oldEntry.next;
			if (oldEntry.k.equals(k)) {
				return oldEntry.v;
			}
		}
		return null;
	}

	public V remove(K k) {
		int hash = k.hashCode();
		int index = hash & capacity - 1;
		if (table[index] == null) {
			return null;
		}
		Entry<K, V> prev = null;
		Entry<K, V> entry = table[index];
		while (entry != null) {
			if (entry.k.equals(k)) {
				if (prev == null) {
					table[index] = entry.next;
					return entry.v;
				}
				prev.next = prev.next.next;
				return entry.v;
			}
			prev = entry;
			entry = entry.next;
		}
		return null;
	}

	public class MyIterator implements Iterator<CustomHashMap.Entry<K, V>> {

		private int itrI = 0;
		private Entry<K, V> entry;

		@Override
		public boolean hasNext() {
			if (itrI < capacity) {
				if (itrI == capacity - 1 && entry != null && entry.next != null) {
					return true;
				}
				int i = itrI;
				Entry<K, V> entry;
				while (i <= capacity - 1) {
					entry = table[i++];
					if (entry != null) {
						return true;
					}
				}
			}
			return false;
		}

		@Override
		public Entry<K, V> next() {
			while (true) {
				if (itrI == capacity) {
					throw new IllegalStateException("Already reached end");
				}
				if (entry != null && entry.next != null) {
					entry = entry.next;
					return entry;
				}
				entry = null;
				while (itrI <= capacity - 1) {
					entry = table[itrI++];
					if (entry != null) {
						return entry;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		CustomHashMap<Integer, Character> map = new CustomHashMap<>();
		map.put(1, 'a');
		map.put(2, 'a');
		map.put(3, 'a');
		Iterator<Entry<Integer, Character>> itr = map.iterator();
		while (itr.hasNext()) {
			Entry<Integer, Character> next = itr.next();
			System.out.println(next);
		}
	}

	@Override
	public Iterator<CustomHashMap.Entry<K, V>> iterator() {
		return new MyIterator();
	}
}
