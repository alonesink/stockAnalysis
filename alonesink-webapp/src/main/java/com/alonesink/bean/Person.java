package com.alonesink.bean;

/*
* Created by  WangDi  on 2017/9/7 0007
*/

import org.springframework.stereotype.Service;

@Service("p1")
public class Person {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
