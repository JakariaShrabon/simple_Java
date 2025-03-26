package Java_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Stack;
import java.util.Iterator;

public class ListExamples {
   
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
            linkedList.add("A");
            linkedList.add("B");
            linkedList.add("C");
            for(String s : linkedList)
                System.out.println(s);
    }
}