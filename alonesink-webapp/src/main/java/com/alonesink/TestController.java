package com.alonesink;

/*
* Created by  WangDi  on 2017/9/14 0014
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/ajax",method = RequestMethod.GET)
    public String getAjax(){

        System.out.println("test=========");
        return null;
    }

}
