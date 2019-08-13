import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class prob1 {
    public static void main(String[] args) {

        List<String> myCoords = new ArrayList<String>();
        myCoords.add("cat");
        myCoords.add("dog");
        myCoords.add("bat");
        myCoords.add("cow");
        myCoords.add("plant");
        myCoords.add("cat");
        myCoords.add("cat");

        findDuplicates(myCoords);

    }

    // function for finding the duplicates in a list
    public static void findDuplicates(List<String> strings) {
        // create hashmap for checking
        // also create list for duplicates
        HashMap<String, Integer> map = new HashMap<>();

        HashMap<String, Integer> dupe = new HashMap<>();

        for (int i = 0; i < strings.size(); i++) {
            if (map.containsKey(strings.get(i))) {
                dupe.put(strings.get(i), 0);
                System.out.println("Stepping in: " + i);

            } else {
                // enter it into the hashmap
                // Hash_Map.put(key, value);
                map.put(strings.get(i), 0);
            }

        }

        System.out.println("Originals: " + map.keySet());
        System.out.println(dupe.keySet());

        // iterate through hashmap
        // while iterating see if the entry is unique, if it isn't add it onto the list
        // of duplicates
        // return the list of duplicates
    }

}