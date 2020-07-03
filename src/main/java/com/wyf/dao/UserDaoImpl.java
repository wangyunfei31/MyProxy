package com.wyf.dao;

/**
 * @Author 12803
 * @Date 2020/7/3 17:17
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void queryUser() {
        System.out.println("查询到用户A");
    }

    @Override
    public void queryUserByName(String name) {
        System.out.println("查询到用户"+name);
    }
}
