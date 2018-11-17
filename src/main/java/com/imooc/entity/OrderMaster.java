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
 * @create 2018-11-14 18:08
 * @desc
 * @Version 1.0
 **/
@Entity
@Table(name = "order_master")
@DynamicUpdate
@Data
public class OrderMaster {
//    订单ID
    @Id
    private String orderId;
//    买家姓名
    private String buyerName;
//    卖家电话
    private String buyerPhone;
//    买家地址
    private String buyerAddress;
//    openId
    private String buyerOpenid;
//    订单金额
    private BigDecimal orderAmount;
//    订单状态---默认0新订单
    private Integer orderStatus=OrderStatusEnum.NEW.getCode();
//    支付状态---默认0未支付
    private Integer payStatus=PayStatusEnum.NO_PAY.getCode();
//    创建时间
    private Date createTime;
//    修改时间
    private Date updateTime;
}
