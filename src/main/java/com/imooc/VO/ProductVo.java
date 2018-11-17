package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author 学好java才能娶到徐邵丽
 * @create 2018-11-02 9:47
 * @desc    商品详情(包含类目)
 * @Version 1.0
 **/
@Data
public class ProductVo {
    @JsonProperty("name")
    private String productName;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("foods")
    private List<ProductInfoVo> productFoods;
}
