// Java program to count frequencies of elements
// using HashSet and Collections.frequency.
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

class countFrequenciesArraylist {

    public static void countFrequencies1(ArrayList<String> list) {
        // hashmap to store the frequency of element
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (String i : list) {
            Integer j = hm.get(i);
            System.out.println(j);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        // displaying the occurrence of elements in the arraylist
        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                    + "occurs"
                    + ": " + val.getValue() + " times");
        }
    }


     public static void countFrequencies(ArrayList<String> list)
    {

        // hash set is created and elements of
        // arraylist are insertd into it
        Set<String> st = new HashSet<String>(list);
        for (String s : st)
            //System.out.println(s);
           System.out.println(s + ": " + Collections.frequency(list, s));
    }

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("B");
        list.add("Geeks");
        //countFrequencies(list);
       countFrequencies1(list);
    }
}
