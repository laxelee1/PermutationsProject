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
		boolean[] used = new boolean[n];
		String curWord = "";
		dfs(used, curWord);
	}

	public String toString() {
		return "initWord is " + initWord + "\n" + "words = " + words;
	}

	private void dfs(boolean[] used, String curWord) {
		// recursive helper function to create the permutations

		// System.out.println();
		// for (int i = 0; i < used.length; i++) {
		// 	System.out.printf("used[%d] = %b | ", i, used[i]);
		// }
		// System.out.println();

		// check to see if all of used is true
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
			String nextWord = curWord + initWord.charAt(i);  
			dfs(used, nextWord);
			used[i] = false;
		}
	}
}
