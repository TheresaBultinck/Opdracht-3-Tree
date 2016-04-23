
public class Tree {
	
	private TreeNode root; 
	
	public Tree(){
		root = new TreeNode(true);
	}
	
	public void add(String s, int depth){
		char[] chars = s.toCharArray();
		root.add(chars, depth);
	}
	
	public String get(){
		return root.get("");
	}
}
