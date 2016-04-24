/**
 * Runs the program for calculating permutations and variations
 * @author Theresa Bultinck
 */
import java.util.Scanner;

public class Main {
	
	/**
	 * @param args the command line arguments
	 */
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		Tree newTree = new Tree();
		
		System.out.println("Permutation or variation? Enter p or v");
		String pOrV = scanner.nextLine();
		pOrV = pOrV.toLowerCase();
		if (!pOrV.equals("v") && !pOrV.equals("p")){
			System.out.println("Wrong answer");
			System.exit(5);
		}
		
		System.out.print("Data:");
		String data = scanner.nextLine();
		if (data.equals("")){
			System.out.println("Data shouldn't be empty");
			System.exit(5);
		}
		
		int depth = 0; 
		if(pOrV.equals("v")){
			System.out.print("Depth:");
			
			try{
				depth = scanner.nextInt();
			} catch (Exception E) {
				System.out.println("Depth should be an integer");
				System.exit(5);
			}
			newTree.variation(data, depth);
		} else {
			 newTree.permutation(data);
		}
		
		System.out.println(newTree.get());
		
	}
}
