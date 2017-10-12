import static org.junit.Assert.*;

import org.junit.Test;

public class LowestCommonAncestorTEST {
	
	
	@Test
	public void testForEmptyTree(){
		LowestCommonAncestor treeEmpty = new LowestCommonAncestor();
		assertNull("LCA(Empty)",treeEmpty.findLCA(0, 0));
	}
	
	@Test
	public void testForTreeSize7(){
		LowestCommonAncestor treeSize7 = new LowestCommonAncestor();
		treeSize7.root = new Node(1);
		treeSize7.root.left = new Node(2);
		treeSize7.root.right = new Node(3);
		treeSize7.root.left.left = new Node(4);
		treeSize7.root.left.right = new Node(5);
		treeSize7.root.right.left = new Node(6);
		treeSize7.root.right.right = new Node(7);
        
        assertEquals("LCA(4,5)", 2,treeSize7.findLCA(4, 5).data);
        assertEquals("LCA(4,6)", 1,treeSize7.findLCA(4, 6).data);
        assertEquals("LCA(3,4)", 1,treeSize7.findLCA(3, 4).data);
        assertEquals("LCA(6,7)", 3,treeSize7.findLCA(6, 7).data);
        assertEquals("LCA(5,6)", 1,treeSize7.findLCA(5, 6).data);
	}
	
	@Test
	public void testForTreeSize15(){
		LowestCommonAncestor treeSize15 = new LowestCommonAncestor();
		treeSize15.root = new Node(1);
		treeSize15.root.left = new Node(2);
		treeSize15.root.right = new Node(3);
		treeSize15.root.left.left = new Node(4);
		treeSize15.root.left.right = new Node(5);
		treeSize15.root.right.left = new Node(6);
		treeSize15.root.right.right = new Node(7);
		treeSize15.root.left.left.left = new Node(8);
		treeSize15.root.left.left.right = new Node(9);
		treeSize15.root.left.right.left = new Node(10);
		treeSize15.root.left.right.right = new Node(11);
		treeSize15.root.right.left.left = new Node(12);
		treeSize15.root.right.left.right = new Node(13);
		treeSize15.root.right.right.left = new Node(14);
		treeSize15.root.right.right.right = new Node(15);
		
		assertEquals("LCA(14,15)", 7,treeSize15.findLCA(14, 15).data);
        assertEquals("LCA(8,15)", 1,treeSize15.findLCA(8, 15).data);
        assertEquals("LCA(8,9)", 4,treeSize15.findLCA(8, 9).data);
        assertEquals("LCA(9,13)", 1,treeSize15.findLCA(9, 13).data);
        assertEquals("LCA(10,11)", 5,treeSize15.findLCA(10, 11).data);
        
	}
	
	@Test
	public void testForTreeSize1(){
		LowestCommonAncestor treeSize1 = new LowestCommonAncestor();
		treeSize1.root = new Node(1);
		assertNull("LCA(1,0)",treeSize1.findLCA(1, 0));
	
	
	}

	@Test
	public void testForNonExitingNodes(){
		LowestCommonAncestor treeNonExistentNode = new LowestCommonAncestor();
		treeNonExistentNode.root = new Node(4);
		treeNonExistentNode.root.left = new Node(8);
		treeNonExistentNode.root.right = new Node(9);
		treeNonExistentNode.root.left.left = new Node(12);
		treeNonExistentNode.root.left.right = new Node(13);
		treeNonExistentNode.root.right.left = new Node(17);
        treeNonExistentNode.root.right.right = new Node(21);
        
        assertEquals("LCA(12,13)",8,treeNonExistentNode.findLCA(12, 13).data);
        assertEquals("LCA(17,21)",9,treeNonExistentNode.findLCA(17, 21).data);
        assertEquals("LCA(13,21)",4,treeNonExistentNode.findLCA(13, 21).data);
        
        assertNull("LCA(13,44)",treeNonExistentNode.findLCA(13, 44));
        assertNull("LCA(6,18)",treeNonExistentNode.findLCA(6, 18));
        assertNull("LCA(11,23)",treeNonExistentNode.findLCA(11, 23));

	}
	
	@Test
	public void testWhenOneNodeIsAncestorOfOther(){
		LowestCommonAncestor treeAncestorNode = new LowestCommonAncestor();
		treeAncestorNode.root = new Node(11);
		treeAncestorNode.root.left = new Node(21);
		treeAncestorNode.root.right = new Node(5);
		treeAncestorNode.root.left.left = new Node(7);
		treeAncestorNode.root.left.right = new Node(8);
		treeAncestorNode.root.right.left = new Node(9);
        treeAncestorNode.root.right.right = new Node(33);
		
        assertEquals("LCA(7,8)",21,treeAncestorNode.findLCA(7, 8).data);
         
        //Test when one is the ancestor
        assertEquals("LCA(7,21)", 21,treeAncestorNode.findLCA(7, 21).data);
        assertEquals("LCA(5,9)", 5,treeAncestorNode.findLCA(5, 9).data);
        assertEquals("LCA(11,21)", 11,treeAncestorNode.findLCA(11, 21).data);
        
        

	}
	
	@Test
	public void testForALlSameNode(){
		LowestCommonAncestor sameNode = new LowestCommonAncestor();
		sameNode.root = new Node(3);
		sameNode.root.left = new Node(3);
		sameNode.root.right = new Node(3);
		sameNode.root.left.left = new Node(3);
		sameNode.root.left.right = new Node(3);
		sameNode.root.right.left = new Node(3);
		sameNode.root.right.right = new Node(3);
		
		assertEquals("LCA(3,3)",3,sameNode.findLCA(3, 3).data);
		
	}
	
	
	
	
	
	
	
	
	
}
