package com.imooc.repository;

import com.imooc.entity.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterDaoTest {
@Autowired
private OrderMasterDao orderMasterDao;
final String OPENID="953614398";
    @Test
    public void findByBuyerOpenid() {
    /*根据openId*/
        PageRequest pageRequest=new PageRequest(0,2);
        Page<OrderMaster> page = orderMasterDao.findByBuyerOpenid(OPENID, pageRequest);
        System.out.println(page.getTotalElements());
    }
}