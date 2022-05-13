package it.happys.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: zhangguifa
 * @date: 2022-05-13 9:01
 */
@Controller
public class JieController {
    @GetMapping("jie/index")
    public String jieIndex(){
        return "jie/index";
    }
}
