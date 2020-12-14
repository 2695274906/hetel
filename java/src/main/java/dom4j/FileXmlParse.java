package dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileXmlParse {
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
}
