package Java_collections;

import java.util.HashMap;

public class Ex_HashMap {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // add some string , integer in hashmap
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Jim", 35);
        // print all items in hashmap
        System.out.println(hashMap);

    }
}