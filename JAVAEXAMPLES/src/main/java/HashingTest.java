import java.util.HashMap;
import java.util.Map;

public class HashingTest {

    public static void main(String[] args) {
        Map<DataKey, Integer> hm = getAllData();

        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("Pankaj");
        //System.out.println(dk.toString());
       /* for(Map.Entry m : hm.entrySet())
         System.out.println(m.getValue());*/
        System.out.println(dk.hashCode());

        Integer value = hm.get(dk);
        System.out.println(value);

    }

    private static Map<DataKey, Integer> getAllData() {
        Map<DataKey, Integer> hm = new HashMap<>();

        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("Pankaj");
        System.out.println(dk.hashCode());
        hm.put(dk, 10);
       /* Integer value = hm.get(dk);
        System.out.println("testing"+value);*/

        return hm;
    }

}