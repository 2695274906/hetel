package parseXml.bookXml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 用SAX解析xml文件时需要的handler
 * @author lune
 */
public class SAXParseHandler extends DefaultHandler {
    private List<Table> list;         //存放解析到的table数组
    private Table table;               //存放当前解析的table
    private Map<String,List<Map<String,String>>> resMap2=new HashMap<>();
    private Map<String,String> resMap =new HashMap<>();

    private String content = null;   //存放当前节点值

    /**
     * 开始解析xml文档时调用此方法
     */
    @Override
    public void startDocument() throws SAXException {

        super.startDocument();
        System.out.println("开始解析xml文件");
        list = new ArrayList<Table>();
    }



    /**
     * 文档解析完成后调用此方法
     */
    @Override
    public void endDocument() throws SAXException {

        super.endDocument();
        System.out.println("xml文件解析完毕");
    }

    /**
     * 开始解析节点时调用此方法
     */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        super.startElement(uri, localName, qName, attributes);

        System.out.println("<" + qName + ">");

        for (int i=0; attributes !=null && i<attributes.getLength();i++) {
            String attKey = attributes.getQName(i);
            String attValue = attributes.getValue(i);
            if("CC_CORE_EXTENSION".equals(attValue)){
                resMap= new HashMap<>();
                resMap.put(attKey,attValue);
            }
            resMap.put(attKey,attValue);
            List<Map<String,String>> list = new ArrayList<>();
            list.add(resMap);

            /*
            if("2".equals(attValue)){
//                resMap= new HashMap<>();
                resMap.put(attKey,attValue);
            }*/
        }


        /*if(qName.equals("Table")) {
            resMap= new HashMap<>();
            String tableName = attributes.getValue("TableName");
            table = new Table();
            table.setTableName(tableName);
            resMap.put("TableName",tableName);
        }
        if(qName.equals("RecRow")){
            table = new Table();
            String EXTN_DN = attributes.getValue("EXTN_DN");
            String EXTN_TYPE = attributes.getValue("EXTN_TYPE");
            String PLATFORM_ID = attributes.getValue("PLATFORM_ID");
            table.setTableName(resMap.get("TableName"));
            table.setEXTN_DN(EXTN_DN);
            table.setEXTN_TYPE(EXTN_TYPE);
            table.setPLATFORM_ID(PLATFORM_ID);
        }*/

        }

    /**
     *节点解析完毕时调用此方法
     *
     *@param qName 节点名
     */
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
//        resList.add(resMap);
        super.endElement(uri, localName, qName);
        /*if(qName.equals("RecRow")){ //当结束当前table解析时,将该table添加到数组后置为空，方便下一次table赋值
            list.add(table);
        }*/

    }

    /**
     * 此方法用来获取节点的值
     */
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        super.characters(ch, start, length);

        content = new String(ch, start, length);
    }
    public List<Table> getTables(){
        return list;
    }

}