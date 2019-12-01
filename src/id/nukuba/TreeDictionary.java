package id.nukuba;

import java.util.HashMap;
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
     *
     * used only for one node in roots property
     * @<code>node</code> is used for testing only
     *
     * @param node
     */
    public void traverseNode( TreeNode node ) {
        //iterate over node child
        node.getChildNode()
                .forEach((s, tn) -> {

                    System.out.println("key " + s + " has child " + tn.getChildNode().size());

                    traverseNode(tn);

                });
    }

    /**
     *
     * used only for one node in roots property
     * @<code>node</code> is used for testing only
     *
     * @param word
     */
    public void traverseNode( String word ) {
        //get first letter of word
        TreeNode node = roots.get( word.substring( 0, 1 ) );

        if ( node != null ) {
            node.getChildNode()
                    .forEach((s, tn) -> {

                        System.out.println("key " + s + " has child " + tn.getChildNode().size());

                        traverseNode(tn);

                    });
        }

    }

    public Map<String, TreeNode> getRoots() {
        return roots;
    }

    public void setRoots(Map<String, TreeNode> roots) {
        this.roots = roots;
    }
}
