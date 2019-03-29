import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibseries {

    public static List<Integer> fibseries(int n)
    {

        int f1,f2,f3;
        f1=0;
        f2=1;
        f3=0;
        List<Integer> fibSeries=new ArrayList<Integer>();
        fibSeries.add(f1);
        fibSeries.add(f2);
        for(int i=1 ; i<=n /*&& f3<=n*/ ; i++)
        {
            f3 = f1 + f2;
            if(f3 > n){break;}
            fibSeries.add(f3);

            f1=f2;
            f2=f3;

        }
        return fibSeries;
    }
    public static void main(String args[])
    {
        int n=10;
        /*Scanner scan = new Scanner(System.in);
        n = scan.nextInt();*/
        List<Integer> fibSeriesList = new ArrayList<Integer>();
        fibSeriesList = fibseries(n);
        for( Integer f : fibSeriesList)
        {
            System.out.println(f);
        }

    }


}
