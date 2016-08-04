package cn.edu.zju.service;

import cn.edu.zju.domain.VmEntity;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by hadoop on 2016/6/15.
 */
@Component
public class DomTest {

    public static Map<String ,List<VmEntity>> vmEntityList = new HashMap<String, List<VmEntity>>(){//BeanPostProcessor


    };
    static {
        try {
            List<VmEntity> vms = (List<VmEntity>) LoadVm.parseXml();
            vmEntityList.put("vms", vms);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /*public static void main(String[] args) throws Exception
    {
        // step 1:获得DOM解析器工厂
        // 工厂的作用是创建具体的解析器
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        // step 2：获得具体的dom解析器
        DocumentBuilder db = dbf.newDocumentBuilder();

        // step 3:解析一个xml文档，获得Document对象（根节点）
        // 此文档放在项目目录下即可
        Document document = db.parse(new File("E:\\ideaworkspaces\\format\\src\\main\\java\\vmconf.xml"));

        // 根据标签名访问节点
        NodeList list = document.getElementsByTagName("VM");
        System.out.println("list length: " + list.getLength());

        // 遍历每一个节点
        for (int i = 0; i < list.getLength(); ++i)
        {
            VmEntity vmEntity = new VmEntity();
            System.out.println("----------------------");
            // 获得元素，将节点强制转换为元素
            Element element = (Element) list.item(i);
            // 此时element就是一个具体的元素

            // 获取子元素：子元素title只有一个节点，之后通过getNodeValue方法获取节点的值
        *//*    String content0 = element.getElementsByTagName("ip").item(0)
                    .getNodeValue();

            System.out.println(content0);*//*
            // 此处打印出为null
            // 因为节点getNodeValue的值永远为null

            // 解决方法：加上getFirstChild()
            String content = element.getElementsByTagName("ip").item(0)
                    .getFirstChild().getNodeValue();
            System.out.println("ip: " + content);// 此处打印出ip

            // 后面类似处理即可：
            content = element.getElementsByTagName("job").item(0)
                    .getFirstChild().getNodeValue();
            System.out.println("job: " + content);
            content = element.getElementsByTagName("index").item(0)
                    .getFirstChild().getNodeValue();
            System.out.println("index: " + content);
        }
    }*/
}
