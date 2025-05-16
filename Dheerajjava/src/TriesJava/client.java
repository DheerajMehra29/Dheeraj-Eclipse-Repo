package TriesJava;

final class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie trie = new Trie();
		trie.addWord("arts");
		trie.addWord("art");
		trie.addWord("bug");
		trie.addWord("boy");
		trie.addWord("sea");
		trie.addWord("seen");
		trie.addWord("see");
		trie.addWord("amit");
		trie.Display();
		System.out.println(trie.search("boy"));
		System.out.println(trie.search("boys"));
		System.out.println("***************");
		trie.remove("arts");
		trie.remove("art");
		trie.Display();
		System.out.println(trie.numWords());
		
		

	}

}
