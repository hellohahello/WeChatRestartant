package com.imooc.dto;

import com.imooc.entity.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author 往日云烟
 * @create 2018-11-14 19:36
 * @desc
 * @Version 1.0
 **/
@Data
public class OrderDto {
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
    private Integer orderStatus;
    //    支付状态---默认0未支付
    private Integer payStatus;
    //    创建时间
    private Date createTime;
    //    修改时间
    private Date updateTime;

//    订单详情集合
    private List<OrderDetail> orderDetailList;
}
