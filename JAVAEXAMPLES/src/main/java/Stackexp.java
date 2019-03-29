public class Stackexp {
    int a[];
    int size;
    int index;

    /*int[] b=new int[5];

    int c[]=new int[4];
 int d[]={};*/



    Stackexp(int size, int[] c)
    {
        a = new  int[size];
        a = c;
    }
    public void print(Stackexp e )
    {
        for(int i=0;i<e.a.length;i++)
        {
            System.out.println(e.a[i]);
        }
    }

    public static void main(String args[])
    {
        int c []={2,3,4};
        Stackexp e = new Stackexp(3,c);
        e.print(e);

    }
}
