package com.ybq.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteById(@Param("userId") int userId);
}
