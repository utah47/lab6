package rmuti.lab6;



public class App2 {

	public static void main(String[] args) {
		
		Node e = new Node("e", null, null);
		Node f = new Node("f", null, null);
		
		Node c = new Node("c", null, null);
		Node b = new Node("b", e, f);
		
		Node root = new Node("a", b, c);
	
		TreeDraw drawTree = new TreeDraw(root);
		drawTree.binaryTreeDraw();
	}
	
}