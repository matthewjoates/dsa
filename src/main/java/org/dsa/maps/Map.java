package org.dsa.maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Terms
// Load Factor: The amount of data points vs the amount of storage
// Key: a value that is hashable and is used to look up data. The hash must be consistent.
// Value: a value that is associated with a key.
// Collision: When 2 keys map to the same cell.

public class Map<K, V> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final double LOAD_FACTOR_THRESHOLD = 0.75d;
    private int size;
    private List<Entry<K, V>>[] buckets;

    public Map() {
        buckets = new ArrayList[DEFAULT_CAPACITY];
        size = 0;
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    public void put(K key, V value){
        if(getCurrentLoadFactor() > LOAD_FACTOR_THRESHOLD){
            rehash();
        }
        int index = hash(key);
        buckets[index].add(new Entry<>(key, value));
        size++;
    }

    public V get(K key){
        int index = hash(key);
        List<Entry<K, V>> bucket = buckets[index];
        for(Entry<K, V> entry : bucket){
            if(key.equals(entry.key)){
                return entry.value;
            }
        }
        return null;
    }

    public void remove(K key){
        int index = hash(key);
        List<Entry<K, V>> bucket = buckets[index];
        Iterator<Entry<K, V>> iterator = bucket.iterator();
        while (iterator.hasNext()) {
            Entry<K, V> entry = iterator.next();
            if(entry.key.equals(key)) {
                iterator.remove();;
                size--;
                return;
            }
        }
    }

    private int hash(K key){
        return hash(key, DEFAULT_CAPACITY);
    }

    private void rehash() {
        int newCapacity = buckets.length * 2;
        List<Entry<K, V>>[] newBuckets = new ArrayList[newCapacity];
        for (List<Entry<K, V>> bucket : this.buckets){
            for (Entry<K, V> entry : bucket){
                int newIndex = hash(entry.key, newCapacity);
                newBuckets[newIndex].add(entry);
            }
        }
        this.buckets = newBuckets;
        this.size = newCapacity;
    }

    private int hash(K key, int newCapacity) {
        return Math.abs(key.hashCode() % newCapacity);
    }

    private double getCurrentLoadFactor(){
        return (double) (this.size + 1) / this.buckets.length;
    }

    private int size() {
        return this.size;
    }
}

class Entry<K, V> {
    K key;
    V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

