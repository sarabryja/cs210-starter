package structure;

import model.*;

import java.util.Map;
import java.util.Iterator;

public class VolatileHashMap<K, V>
	implements HashMap<K, V>
{
	/*
	 * TODO: For Module 6, delete the capsule field
	 * and implement the requirements.
	 * 
	 * Until then, this is a usable hash map.
	 */
	@Deprecated
	private Map<K, V> capsule;
	
	public VolatileHashMap() {
		capsule = new java.util.HashMap<>();
	}
	
	public VolatileHashMap(Map<? extends K, ? extends V> copy) {
		capsule = new java.util.HashMap<>(copy);
	}

	@Override
	public void clear() {
		capsule.clear();
	}

	@Override
	public int size() {
		return capsule.size();
	}

	@Override
	public boolean isEmpty() {
		return capsule.isEmpty();
	}

	@Override
	public double loadFactor() {
		throw new UnsupportedOperationException();
	}

	@Override
	public V put(K key, V value) {
		return capsule.put(key, value);
	}

	@Override
	public V get(Object key) {
		return capsule.get(key);
	}

	@Override
	public V remove(Object key) {
		return capsule.remove(key);
	}

	@Override
	public boolean containsKey(Object key) {
		return capsule.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return capsule.containsValue(value);
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		capsule.putAll(m);
	}

	@Override
	public String toString() {
		return capsule.toString();
	}

	@Override
	public boolean equals(Object o) {
		return capsule.equals(o);
	}

	@Override
	public int hashCode() {
		return capsule.hashCode();
	}

	@Override
	public Iterator<Map.Entry<K, V>> iterator() {
		return capsule.entrySet().iterator();
	}
}