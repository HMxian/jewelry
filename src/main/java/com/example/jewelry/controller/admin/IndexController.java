package com.example.jewelry.controller.admin;

import cn.hutool.Hutool;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

    /**
     * 主页
     */
    @RequestMapping("/")
    public String index () {
        return "index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "page/welcome-1";
    }

    @RequestMapping("/welcome2")
    public String welcome2() {
        return "page/welcome-2";
    }

    @RequestMapping("/menu")
    public String menu(){

        return "page/menu";
    }

    @RequestMapping("/setting")
    public String setting() {
        return "page/setting";
    }

    @RequestMapping("/table")
    public String table () {
        return "page/table";
    }

    @RequestMapping("/form")
    public String form () {
        return "page/form";
    }

    @RequestMapping("/form-step")
    public String form2() {
        return "page/form-step";
    }

    @RequestMapping("/404")
    public String errer404(){
        return "page/404";
    }

    @RequestMapping("/button")
    public String button(){
        return "page/button";
    }

    @RequestMapping("/layer")
    public String layer(){
        return "page/layer";
    }

    @RequestMapping("/icon")
    public String icon(){
        return "page/icon";
    }

    @RequestMapping("/icon-picker")
    public String icon1(){
        return "page/icon-picker";
    }

    @RequestMapping("/color-select")
    public String color(){
        return "page/color-select";
    }

    @RequestMapping("/table-select")
    public String tableSelect(){
        return "page/table-select";
    }

    @RequestMapping("/upload")
    public String upload(){
        return "page/upload";
    }

    @RequestMapping("/editor")
    public String editor(){
        return "page/editor";
    }





}
