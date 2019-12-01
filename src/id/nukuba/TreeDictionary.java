package id.nukuba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeDictionary {
    private Map<String, TreeNode> roots;

    public TreeDictionary() {
        roots = new HashMap<>();
    }

    public void addTreeNode( TreeNode nodeRoot ) {
        roots.put(nodeRoot.getKey(), nodeRoot);
    }

    /**
     * @<code>node</code> is used for testing only
     *
     * @param node
     */
    private void traverseNode( TreeNode node, String previousWord, List<String> wordsResult ) {
        //check if node is the leave of the tree
        if ( node.getChildNode().isEmpty() ) {
            wordsResult.add(previousWord);
            return;
        }

        //iterate over node child
        node.getChildNode()
                .forEach((s, tn) -> {
                    String s2 = previousWord.concat(s);

                    traverseNode(tn, s2, wordsResult);

                });
    }

    /**
     *
     * this method is used to get starting node/level based of sub word
     *
     * @param word
     * @param previousNode
     * @return
     */
    private TreeNode getStartingNode( String word, TreeNode previousNode ) {

        if ( word.length() > 1 ) {
            if ( previousNode.getChildNode().get(word.substring(1, 2)) != null ) {
                System.out.println(previousNode.getKey());
                return getStartingNode(
                            word.substring(1, word.length()),
                            previousNode.getChildNode().get(word.substring(1, 2)));
            }

        }
        return previousNode;

    }

    /**
     *
     * this method is used to retrieve data/word in dictionary
     * this method receive parameter of sub word ex: Ba in { Bandung, Balik Papan, dll}
     *
     * return list of word that available which match the subword
     * return empty list if not found
     *
     * used only for one node in roots property
     * @<code>node</code> is used for testing only
     *
     * @param word
     */
    public List<String> traverseWord( String word ) {

        List<String> wordAvailable = new ArrayList<>();
        //get first letter of word
        //get the starting node
        TreeNode node = roots.get( word.substring( 0, 1 ) );
        node = getStartingNode( word, node );

        System.out.println(word + " : " +node.getKey());

        if ( node != null ) {
            traverseNode( node, word, wordAvailable );
        }

        return wordAvailable;

    }


    public Map<String, TreeNode> getRoots() {
        return roots;
    }

    public void setRoots(Map<String, TreeNode> roots) {
        this.roots = roots;
    }
}
