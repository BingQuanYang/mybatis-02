package com.ybq.mybatis.mapper;

import com.ybq.mybatis.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    Order selectOrderByOrderNo(@Param("orderNo") int orderNo);
    List<Order> selectOrderByUserId(@Param("userId") int userId);
}
