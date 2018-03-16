package rmuti.lab6;


public class App3 {

	public static void main(String[] args) {
		
		Node h = new Node("h",null,null);
		Node i = new Node("i",null,null);
		
		Node g = new Node("g",null,null);
		Node f1 = new Node ("f1",null,null);
		
		Node e = new Node("e",h,i);
		Node f = new Node("f",null,null);
		
		Node c = new Node("c",g,f1);
		Node b = new Node("b",e,f);
		
		Node root = new Node("a",b,c);
		
		TreeDraw drawTree = new TreeDraw(root);
		drawTree.binaryTreeDraw();
	}
	}