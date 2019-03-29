import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {

    public static void main(String args[])
    {
        String s1 = "TTAA";
        String s2  = "TATA";
        char[] ch = s1.toCharArray();
        char[] ch1 = s2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        if(String.valueOf(ch).equalsIgnoreCase(String.valueOf(ch1)))
        {
            System.out.println("Both strings are anagrams" + String.valueOf(ch) + "  " + String.valueOf(ch1));
        }
        else
        {
            System.out.println("Both strings are not anagrams" + String.valueOf(ch) + "  " + String.valueOf(ch1));
        }


        String s = "HEALKJ#)(*)(";
        //System.out.println(s.replaceAll("[^a-zA-Z0-9]$",""));

    }
}
