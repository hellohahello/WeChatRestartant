package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 学好java才能娶到徐邵丽
 * @create 2018-11-02 10:11
 * @desc
 * @Version 1.0
 **/
@Data
public class ProductInfoVo {
    @JsonProperty("id")
    private Integer productId;
    @JsonProperty("name")
    private String productName;
    @JsonProperty("price")
    private BigDecimal productPrice;
    @JsonProperty("description")
    private  String productDesc;
    @JsonProperty("icon")
    private String productIcon;
}
