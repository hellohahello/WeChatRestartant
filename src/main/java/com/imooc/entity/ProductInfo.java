package com.imooc.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 学好java才能娶到徐邵丽
 * @create 2018-11-12 19:23
 * @desc 商品信息表
 * @Version 1.0
 **/
@Entity
@Data
@Table(name = "product_info")
@DynamicUpdate
//动态更新时间
public class ProductInfo {
    @Id
//    主键ID
    private String productId;
//    产品名称
    private String productName;
//    产品价格
    private BigDecimal productPrice;
//    库存
    private  Integer productNum;
//    描述
    private String productDesc;
//    图片
    @Column(name = "product_icon")
    private  String productIcon;
//    类目编号
    private Integer categoryType;
//    商品状态
    private  int productStatus;
//    创建时间
    private Date createTime;
//    更新时间
    private  Date updateTime;
}
