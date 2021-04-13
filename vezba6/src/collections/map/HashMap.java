package collections.map;

import javax.swing.text.html.parser.Entity;

public class HashMap<TKey, TValue> {
    private int mapSize;
    private MapEntry<TKey, TValue>[] entries;

    public HashMap(){
        entries = new MapEntry[17];
    }

    public HashMap(int capacity){
        entries = new MapEntry[capacity];
    }

    public void put(TKey key, TValue value){
        int targetBucket = hash(key);

        if(entries[targetBucket] == null){
            entries[targetBucket] = new MapEntry<>(key, value, key.hashCode());
        }
        else{
            MapEntry<TKey, TValue> currentEntry = entries[targetBucket];

            while (currentEntry.getNext() != null){
                if (currentEntry.hashCode() == key.hashCode() && currentEntry.getKey().equals(key)){
                    currentEntry.setValue(value);
                    return;
                }
                currentEntry = currentEntry.getNext();
            }

            if (currentEntry.hashCode() == key.hashCode() && currentEntry.getKey().equals(key)){
                currentEntry.setValue(value);
            }
            else {
                MapEntry<TKey, TValue> newEntry = new MapEntry<>(key, value, key.hashCode());
                currentEntry.setNext(newEntry);
            }
        }
        mapSize++;
    }

    public int hash(TKey key){
        int hashCode = key.hashCode();
        int targetBucket = Math.abs(hashCode % entries.length);

        return targetBucket;
    }


    public int size(){
        return mapSize;
    }
}
