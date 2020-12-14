package dom4j;

import org.apache.shiro.util.CollectionUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dom4jDemo {
/*    public static void createXml(String fileName) {
        Document document = DocumentHelper.createDocument();
        Element employees = document.addElement("employees");
        Element employee = employees.addElement("employee");
        Element name = employee.addElement("name");
        name.setText("jobs");
        Element age = employee.addElement("age");
        age.setText("24");
        Element employee1 = employees.addElement("employee");
        Element name1 = employee1.addElement("name");
        name1.setText("steven");
        Element age1 = employee1.addElement("age");
        age1.setText("39");
        try {
            Writer fileWriter = new FileWriter(fileName);
            XMLWriter xmlWriter = new XMLWriter(fileWriter);
            xmlWriter.write(document);
            xmlWriter.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }*/

    public static List<Element> parseXml(String pathName) {
        SAXReader reader = new SAXReader();
        List<Element> listNodes=null;
        try {
            Document document = reader.read(new File(pathName));
            Element root = document.getRootElement();
            Iterator it = root.elementIterator();
            listNodes =new ArrayList<>();
            while (it.hasNext()) {
                Element element = (Element) it.next();
                for (Iterator i = element.elementIterator(); i.hasNext(); ) {
                    Element node = (Element) i.next();
                    listNodes.add(node);
                }
            }
            return listNodes;
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return  listNodes;

    }

    public static void main(String[] args) {
        //Dom4jDemo.createXml("src/employee.xml");
        String pathName="D:\\deskTop\\books.xml";
        List<Element> nodes =Dom4jDemo.parseXml(pathName);
        if(!CollectionUtils.isEmpty(nodes)){
            for(Element element:nodes){
                for(int i=0;i<element.attributeCount();i++){
                    System.out.println(element.getName());
                    System.out.println(element.attribute(i).getName()+":"+element.attribute(i).getValue());
                }
            }
        }
        /*if(element!=null){
            for (int i=0;i<element.attributeCount();i++){
                System.out.println(element.attribute(i));
            }

        }*/

       /* for(int j=0;j<node.attributeCount();j++){
            String name =node.attribute(j).getName();
            String value=node.attribute(j).getValue();
            System.out.println(name+":"+value);
        }*/
//        System.out.println(element);
    }
}