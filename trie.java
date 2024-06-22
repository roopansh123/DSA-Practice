public class trie {
    static class Node{
        boolean eow = false;
        Node children [] = new Node[26];

        Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
}
