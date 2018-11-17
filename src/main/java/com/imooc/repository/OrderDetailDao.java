package com.imooc.repository;

import com.imooc.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 往日云烟
 * @create 2018-11-14 18:56
 * @desc
 * @Version 1.0
 **/
/*订单详情dao*/
public interface OrderDetailDao extends JpaRepository<OrderDetail,String> {
//    根据id查询订单
//    每个订单id可能对应多个详情(如购物车有多个商品)
    List<OrderDetail> findByOrderId(String number);
}
