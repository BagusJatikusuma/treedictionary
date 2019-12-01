package id.nukuba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        //add tree to Dictionary
        TreeDictionary treeDictionary = new TreeDictionary();
        treeDictionary.addNode("bandung");
        treeDictionary.addNode( "balik papan" );

        List<String> wordAvailable = new ArrayList<>();
        System.out.println( treeDictionary.traverseWord("ba") );

    }
}
