package com.zhenyue.techcenter.mockserver.LeeCode;

class Trie {

    private StringBuilder strTrie = new StringBuilder();

    /** Initialize your data structure here. */
    public Trie() {

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        strTrie.append(word);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if (strTrie.indexOf(word) >= word.length())
            return true;
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if (strTrie.indexOf(prefix) > 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        boolean b1 = trie.search("apple");     // 返回 False
        boolean b2 = trie.search("app");     // 返回 False
        boolean b3 = trie.startsWith("app"); // 返回 True
        trie.insert("app");
        boolean b4 = trie.search("app"); // 返回 True

        String info = String.format("%s:%s:%s:%s:", b1, b2, b3, b4);
        System.out.println(info);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
