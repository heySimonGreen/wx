package com.example.wx.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

/**
 * @author: chenwei
 * @data: 2020/10/17 20:14
 */
public class test {
    String appID = "wx6deec51d8a82b2f4";
    String appsecret = "0d67c538a529e590528917d1be138c14";
    String urlStr = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + appID + "=APPID&secret=" + appsecret;
//    URL url = new URL(urlStr);
//    URLConnection urlConnection = url.openConnection();
//    InputStream in = urlConnection.getInputStream();
//    InputStreamReader read = new InputStreamReader(in, Charset.forName("UTF-8"));
//    BufferedReader bread = new BufferedReader(read);
//
//    String str = "";
//    StringBuffer strb = new StringBuffer();

//    if((str = bread.readLine()!=null)){
//        strb.append(str);
//    }
}
