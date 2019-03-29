import com.google.gson.JsonParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ReadFromJSON {

    public static void main(String args[])
    {
        JSONParser p = new JSONParser();
        JSONObject j , k;
        try {
            Object obj = p.parse(new FileReader("D:\\WebPackExampleProject\\JAVAEXAMPLES\\src\\main\\resources\\testdata.json"));
            //Object obj = p.parse(new FileReader("src/main/resources/testdata.json"));
            j = (JSONObject) obj;

            System.out.println(j.toJSONString());
            System.out.println("Name is " + j.get("Name"));
            System.out.println("Marks is " + j.get("Marks"));


            //JSONArray arr = obj.getJSONArray("posts")
            JSONArray arr = (JSONArray) j.get("Marks");
            for (int i = 0; i < arr.size(); i++) {
                String post_id = arr.get(i).toString();           //getString("post_id");
                //k = arr.get(i);

                System.out.println(post_id);
            }

            /*JsonArray array = new JsonParser().parse(new FileReader("D:\\WebPackExampleProject\\JAVAEXAMPLES\\src\\main\\resources\\testdata.json")).getAsJsonArray();
            Gson gson = new Gson();
            List<Map> list = gson.fromJson(array, List.class);*/
            /*Iterator<String> iterator = a.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }*/
            /*for( int m : a)
            {
                System.out.println(m);
            }*/
        }
        catch (FileNotFoundException e){
            System.out.println("stack trace");
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
    //File resourcesDirectory = new File("src/test/resources");