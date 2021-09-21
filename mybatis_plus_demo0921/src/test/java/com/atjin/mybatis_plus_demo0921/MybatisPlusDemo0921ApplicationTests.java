package com.atjin.mybatis_plus_demo0921;

import com.atjin.mybatis_plus_demo0921.entity.UserEntity;
import com.atjin.mybatis_plus_demo0921.mapper.UserMapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
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
    void selectPage() {
        Page<UserEntity> page = new Page<>(1,3);
        Page<UserEntity> userEntityPage = userMapper.selectPage(page, null);
        System.out.println(userEntityPage.getCurrent());
        System.out.println(userEntityPage.getRecords());
    }

    @Test
    void logicDelete() {
        userMapper.deleteById(1440196619776532482L);
    }

    @Test
    void queryWrapper() {
        QueryWrapper<UserEntity>  wrapper = new QueryWrapper();
        //wrapper
    }

}
