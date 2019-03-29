public class systemclassinfo {

    public static void main(String args[]) {
     /*Scanner scan = new Scanner(System.in);
        //n = scan.nextInt();

        SecurityManager secManager = System.getSecurityManager();
        if(secManager == null){
            System.out.println("SecurityManager is not configured");
        }

        System.gc();
        System.out.println("Garbage collector executed.");

//map library name
        String libName = System.mapLibraryName("os.name");
        System.out.println("os.name library="+libName);*/


//get unmodifiable environment variables map
       /* Map<String, String> envMap = System.getenv();
        Set<String> keySet = envMap.keySet();
        for(String key : keySet){
            System.out.println("Key="+key+",value="+envMap.get(key));
        }*/

//Get Specific environment variable
    /*    String pathValue = System.getenv("PATH");
        System.out.println("$PATH="+pathValue);*/

    }
}
