package _05_class._08_generic;

public class GenericPrac<K, V>{
  private K key;
  private V value;

  public GenericPrac(K key, V value){
    this.key = key;
    this.value = value;
  }

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

  public static void main(String[] args) {
    GenericPrac<String, Integer> pair1 = new GenericPrac<>("One", 1);
    System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());
    GenericPrac<Integer, String> pair2 = new GenericPrac<>(2, "Two");
    System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());

  }
}


