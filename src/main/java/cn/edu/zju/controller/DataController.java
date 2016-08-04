package cn.edu.zju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hadoop on 2016/6/14.
 */

@Controller
@RequestMapping("/test")
public class DataController {

    @RequestMapping("/k8s")
    public String hello(){
        return "/k8s";
    }


}
