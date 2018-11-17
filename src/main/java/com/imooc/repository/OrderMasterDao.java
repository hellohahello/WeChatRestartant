package com.imooc.repository;

import com.imooc.entity.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 往日云烟
 * @create 2018-11-14 18:26
 * @desc
 * @Version 1.0
 **/
public interface OrderMasterDao extends JpaRepository<OrderMaster,String> {
//    根据openId查询订单
//    订单分页
    Page<OrderMaster> findByBuyerOpenid(String openId, Pageable pageable);
}
