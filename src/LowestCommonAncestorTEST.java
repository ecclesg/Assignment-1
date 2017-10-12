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
	public void testForTreeSize7(){
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
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(11);
		tree.root.right.left.left = new Node(12);
		tree.root.right.left.right = new Node(13);
		tree.root.right.right.left = new Node(14);
		tree.root.right.right.right = new Node(15);
		
		assertEquals("LCA(14,15)", 7,tree.findLCA(14, 15).data);
        assertEquals("LCA(8,15)", 1,tree.findLCA(8, 15).data);
        assertEquals("LCA(8,9)", 4,tree.findLCA(8, 9).data);
        assertEquals("LCA(3,14)", 3,tree.findLCA(3, 14).data);
        assertEquals("LCA(9,11)", 2,tree.findLCA(9, 11).data);
        assertEquals("LCA(9,13)", 1,tree.findLCA(9, 13).data);
        assertEquals("LCA(10,11)", 5,tree.findLCA(10, 11).data);
        
	}
	
	@Test
	public void testForTreeSize1(){
		LowestCommonAncestor tree = new LowestCommonAncestor();
		tree.root = new Node(1);
		assertNull("LCA(1,0)",tree.findLCA(1, 0));
	
	
	}

	@Test
	public void testForNonExitingNodes(){
		LowestCommonAncestor tree = new LowestCommonAncestor();
		tree.root = new Node(4);
        tree.root.left = new Node(8);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(12);
        tree.root.left.right = new Node(13);
        tree.root.right.left = new Node(17);
        tree.root.right.right = new Node(21);
        
        assertEquals("LCA(12,13)",8,tree.findLCA(12, 13).data);
        assertEquals("LCA(17,21)",9,tree.findLCA(17, 21).data);
        assertEquals("LCA(13,21)",4,tree.findLCA(13, 21).data);
        
        assertNull("LCA(13,44)",tree.findLCA(13, 44));
        
		
		
	}
	
	
	
	
	
	
}
