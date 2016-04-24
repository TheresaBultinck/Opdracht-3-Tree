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
	 * Starts creating the tree with children in the case of calculating permutations
	 * @param s data
	 */
	public void permutation(String s){
		char[] chars = s.toCharArray();
		root.permutation(chars);
	}
	
	/**
	 * Starts creating the tree with children in the case of calculating variation
	 * In the task this was combinations, but in fact the teacher was talking about variations
	 * @param s data
	 * @param max depth of the tree
	 */ 
	public void variation(String s, int depth){
		char[] chars = s.toCharArray();
		root.variation(chars, depth);
        }
	
	/**
	 * Prints tree
	 * @return string representation of the tree
	 */
	
	public String get(){
		return root.get("");
	}
}
