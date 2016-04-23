
import java.io.Console;
import java.util.ArrayList;

public class TreeNode{
	
	private ArrayList<TreeNode> children; 
	private TreeNode parent;
	private char data;
	private boolean isRoot; 
	
	public TreeNode(boolean isRoot){
		children = new ArrayList<TreeNode>();
		this.isRoot = isRoot; 
	}
	
	/**
	 * Adds children to the tree
	 * @param arrayChar data to compute permutations of variations
	 * @param allowedDepth max depth for variations
	 */
	public void add(char[] arrayChar, int allowedDepth){
		for (int i = 0; i < arrayChar.length; i++){
			TreeNode childNode = new TreeNode(false);
			childNode.setChar(arrayChar[i]);
			children.add(childNode);
			//System.out.println("adding char " + arrayChar[i] + " to tree");
			char[] rest = this.computeRest(arrayChar, i);
			if (allowedDepth-1 != 0){
				childNode.add(rest,allowedDepth-1);	
			}
		}
	}
	
	private void setChar (char c){
		this.data = c; 
	}
	
	/**
	 * Copies the arrayChar but removes char at a specified index
	 * @param arrayChar 
	 * @param index
	 * @return new char[]
	 */
	private char[] computeRest(char[] arrayChar, int index){
		char [] result = new char[arrayChar.length - 1];
		int positie = 0;
		for (int i = 0; i < arrayChar.length; i++){
			if (i != index){
				result [positie] = arrayChar[i];
				positie ++;	
			}
		}
		return result;
	}
	
	/**
	 * Used for recursive tree printing
	 * @param prefix
	 * @return itself and children
	 */
	public String get(String prefix){
		String characters = "";
					
		if (this.children.size() == 0 && !isRoot){
			characters += prefix;
			characters += String.valueOf(this.data);
			characters += "\n";
		}
		
		else {
			for(TreeNode child : this.children){
				// and append your child's print
				if (!isRoot)
					characters += child.get(prefix + this.data);
				else 
					characters += child.get(prefix);
			}
		}
		return characters;
	}
}
