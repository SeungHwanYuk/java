package Java0401Generic;

class KeyValue<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class Generic2 {
    public static void main(String[] args) {
        KeyValue<String, Integer> kv1 = new KeyValue<String, Integer>();
        kv1.setKey("사과");
        kv1.setValue(1000);
        System.out.println(kv1.getKey() + " " + kv1.getValue());


        KeyValue<String, Void> kv3 = new KeyValue<>();  // 없는 값은 비워두는게 아닌, Void를 사용함
        kv3.setKey("키 값만 사용");
        System.out.println("Key: " +kv3.getKey());;

    }
}
