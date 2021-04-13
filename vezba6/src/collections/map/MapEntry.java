package collections.map;

public class MapEntry<TKey, TValue> {
    private TKey key;
    private TValue value;
    private int hashCode;
    private MapEntry<TKey, TValue> next;

    public MapEntry(TKey key, TValue value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }

    public MapEntry(TKey key, TValue value, int hashCode, MapEntry<TKey, TValue> next) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
        this.next = next;
    }

    public TKey getKey() {
        return key;
    }

    public void setKey(TKey key) {
        this.key = key;
    }

    public TValue getValue() {
        return value;
    }

    public void setValue(TValue value) {
        this.value = value;
    }

    public int getHashCode() {
        return hashCode;
    }

    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }

    public MapEntry<TKey, TValue> getNext() {
        return next;
    }

    public void setNext(MapEntry<TKey, TValue> next) {
        this.next = next;
    }
}
