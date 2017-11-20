package test.dao;

import test.entity.UserWithBLOBs;

public interface UserMapper {
    int insert(UserWithBLOBs record);

    int insertSelective(UserWithBLOBs record);
}