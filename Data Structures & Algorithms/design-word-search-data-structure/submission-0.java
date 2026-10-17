class PrefixTreeNode {
    boolean isEnd = false;
    PrefixTreeNode[] children = new PrefixTreeNode[26];
}


class WordDictionary {
    private PrefixTreeNode root;

    public WordDictionary() {
        root = new PrefixTreeNode();

    }

    public void addWord(String word) {
        PrefixTreeNode cur = root;
        for (char c: word.toCharArray()) {
            int idx = c - 'a';
            if (cur.children[idx] == null) {
                cur.children[idx] = new PrefixTreeNode();
            }
            cur = cur.children[idx];
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        return this.dfs(word, this.root, 0);
    }

    private boolean dfs(String word, PrefixTreeNode root, int idx) {
        PrefixTreeNode cur = root;
        //base case, if we have a word containig no . i.e. abc
        for (int i = idx; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '.') {
                for (PrefixTreeNode p: cur.children) {
                    if (p != null && dfs(word, p, i + 1)) {
                        return true;
                    } 
                }
                return false;
            } else {
                int j = c -'a';
                if (cur.children[j] == null) return false;
                cur = cur.children[j];  
            }
        }
        return cur.isEnd; 
    }
}
