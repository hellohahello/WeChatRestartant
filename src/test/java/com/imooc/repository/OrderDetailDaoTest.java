package com.imooc.repository;

import com.imooc.entity.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailDaoTest {
@Autowired
private OrderDetailDao orderDetailDao;
    @Test
    public void findByOrderId() {
        List<OrderDetail> list = orderDetailDao.findByOrderId("2388231542156719019");
        System.out.println(list.get(0));
        int size = list.size();
        System.out.println(size);
        Assert.assertNotEquals(null,list.get(0));
    }
}