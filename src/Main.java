import java.util.Scanner;

public class Main {
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		
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
			
		} else {
			depth = data.length();
		}
		
		Tree newTree = new Tree();
		newTree.initialize(data, depth);
		System.out.println(newTree.get());
		
	}
}
