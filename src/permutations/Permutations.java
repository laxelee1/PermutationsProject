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
		return "initWord is " + this.initWord;
	}

	private void dfs(boolean[] used) {
		// recursive helper function to create the permutations

		System.out.println();
		for (int i = 0; i < used.length; i++) {
			System.out.printf("used[%d] = %b | ", i, used[i]);
		}
		System.out.println();

		// add a check to see if any of used is true. this will eventually change to a check for all of used is true
		for (int i = 0; i < used.length; i++) {
			if (used[i]) {
				return;
			}
		}

		for (int i = 0; i < used.length; i++) {
			used[i] = true;
			dfs(used);
			used[i] = false;
		}
	}
}
