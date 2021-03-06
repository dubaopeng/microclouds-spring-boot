package com.microclouds.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author : https://github.com/Fanqie22
 * @date : 2018年12月30日13:29:45
 * @description: main主页控制器
 */
@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/microclouds")
public class mainController {

    /**
     * 1. message和email表添加readed字段
     * 2. 上一个commit ,关于系统路径的还没有提交到github
     * 3. filesystem表添加md5字段
     */


    /**
     * 首页请求, GET
     */
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String mainPage() {
        return "main";
    }
}
