package com.imooc.service;

import com.imooc.entity.ProductCategory;

import java.util.List;

/**
 * @author 学好java才能娶到徐邵丽
 * @create 2018-11-12 20:27
 * @desc
 * @Version 1.0
 **/
public interface ProductCategoryService {
//    根据编号查询类目集合
    List<ProductCategory> findByCategoryType(List<Integer> list);
    //根据ID查询类目
    ProductCategory findOne(Integer id);
    //    查询全部类目
    List<ProductCategory> findAll();
    //    保存
    ProductCategory save(ProductCategory productCategory);
}
