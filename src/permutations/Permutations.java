package permutations;

import java.util.List;
import java.util.ArrayList;

public class Permutations {
	private String initWord;
	private List<String> words;

	public Permutations(String initWord) {
		this.initWord = initWord;
		this.words = new ArrayList<String>();
		// added the word array list
		dfs(6);
	}

	public String toString() {
		return this.initWord;
	}

	private void dfs(int i) {
		// recursive helper function to create the permutations
		System.out.printf("int i is %d%n",i);

	}
}
