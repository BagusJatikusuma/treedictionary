package id.nukuba;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        //add tree to Dictionary
        TreeDictionary treeDictionary = new TreeDictionaryMap();
        treeDictionary.addNode("bandung");
        treeDictionary.addNode( "balik papan" );
        treeDictionary.addNode( "Banjarmasin" );

        System.out.println( treeDictionary.traverseWord("A") );

    }
}
