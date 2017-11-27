package com.alonesink.dao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.alonesink.entity.User;

@Repository
public interface UserDao{

    List<User> selectId(String username);

    int insert(User user);
}
