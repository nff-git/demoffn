package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2021/07/14
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(int po, HttpServletResponse response){
        try {
            if(po== 3){
                return "hai";
            }
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/octet-stream; charset=UTF-8");
            response.setHeader("Content-Disposition", "attachment;fileName=" + "thirdImportTemplate" + ".xls");
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

}
