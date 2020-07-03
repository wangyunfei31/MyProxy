package com.wyf.test;

import com.wyf.dao.UserDao;
import com.wyf.dao.UserDaoImpl;
import com.wyf.invoke.InvokeHandle;
import com.wyf.util.ProxyUtil;

/**
 * @Author 12803
 * @Date 2020/7/3 17:19
 */
public class UserDaoProxyTest {

    public static void main(String[] args) {
        UserDao userDao = (UserDao) ProxyUtil.newInstance(new UserDaoImpl(), new InvokeHandle() {
            @Override
            public void invoke() {
                System.out.println("我是新的invoke");
            }
        });
        userDao.queryUser();

    }
}
