public class HashTable {
	class ListNode {
		String key;
		String value;
		ListNode nxt;
	}

	private ListNode[] tbl;

	private int count;

	public HashTable() {
		tbl = new ListNode[64];
	}

	public HashTable(int initSize) {
		if (initSize <= 0)
			throw new IllegalArgumentException("initSize is invalid");
		tbl = new ListNode[initSize];
	}

	/**
	 * Add (k,v) to hashtable
	 * 
	 * @param key
	 * @param value
	 */
	public void put(String key, String value) {
		// compute index using key
		int bucket = hash(key);

		// get if the tbl index
		ListNode headNode = tbl[bucket];

		// check if the index has listNode or not and check if the key already present
		ListNode currentNode = headNode;
		while (currentNode != null) {
			if (currentNode.key.equals(key)) {
				currentNode.value = value;
				count++;
				return;
			}
			currentNode = currentNode.nxt;
		}
		ListNode node = new ListNode();
		node.key = key;
		node.value = value;
		node.nxt = headNode;
		tbl[bucket] = node;
		count++;
		System.out.println(count + ": " + node.key);
	}

	private int hash(Object key) {
		return (Math.abs(key.hashCode())) % tbl.length;
	}

	/**
	 * Return value if the key is found; else return null;
	 * 
	 * @param key
	 * @return
	 */
	public String get(String key) {
		int bucket = hash(key);
		ListNode headNode = tbl[bucket];
		while (headNode != null) {
			if (headNode.key.equals(key)) {
				return headNode.value;
			}
			headNode = headNode.nxt;
		}
		// log: key cannot be found
		return null;
	}

	/**
	 * Remove key if present
	 * 
	 * @param key
	 */
	public void remove(String key) {
		int bucket = hash(key);
		ListNode headNode = tbl[bucket];
		ListNode prevNode = null;
		while (headNode != null) {
			if (headNode.key.equals(key)) {
				if (prevNode != null) {
					prevNode.nxt = headNode.nxt;
				} else {
					prevNode = headNode.nxt;
					tbl[bucket] = prevNode;
				}
				headNode = null;
				count--;
				return;
			}
			prevNode = headNode;
			headNode = headNode.nxt;
		}
	}

	/**
	 * returns the count of (k,v) pairs
	 * 
	 */
	public int count() {
		return count;
	}

	// Driver class to test HashTable - get, add, remove, size, getAllItems
	public static void main(String[] args) {
		HashTable tbl = new HashTable();
		tbl.put("hi", "hi");
		tbl.put("ih", "ih");
		tbl.put("hello", "hello");
		System.out.println(tbl.get("hello"));
		System.out.println(tbl.get("ih"));
		System.out.println(tbl.count());
		tbl.remove("ih");
		System.out.println(tbl.count());
		System.out.println(tbl.get("ih"));
		tbl.remove("hello");
		System.out.println(tbl.count());
		System.out.println(tbl.get("hello"));
	}

}
