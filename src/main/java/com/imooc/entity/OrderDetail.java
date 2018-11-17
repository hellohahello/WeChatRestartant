package com.imooc.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 往日云烟
 * @create 2018-11-14 18:22
 * @desc
 * @Version 1.0
 **/
@Data
@DynamicUpdate
@Entity
@Table(name = "order_detail")
public class OrderDetail {
//    订单详情id
    @Id
    private String detailId;
//    订单id
    private String orderId;
//    商品id
    private String productId;
//    商品名称
    private String productName;
//    商品价格
    private BigDecimal productPrice;
//    图片
    private String productIcon;
//    数量
    private Integer productQuantity;
//    创建时间
    private Date createTime;
//    更新时间
    private Date updateTime;
}
