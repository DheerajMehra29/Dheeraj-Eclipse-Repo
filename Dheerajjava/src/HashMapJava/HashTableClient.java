package HashMapJava;

public class HashTableClient {

	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub
HashTable<String,Integer> map = new HashTable<>(5);
map.put("USA", 200);
map.put("UK", 175);
map.put("India", 300);
map.put("China", 350);
map.display();

	}

}
