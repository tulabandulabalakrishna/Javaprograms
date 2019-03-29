import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    public static void main(String args[])
    {
        HashMap<Integer,String> h = new HashMap();
        h.put(1,"balakrishna");
        h.put(2,"Srilu");
        h.put(3,"Josnika");
        h.put(4,"Janish");
        h.put(1,"krishna");
        System.out.println("testing "+h.get(3));

        for(Map.Entry k : h.entrySet()){
          /* if(Integer.parseInt(k.getKey().toString())==2)
           {
               System.out.println(k.getKey() +"   " +k.getValue());
           }*/
            System.out.println(k.getKey() +"   " +k.getValue());
        }
    }

}
