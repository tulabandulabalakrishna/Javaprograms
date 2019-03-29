import java.util.ArrayList;
import java.util.List;

public class permstring {

    public static List<String> stringpermutations(String str)
    {
        if(str.length() ==0)
        {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }

        char c = str.charAt(0);

        String substr = str.substring(1);

        List<String> tempList = stringpermutations(substr);

        List<String> Result = new ArrayList<>();

        for(String s: tempList)
        {
            for(int i =0 ; i<=s.length(); i++)
            {
                String comb = s.substring(0,i) + c + s.substring(i);
                Result.add(comb);
            }
        }

        return Result;
    }

    public static void print(List<String> list)
    {
        for(String s: list)
        {
            System.out.println(s);
        }
    }

    public static void main(String args[])
    {
        String s = "ABCD";
        //System.out.println(
             List<String> ls =   stringpermutations(s);
        print(ls);


    }

}
