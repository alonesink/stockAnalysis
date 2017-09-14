package com.alonesink.bean;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/*
* Created by  WangDi  on 2017/9/7 0007
*/
public class TestPerson {

    @Resource
    private Person person;

    public String getPersonName(){

        person.setName("zhangsan");
        return person.getName();
    }
}
