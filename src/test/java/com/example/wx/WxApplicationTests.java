package com.example.wx;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WxApplicationTests {

    @Test
    void contextLoads() {
        String appID = "wx6deec51d8a82b2f4";
        String appsecret = "0d67c538a529e590528917d1be138c14";
        String urlStr = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + appID + "=APPID&secret=" + appsecret;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(urlStr);

        CloseableHttpResponse response = null;
    }

}
