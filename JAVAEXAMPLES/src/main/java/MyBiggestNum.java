import java.util.*;
import java.util.stream.Collectors;

public class MyBiggestNum {

    public static void main(String args[])
    {
        String a[] = {"9","12","548","5"} ;
        List<String> list = Arrays.stream(a)        // IntStream
                //.boxed()
                //.sorted(Comparator.reverseOrder())// Stream<Integer>
                .collect(Collectors.toList());

        System.out.println(list);

        bigNumber(list);
    }

    public static void bigNumber(List<String> lst)
    {
            Collections.sort(lst,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String XY = o1+o2;
                String YX = o2+o1;
                return XY.compareTo(YX)>0 ? -1 : 1 ;
            }
       });
            //Iterator it = lst.iterator();
            for(String p : lst )
                System.out.print(p);

        //while(it.hasNext()){  System.out.print(it.next());}
        
        
        
    }
}
