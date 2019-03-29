import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class starprint
{
    public static void main(String args[])
    {

        int i,j,n,m,k,p;

        n=3;
        m=n;
        //p=1;
        p=6;

        // triangle
        for(i=1;i<=n;i++)
        {
            for(j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("* ");
            //System.out.print(p +" ");
            //p++;
            }
            System.out.println("");
        }

       //inverted triangle
        for(i=1;i<=n;i++,m--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=m-1;k++)
            {
            System.out.print("* ");
            //System.out.print(p +" ");
            //p++;
             //   p--;
            }
            System.out.println("");
            //m--;
        }
        /*for(i=1;i<=n;i++)
        {
            for(k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            for(j=1;j<=1;j++)
            {
                System.out.print(" ");
            }
            System.out.println("");
        }*/

        /*for(i=1;i<=n;i++,m--)
        {
            for(j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            for(k=1;k<=m;k++)
            {
                System.out.print("* ");
            }
            System.out.println("");


        }*/
    }
}