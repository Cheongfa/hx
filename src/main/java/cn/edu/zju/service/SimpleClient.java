/*

package cn.edu.zju.service;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URLEncoder;


*/
/**
 * Created by hadoop on 2016/6/14.
 *//*


@Service
public class SimpleClient {
    Log log = LogFactory.getLog( SimpleClient.class );

    public static void main( String[] args ) throws IOException {
        HttpClient client = new HttpClient();
        // 设置代理服务器地址和端口
        // client.getHostConfiguration().setProxy( "10.10.10.10", 80 );
        // 使用 GET 方法 ，如果服务器需要通过 HTTPS 连接，那只需要将下面 URL 中的 http 换成 https

//        String path = "http://10.10.103.186:4242/api/query?start=1m-ago&m=avg:30s-max:system.cpu.user";
//        String params = URLEncoder.encode("start=1m-ago&m=avg:30s-max:system.cpu.user{job=uaa,index=0}", "utf-8");
        String path = "http://10.10.101.11:50000/deployment-engine/status ";
        //String params = URLEncoder.encode("status -X GET", "utf-8");
        //String url = path + params;
        String url = path;
        HttpMethod method = new GetMethod( url );

        // 这里设置字符编码，避免乱码
        method.setRequestHeader( "Content-Type", "text/html;charset=utf-8" );

        client.executeMethod( method );
        // 打印服务器返回的状态
        System.out.println( method.getStatusLine() );

        // 获取返回的html页面
        byte[] body = method.getResponseBody();
        // 打印返回的信息
        System.out.println( new String( body, "utf-8" ) );
        // 释放连接
        method.releaseConnection();
    }

}

*/
