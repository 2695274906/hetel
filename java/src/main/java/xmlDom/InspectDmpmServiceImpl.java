package xmlDom;

import org.apache.commons.collections.CollectionUtils;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class InspectDmpmServiceImpl {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    private static String IVR_INSPECTION_PATH="D:\\deskTop\\CMU.xml";

    public InspectPackItemBean businessInspect(InspectPackItemBean packList){
        logger.info("巡检包的参数列表"+packList);

        String filepath=IVR_INSPECTION_PATH;
        File file =new File(filepath);
        if(!file.exists()){
            logger.info(filepath+"文件不存在");
        } else {
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
                            packList = new InspectPackItemBean();
                            packList.setInspectStatus("1");
                            packList.setInspectRes("通过");
                            break;
                        }else {
                            packList = new InspectPackItemBean();
                            packList.setInspectStatus("0");
                            packList.setInspectRes("不通过");
                        }
                    }

                }
            }

        }
        return  packList;
    }

    /*public static void main(String[] args) {
        String filepath=IVR_INSPECTION_PATH;
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

    }*/

}
