package com.example.wx.controller;

import com.example.wx.entity.Admin;
import com.example.wx.service.AdminService;
import com.example.wx.service.WeChatService;
import com.example.wx.util.RestTemplateUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Admin)表控制层
 *
 * @author chenwei
 * @since 2020-10-17 22:07:54
 */
@RestController
@RequestMapping("admin")
public class AdminController {
    /**
     * 服务对象
     */
    @Resource
    private AdminService adminService;

    @Resource
    private WeChatService weChatService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Admin selectOne(Integer id) {
        return this.adminService.queryById(id);
    }


    @GetMapping("getWeChatAccessTokenUrl")
    public String getWeChatAccessTokenUrl(){
        return weChatService.getWeChatAccessTokenUrl();
    }

}