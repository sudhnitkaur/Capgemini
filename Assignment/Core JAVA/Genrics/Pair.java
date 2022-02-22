package Genrics;


public class pair<K,V> {
	K key;
	V value;
	public pair(K key,V value) {
		this.key=key;
		this.value=value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
public static void main(String[] args) {
	//a)
	pair<String,String> a1=new pair<>("1","Hello");
	System.out.println(a1.getKey()+" "+a1.getValue());
	//b)
	pair<String,java.util.Date> a2=new pair<>("Today is",new java.util.Date());
	System.out.println(a2.getKey()+" "+a2.getValue());
	
	
}
}