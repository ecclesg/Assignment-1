import static org.junit.Assert.*;

import org.junit.Test;

public class LowestCommonAncestorTEST {
	LowestCommonAncestor tree = new LowestCommonAncestor();
	
	@Test
	public void testForEmptyTree(){
		LowestCommonAncestor tree = new LowestCommonAncestor();
		assertNull("LCA(Empty)",tree.findLCA(0, 0));
	}
	
	@Test
	public void testForTreeSize15(){
		LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        assertEquals("LCA(4,5)", 2,tree.findLCA(4, 5).data);
        assertEquals("LCA(4,6)", 1,tree.findLCA(4, 6).data);
        assertEquals("LCA(3,4)", 1,tree.findLCA(3, 4).data);
        assertEquals("LCA(2,4)", 2,tree.findLCA(2, 4).data);
        assertEquals("LCA(6,7)", 3,tree.findLCA(6, 7).data);
        assertEquals("LCA(5,6)", 1,tree.findLCA(5, 6).data);
	}
	
	
	
	
	
	
}
