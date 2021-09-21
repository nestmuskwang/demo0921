package com.atjin.mybatis_plus_demo0921.mapper;

import com.atjin.mybatis_plus_demo0921.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author wangshuguang
 * @Date 2021/9/21 10:00
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

}
