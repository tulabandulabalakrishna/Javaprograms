    class TestSleepMethod1 {

        /*public void run(){
            for(int i=1;i<5;i++){
                try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
                System.out.println(" thread:"+Thread.currentThread()+" :"+i);
            }
        }*/
        public static void main(String args[]) throws InterruptedException {
            TestSleepMethod1 t1=new TestSleepMethod1();
            TestSleepMethod1 t2=new TestSleepMethod1();

           // t1.start();
           // t1.start();
           // t1.join();
           // t2.start();
         //   System.gc();
            String a="1";
            String b="1";
            String c="1";
            a=null;
           c=b;
           t2=t1;

            System.gc();
        }
        protected void finalize()
        {
            System.out.println("Garbage collection is performed by JVM");
        }
    }

