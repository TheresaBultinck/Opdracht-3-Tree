/**
 * This class represents a tree. 
 * @author Theresa
 *
 */
public class Tree {
	
	private TreeNode root; 
	
	public Tree(){
		root = new TreeNode(true);
	}
	
	/**
	 * Starts creating the tree with children
	 * @param s data
	 * @param depth max depth of the tree
	 */
	public void initialize(String s, int depth){
		char[] chars = s.toCharArray();
		root.add(chars, depth);
	}
	
	/**
	 * Prints tree
	 * @return string representation of the tree
	 */
	
	public String get(){
		return root.get("");
	}
}
