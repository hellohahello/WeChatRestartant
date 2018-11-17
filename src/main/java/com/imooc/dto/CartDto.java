package com.imooc.dto;

import lombok.Data;

/**
 * @author 往日云烟
 * @create 2018-11-14 20:12
 * @desc  购物车只有商品id和商品数量
 * @Version 1.0
 **/
@Data
public class CartDto {
    private String productId;
    private Integer productQuantity;

    public CartDto(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}

