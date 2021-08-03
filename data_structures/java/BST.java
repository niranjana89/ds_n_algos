public class BST {
	
	class Node {
		int key;
		Node left, right;
		
		public Node(int item) {
			this.key = item;
			this.left = null;
			this.right = null;
		}
	}
	Node root;
	
	public BST() {
		root = null;
	}
	
	public void insert(int key) {
		root = insertNode(root, key);
	}

	public Node insertNode(Node rootNode, int key) {
		if(rootNode == null) {
			rootNode = new Node(key);
			return rootNode;
		}
		if(key <= rootNode.key) {
			rootNode.left = insertNode(rootNode.left, key);
		} else if( key > rootNode.key) {
			rootNode.right = insertNode(rootNode.right, key); 
		}
		return rootNode;
	}
	
	public void inOrder() {
		inOrderRec(root);
	}
	
	public void inOrderRec(Node rootNode) {
		if(rootNode != null) {
			inOrderRec(rootNode.left);
			System.out.println(rootNode.key);
			inOrderRec(rootNode.right);
		}
	}
	
	// Driver code
	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(8);
		tree.insert(2);
		tree.insert(10);
		tree.insert(7);
		tree.insert(1);
		tree.insert(3);
		
		tree.inOrder();
	}

}
