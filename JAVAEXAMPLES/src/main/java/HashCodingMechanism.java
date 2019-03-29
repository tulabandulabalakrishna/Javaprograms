import java.util.HashMap;

public class HashCodingMechanism {

    public static void main(String args[])
    {
        HashMap < String , String> h = new HashMap();
        h.put("1","Balakrishna");
        h.put("2","Balakrishna2");
        System.out.println(h.get("1").hashCode());
        System.out.println(h.get("2").hashCode());
        System.out.println("to string  "+h.toString());
        System.out.println("hashcode   "+h.hashCode());

        HashMap < String , String> h1 = new HashMap();
        h1.put("1","Balakrishna");
        h1.put("3","Balakrishna3");

        System.out.println(h1.get("1").hashCode());
        System.out.println(h1.get("3").hashCode());
    }
}
