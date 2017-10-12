class Node
{
    int data;
    Node left, right;
 
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 
public class LowestCommonAncestor
{
    //Root of the Binary Tree
    Node root;
    static boolean found1 = false, found2 = false;
    
 
    Node findLCA(int n1, int n2)
    {
    	found1 = false;
        found2 = false;
 
        Node lca = findLCA(root, n1, n2);
 
        // Return LCA only if both n1 and n2 are present in tree
        if (found1 && found2)
            return lca;
 
        // Else return NULL
        return null;
    }
 
    // This function returns pointer to LCA of two given
    // values n1 and n2.
    // found1 is set as true by this function if n1 is found
    // found2 is set as true by this function if n2 is found
    private Node findLCA(Node node, int n1, int n2)
    {
    	// Base case
        if (node == null)
            return null;
 
        // If either n1 or n2 matches with root's key, report the presence
        // by setting found1 or found2 as true and return root (Note that if a key
        // is ancestor of other, then the ancestor key becomes LCA)
        if (node.data == n1)
        {
        	found1 = true;
            return node;
        }
        if (node.data == n2)
        {
        	found2 = true;
            return node;
        }
 
        // Look for keys in left and right subtrees
        Node left_lca = findLCA(node.left, n1, n2);
        Node right_lca = findLCA(node.right, n1, n2);
 
        // If both of the above calls return Non-NULL, then one key
        // is present in once subtree and other is present in other,
        // So this node is the LCA
        if (left_lca != null && right_lca != null)
            return node;
 
        // Otherwise check if left subtree or right subtree is LCA
        return (left_lca != null) ? left_lca : right_lca;
    }
 
}

//Class sourced from http://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/