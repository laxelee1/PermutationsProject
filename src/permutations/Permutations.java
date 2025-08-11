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
		String curWord = "";
		dfs(used, curWord);
		System.out.println("words = " + words);
	}

	public String toString() {
		return "initWord is " + this.initWord;
	}

	private void dfs(boolean[] used, String curWord) {
		// recursive helper function to create the permutations

		// System.out.println();
		// for (int i = 0; i < used.length; i++) {
		// 	System.out.printf("used[%d] = %b | ", i, used[i]);
		// }
		// System.out.println();

		// add a check to see if any of used is true. this will eventually change to a check for all of used is true
		int total = 0;
		for (int i = 0; i < used.length; i++) {
			if (used[i]) {
				total++;
			}
		}
		if (total == n) {
			words.add(curWord);
			return;
		}

		for (int i = 0; i < used.length; i++) {
			if (used[i] == true) {
				continue;
			}
			used[i] = true;
			String nextWord = curWord + initWord.charAt(i); // I'm not sure about this line yet
			dfs(used, nextWord);
			used[i] = false;
		}
	}
}
