package permutations;

import java.util.Scanner;

public class PermutationsMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What word would you like to get the permutations for? ");
		String initWord = scanner.nextLine();
		Permutations permutations = new Permutations(initWord);
		System.out.println(permutations);
	}
}
