import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadfromXML {
    public static void main(String args[])
    {
        String filePath = "D:\\WebPackExampleProject\\JAVAEXAMPLES\\src\\main\\resources\\xmldata.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;

        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(filePath);
            doc.getDocumentElement().normalize();

            NodeList employees = doc.getElementsByTagName("Employee");
            Element emp = null;
            //loop for each employee
            for(int i=0; i<employees.getLength();i++){
                emp = (Element) employees.item(i);

                Node name1 = emp.getElementsByTagName("name").item(0).getFirstChild();
                Node name2 = emp.getElementsByTagName("age").item(0).getFirstChild();


                Node name = emp.getElementsByTagName("name").item(0).getFirstChild()  ;

                System.out.println(name.getNodeValue());
                name.setNodeValue(name.getNodeValue().toUpperCase());

                System.out.println(name2);
            }




        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }


    }

}
