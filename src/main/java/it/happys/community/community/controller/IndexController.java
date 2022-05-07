package it.happys.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: zhangguifa
 * @date: 2022-05-07 10:10
 */

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        System.out.println("结果");
        return "index";
    }
}
