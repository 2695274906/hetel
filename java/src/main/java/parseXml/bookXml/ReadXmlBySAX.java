package parseXml.bookXml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.List;

/**
 * 用SAX方式读取xml文件
 * @author lune
 */
public class ReadXmlBySAX {

    private static List<Table> tables = null;

    private  SAXParserFactory sParserFactory = null;
    private  SAXParser parser = null;


    public List<Table> getTables(File fileName) throws Exception{
        SAXParserFactory sParserFactory = SAXParserFactory.newInstance();
        SAXParser parser = sParserFactory.newSAXParser();

        SAXParseHandler handler = new SAXParseHandler();
        parser.parse(fileName, handler);
        List<Table> resList =handler.getTables();
        return resList;

    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {


            File file = new File("home/ucp/CMU.xml");
//            FileInputStream fileInputStream = new FileInputStream(file);

            tables = new ReadXmlBySAX().getTables(file);
            for(Table table:tables){
                int aa =Integer.parseInt(table.getEXTN_TYPE());
                if("CC_CORE_EXTENSION".equals(table.getTableName())){
                    if(aa==2){
                        String bb=table.getEXTN_DN();
                        String[] cc =bb.split("-");
                        int startInt = Integer.parseInt(cc[0]);
                        int endInt = Integer.parseInt(cc[1]);
                        if(endInt-startInt==1000){
                            table.setStatus("通过");
                        }else {
                            table.setStatus("不通过");
                        }
                        System.out.println(table);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
