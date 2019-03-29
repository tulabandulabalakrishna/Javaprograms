import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class BiggestNumberList {

    public static void main(String args[]) {
        //int[] aInt = {12, 35, 2, 67, 88, 13};

        List<Integer> list  = Arrays.asList(3, 12, 23, 44, 20, 10, 17, 8);

        /*List<Integer> even = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        for (Integer e :even) {
         //   System.out.println(e);
        }

        even.forEach(s-> System.out.println(s));*/

        //list.stream().filter(i->i%2==0).forEach(System.out::print);

        list.stream().filter(i->i%2==0).sorted().forEach(System.out::println);

        int sum = list.stream().filter(i->i%2==0).reduce(0,Integer::sum);
        System.out.println("Sum of all integer" + sum);

        //List<Integer> ar = new ArrayList<Integer>();
        //List<Integer> ar = Stream.of()        //List<Integer> ar = Array.asList
        //ar.addAll(aInt);

    }

}
