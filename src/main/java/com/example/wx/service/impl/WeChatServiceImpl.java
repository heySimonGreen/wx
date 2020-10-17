package com.example.wx.service.impl;

import com.example.wx.service.WeChatService;

import com.example.wx.util.RestTemplateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author: chenwei
 * @data: 2020/10/17 22:00
 */

@Service
public class WeChatServiceImpl implements WeChatService {

    Logger logger = LoggerFactory.getLogger(WeChatServiceImpl.class);

    @Value("${wx.access_token_url}")
    private String accessTokenUrl;

    @Value("${wx.appId}")
    private String appId;

    @Value("${wx.secret}")
    private String secret;

    @Override
    public String getWeChatAccessTokenUrl() {
        try {
            String url = accessTokenUrl.replace("APPID",appId).replace("APPSECRET",secret);
            logger.info("请求获取access_token的url:" + url);
            logger.info("RestTemplateUtil.get(url):" + RestTemplateUtil.get(url));
            return RestTemplateUtil.get(url);
        } catch (Exception e) {
            e.printStackTrace();
            return "请求获取access_token出现异常";
        }
    }

}
