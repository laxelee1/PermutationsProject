package permutations;

import java.util.List;
import java.util.ArrayList;

public class Permutations {
	private String initWord;
	private List<String> words;
	private int n;

	public Permutations(String initWord) {
		this.n = initWord.length();
		this.initWord = initWord;
		this.words = new ArrayList<>();
		// added the word array list
		boolean[] used = new boolean[n];
		dfs(used);
	}

	public String toString() {
		return this.initWord;
	}

	private void dfs(boolean[] used) {
		// recursive helper function to create the permutations
		for(int i = 0; i < used.length; i++) {
			System.out.printf("index %d of used = %b%n", i, used[i]);
		}
	}
}
