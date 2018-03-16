package rmuti.lab6;


public class App1 {

	public static void main(String[] args) {
		
		Node c = new Node("c", null, null);
		Node b = new Node("b", null, null);
		
		Node root = new Node("a", b, c);
		
		TreeDraw drawTree = new TreeDraw(root);
		drawTree.binaryTreeDraw();
	}
}