package xmlDom;

import com.alibaba.druid.util.StringUtils;
import org.apache.commons.collections.CollectionUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * 使用Dom4J解析xml文件
 */
public class FileXmlParseUtil {
        /**
         * 解析xml文件到根标签下第3级
         * @param cmuFile
         * @return
         */
        public  static  List<Element> parseXml(File cmuFile) {
            SAXReader reader = new SAXReader();
            try {
                Document document = reader.read(cmuFile);
                Element root = document.getRootElement();
                Iterator it = root.elementIterator();
                List<Element> listNodes = new ArrayList<>();
                while (it.hasNext()) {
                    Element element = (Element) it.next();
                    List list = element.elements();
                    if (list.isEmpty()) {
                        listNodes.add(element);
                    } else {
                        for (Iterator i = element.elementIterator(); i.hasNext(); ) {
                            Element node = (Element) i.next();
                            listNodes.add(node);
                        }
                    }

                }
                return listNodes;
            } catch (DocumentException e) {
                e.printStackTrace();
                return null;
            }
        }
        public static List<Element> paseXmlAndGet(File fileName,String tableName){
            List<Element> elements = parseXml(fileName);
            List<Element> result = new ArrayList<>();
            if(StringUtils.isEmpty(tableName)){
                return result;
            }
            for(Element element: elements){
                List<Attribute> attributes = element.attributes();
                for(Attribute attribute: attributes){
                    String qName = attribute.getQName().getName();
                    if("TableName".equalsIgnoreCase(qName)){
                        String attributeValue = attribute.getValue();
                        if(tableName.equalsIgnoreCase(attributeValue)){
                            result.addAll(element.elements());
                        }
                    }
                }
            }
            return result;
        }


    public static void main(String[] args) {
        String filepath="D:\\deskTop\\CMU.xml";
        List<InspectPackItemBean> inspectLists =new ArrayList<>();
        File file = new File(filepath);
        List<Element> list =FileXmlParseUtil.paseXmlAndGet(file,"CC_CORE_EXTENSION");
        if(!CollectionUtils.isEmpty(list)){
            for(Element element:list){
                if(!"2".equals(element.attribute("EXTN_TYPE").getValue())){
                    break;
                }else{
                    String  value = element.attribute("EXTN_DN").getValue();
                    String[] strValue = value.split("-");
                    int val1 =Integer.parseInt(strValue[0]);
                    int val2 =Integer.parseInt(strValue[1]);
                    if((val2-val1)==1000){
                        InspectPackItemBean inspectPackItemBean = new InspectPackItemBean();
                        inspectPackItemBean.setInspectStatus("1");
                        inspectPackItemBean.setInspectRes("通过");
                        inspectLists.add(inspectPackItemBean);
                        System.out.println(inspectLists);
                        break;
                    }else {
                        InspectPackItemBean inspectPackItemBean = new InspectPackItemBean();
                        inspectPackItemBean.setInspectStatus("0");
                        inspectPackItemBean.setInspectRes("不通过");
                        inspectLists.add(inspectPackItemBean);
                    }
                }

            }
        }

    }

}
