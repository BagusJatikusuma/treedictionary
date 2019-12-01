package id.nukuba;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        //create word bagus and bayu node
        //tree for bagus word
        TreeNode s = new TreeNode( "s", new HashMap<>(), true);
        TreeNode u = new TreeNode( "u", Map.ofEntries(Map.entry("s", s)), false);
        TreeNode g = new TreeNode( "g", Map.ofEntries(Map.entry("u", u)), false);
        //tree for bayu word
        TreeNode u2 = new TreeNode( "u", new HashMap<>(), true);
        TreeNode y = new TreeNode( "y", Map.ofEntries(Map.entry("u", u2)), false);

        TreeNode a = new TreeNode( "a", Map.ofEntries(Map.entry("g", g), Map.entry("y", y )), false);
        TreeNode b = new TreeNode( "b", Map.ofEntries(Map.entry("a", a)), false);

        //add tree to Dictionary
        TreeDictionary treeDictionary = new TreeDictionary();
        treeDictionary.addTreeNode(b);
        System.out.println(b.getKey());
        treeDictionary.traverseNode("a");

    }
}
