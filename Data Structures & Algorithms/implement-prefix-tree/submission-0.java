class PrefixTreeNode {
    PrefixTreeNode[] children = new PrefixTreeNode[26];
    boolean isEnd = false;
}


class PrefixTree {
    
    private PrefixTreeNode root;

    public PrefixTree() {
        root = new PrefixTreeNode();
         
    }

    public void insert(String word) {
        PrefixTreeNode cur = root;
        for (char c: word.toCharArray()) {
            int pos = c - 'a';
            if (cur.children[pos] == null) {
                cur.children[pos] = new PrefixTreeNode();
            }
            cur = cur.children[pos];
        }
        cur.isEnd = true;

    }

    public boolean search(String word) {
        PrefixTreeNode cur = root;
        for (char c: word.toCharArray()) {
            int idx = c - 'a';
            if (cur.children[idx] == null) {
                return false;
            }
            cur = cur.children[idx];
        }
        return cur.isEnd;

    }

    public boolean startsWith(String prefix) {
        PrefixTreeNode cur = root;
        for (char c: prefix.toCharArray()) {
            int idx = c - 'a';
            if (cur.children[idx] == null) {
                return false;
            }
            cur = cur.children[idx];
        }
        return true;

    }
}
