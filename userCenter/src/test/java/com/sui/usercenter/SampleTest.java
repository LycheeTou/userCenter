package com.sui.usercenter;

import com.sui.usercenter.mapper.UserMapper;
import com.sui.usercenter.model.User;

import jakarta.annotation.Resource;
import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


//@SpringBootTest(classes = UserCenterApplication.class)
@SpringBootTest
@RunWith(SpringRunner.class)
public class SampleTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals("用户列表大小应该为5", 5, userList.size());
        userList.forEach(System.out::println);
    }
}