package com.imooc.service;

import com.imooc.dto.CartDto;
import com.imooc.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author 学好java才能娶到徐邵丽
 * @create 2018-11-12 19:54
 * @desc
 * @Version 1.0
 **/
public interface ProductInfoService {
    //    根据id查询
    ProductInfo findOne(String id);

    //    查询全部并分页
    Page<ProductInfo> findAll(Pageable pageable);

    List<ProductInfo> findAll();

    //    插入保存
    ProductInfo save(ProductInfo productInfo);

    //    查询全部在线商品
    List<ProductInfo> findUpAll(Integer integer);
//    扣库存
    void deleteStock(List<CartDto> cartDtoList);
//    加库存

}
