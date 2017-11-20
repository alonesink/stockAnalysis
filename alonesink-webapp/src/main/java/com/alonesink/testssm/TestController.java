package com.alonesink.testssm;

/*
* Created by  WangDi  on 2017/9/14 0014
*/

import com.alonesink.entity.User;
import com.alonesink.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    //@Autowired根据类型匹配(spring提供)
    //@Resource根据名称匹配(j2ee提供)
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/mapping0")
    public String requestMapping0(User user, Model model){

        if(userService.doLogin(user)){
            return "success";
        }else {
            return "fail";
        }
    }

    /*
    @RequestMapping为value的格式进行传递路径,可以写为(/mapping1)
    @ResponseBody是将返回的对象以适当的转换器转换为指定格式，写入到response对象的body区，
    使用此注解之后，不再走视图解析器，而是直接写到输入流中，等同于response对象输出指定格式的数据
    */
    @RequestMapping(value = "/mapping1")
    @ResponseBody
    public String requestMapping1(){

        Map<String,Object> map = new HashMap<>();
        map.put("name","zhangsan");
        return "这里是返回定义的一个map对象：" + map;
    }

    /*
    @PathVariable可以获取传递过来的参数
    http://localhost:1111/test/mapping2/wangdi
    http://localhost:1111/test/mapping2/${wangdi}(此处将参数隐藏)
    */
    @RequestMapping(value = "/mapping2/{name}",method = RequestMethod.GET)
    @ResponseBody
    public String requestMapping2(@PathVariable String name){

        Person p = new Person("wangdi",25,true);
        Person p1 = new Person("zhaoyun",22,false);
        List<Object> list = new ArrayList<>();
        List<Object> list1 = new ArrayList<>();
        Map<String,Object> map1 = new HashMap<String,Object>();
        map1.put("对象",p);
        list.add(map1);
        list.add(p);
        list1.add(map1);
        list1.add(p1);
        switch (name){
            case "wangdi":
                return "这是一个wangdi对象：" + list;
            case "zhaoyun":
                return "这是一个zhao对象：" + list1;
            default:
                return "这是一个位置对象：" + list1;
        }

    }

}
