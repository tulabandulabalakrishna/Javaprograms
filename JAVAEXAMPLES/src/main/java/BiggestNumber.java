import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiggestNumber {

    public static void main (String args[] ) {
       // int a[] = {10, 35, 22};
        int arr[] = {10, 35, 22};

         // ArrayList<Integer> arraylist= new ArrayList<>(Arrays.asList(a));
//        ArrayList<Integer> al = new ArrayList<>();
//        for (int i : a) {
//
//            al.add(Integer.valueOf(i));
//
//        }
//        for (Integer p : al) {
//            System.out.println(Integer.valueOf(p));
//





//        }

        List<Integer> list = Arrays.stream(arr)        // IntStream
                .boxed()
                .sorted(Comparator.reverseOrder())// Stream<Integer>
                .collect(Collectors.toList());

        System.out.println(list);
//        for (Integer c : list) {
//            System.out.println(Integer.valueOf(c));
//
//        }


    }
}
