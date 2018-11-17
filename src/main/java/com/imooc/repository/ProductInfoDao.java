package com.imooc.repository;

import com.imooc.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 学好java才能娶到徐邵丽
 * @create 2018-11-12 19:32
 * @desc 商品信息
 * @Version 1.0
 **/
public interface ProductInfoDao extends JpaRepository<ProductInfo,String> {
//    查询全部在线商品
    List<ProductInfo> findByProductStatusIn(Integer integer);
}
