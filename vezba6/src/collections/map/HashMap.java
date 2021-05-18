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
                if (currentEntry.getHashCode() == key.hashCode() && currentEntry.getKey().equals(key)){
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

    public TValue get(TKey key){
        return getOrDefault(key, null);
    }

    public TValue getOrDefault(TKey key, TValue defaultValue){
        int targetBucket = hash(key);

        if(entries[targetBucket] != null){
            MapEntry<TKey, TValue> currentEntry = entries[targetBucket];

            while (currentEntry != null){
                if(currentEntry.getHashCode() == key.hashCode() && currentEntry.getKey().equals(key)){
                    return currentEntry.getValue();
                }
                currentEntry = currentEntry.getNext();
            }
        }

        return defaultValue;
    }

    public boolean containsKey(TKey key){
        int targetBucket = hash(key);

        if(entries[targetBucket] != null){
            MapEntry<TKey, TValue> currentEntry = entries[targetBucket];

            while (currentEntry != null){
                if(currentEntry.getHashCode() == key.hashCode() && currentEntry.getKey().equals(key)){
                    return true;
                }
                currentEntry = currentEntry.getNext();
            }
        }

        return false;
    }

    public boolean containsValue(TValue value){
        for (MapEntry<TKey, TValue> entry: this.entries) {
            if(entry != null){
                MapEntry<TKey, TValue> currentEntry = entry;

                while (currentEntry != null){
                    if(currentEntry.getValue().equals(value)){
                        return true;
                    }
                    currentEntry = currentEntry.getNext();
                }
            }
        }
        return false;
    }

    public void remove(TKey key){
        int targetBucket = hash(key);

        if (entries[targetBucket] != null){
            MapEntry<TKey, TValue> previousEntry = null;
            MapEntry<TKey, TValue> currentEntry = entries[targetBucket];

            boolean found = false;
            while (currentEntry.getNext() != null){
                if (currentEntry.getHashCode() == key.hashCode() && currentEntry.getKey().equals(key)){
                    found = true;
                    break;
                }

                previousEntry = currentEntry;
                currentEntry = currentEntry.getNext();
            }

            if(previousEntry == null){
                if (currentEntry.getHashCode() == key.hashCode() && currentEntry.getKey().equals(key)){
                    entries[targetBucket] = null;
                    mapSize--;
                }
            }else if(found){
                previousEntry.setNext(currentEntry.getNext());
                mapSize--;
            }
        }
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
