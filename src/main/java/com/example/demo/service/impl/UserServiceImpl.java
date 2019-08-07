package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Auth wujinjuan
 * @Date 2019/8/7 10:25
 * @Version 1.0
 **/
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> listUser() {
        List<User> userList = new ArrayList<>();
        User zhangsan = new User();
        zhangsan.setName("张三");
        zhangsan.setAge(18);
        userList.add(zhangsan);
        return userList;
    }

}
