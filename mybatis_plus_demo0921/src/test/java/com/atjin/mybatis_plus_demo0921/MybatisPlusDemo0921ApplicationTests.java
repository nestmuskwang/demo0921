package com.atjin.mybatis_plus_demo0921;

import com.atjin.mybatis_plus_demo0921.entity.UserEntity;
import com.atjin.mybatis_plus_demo0921.mapper.UserMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusDemo0921ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void findAll() {
        List<UserEntity> userEntities = userMapper.selectList(null);
        userEntities.forEach(en ->{
            System.out.println(en);
        });
    }
    @Test
    void insert() {
        UserEntity userEntity = new UserEntity();
        userEntity.setAge(33);
        userEntity.setName("zhang");
        userEntity.setEmail("zhagn@com");
        int insert = userMapper.insert(userEntity);
        System.out.println(insert);
    }

    @Test
    void update() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1439856232427880449L);
        userEntity.setAge(33);
        userEntity.setName("zhang");
        userEntity.setEmail("zhagn@com");
        int i = userMapper.updateById(userEntity);
        System.out.println(i);
    }
    @Test
    void delete() {

    }
    @Test
    void logicDelete() {

    }
}
