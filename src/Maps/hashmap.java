package Maps;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

    static void HashMapsMethods(){
        //syntax
         Map<String, Integer> hm = new HashMap<>();
         // or u can define like this as well
//        HashMap<String, Integer> hm s= new HashMap<>();

        // Adding Elements
        hm.put("ram", 21);
        hm.put("rahul", 27);
        hm.put("dikshu", 29);

        // Getting value of a key from the HashMap
        System.out.println(hm.get("dikshu")); // if value not exits it will return null

        // Changing/updating value of a key in the HashMap
        System.out.println( hm.put("ram", 12));

        // remove the entry of hashMap
         hm.remove("ram");

         // checking if key exist is in hashMap
        System.out.println(hm.containsKey("ram")); // it give answer in boolean

        // adding a new entry if the new key doesn't exist already
          hm.putIfAbsent("rahul", 23);

          // get all keys in hashmap
        System.out.println(hm.keySet());

        // Get all the values in hashmaps
        System.out.println(hm.values());

        // Get all the entries in the HashMap
        System.out.println(hm.entrySet());

        // traversing all the entries in hashmaps - multipel methods

        // first method --> using for each loop traversing throw keys

         for(String key: hm.keySet()){
             System.out.printf("Age of %s is %d\n", key, hm.get(key));
         }

        // second method --->
        System.out.println("new methid for traversing hashmap");

         for(Map.Entry<String,Integer>e : hm.entrySet()){
          System.out.printf("Age of %s is %d\n",e.getKey(), e.getValue());
         }

         // third methd  ----->
        System.out.println("third method for traversing");
        for(var e : hm.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(), e.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapsMethods();
    }
}
