package com.alonesink.service.impl;

import com.alonesink.dao.UserDao;
import com.alonesink.entity.User;
import com.alonesink.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("testService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean doLogin(User user) {

        List<User> userList = userDao.selectId(user.getUsername());

        if(userList.size() == 0){
            System.out.println("没有值");
            return false;
        }else {

            if(userList.get(0).getPassword().equals(user.getPassword())){

                return true;
            }else{
                System.out.println("密码不符合");
                return false;
            }
        }
    }

    public List<User> getPassword(String username){

        return userDao.selectId(username);
    }
}
