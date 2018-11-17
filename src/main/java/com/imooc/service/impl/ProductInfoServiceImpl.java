package com.imooc.service.impl;

import com.imooc.dto.CartDto;
import com.imooc.entity.ProductInfo;
import com.imooc.repository.ProductInfoDao;
import com.imooc.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 学好java才能娶到徐邵丽
 * @create 2018-11-12 20:02
 * @desc
 * @Version 1.0
 **/
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoDao productInfoDao;
    @Override
//    根据id查询单个
    public ProductInfo findOne(String id) {
        return productInfoDao.findOne(id);
    }

//    查询全部并分页/
    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        PageRequest pageRequest=new PageRequest(0,2);
        return productInfoDao.findAll(pageRequest);
    }

    @Override
    public List<ProductInfo> findAll() {
        return productInfoDao.findAll();
    }


    @Override
//    插入数据
    public ProductInfo save(ProductInfo productInfo) {
     return productInfoDao.save(productInfo);
    }

    @Override
    public List<ProductInfo> findUpAll(Integer integer) {
        return productInfoDao.findByProductStatusIn(integer);
    }

    @Override
    public void deleteStock(List<CartDto> cartDtoList) {
        for (CartDto cartDto : cartDtoList) {
            String productId = cartDto.getProductId();
            ProductInfo productInfo = productInfoDao.findOne(productId);
//        商品表库存减去购车库存
          Integer z=  productInfo.getProductNum()-cartDto.getProductQuantity();
            if (z<0||z==0){
                try {
                    throw new Exception("库存不足");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                productInfo.setProductNum(z);
                productInfoDao.save(productInfo);
            }
        }
    }




}
