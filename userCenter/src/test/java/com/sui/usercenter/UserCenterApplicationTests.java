package com.sui.usercenter;

import com.sui.usercenter.mapper.UserMapper;
import com.sui.usercenter.model.User;
import jakarta.annotation.Resource;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = UserCenterApplication.class)
class UserCenterApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null); //查询所有用户
        Assert.assertEquals(5, userList.size()); //断言查询结果数量为5
        userList.forEach(System.out::println); //打印查询结果
    }

}
