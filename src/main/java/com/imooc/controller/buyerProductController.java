package com.imooc.controller;

import com.imooc.VO.ProductInfoVo;
import com.imooc.VO.ProductVo;
import com.imooc.VO.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * @author
 * @create 2018-11-02 9:43
 * @desc
 * @Version 1.0
 **/
@Controller
@RequestMapping("/buyer/product")
public class buyerProductController {
    @Autowired
    private
    @RequestMapping("/list")
    @ResponseBody
    ResultVo iphone(){
        //查询所有的上架商品

        //类目一次性


        //数据拼装


        ResultVo resultVo=new ResultVo();
        ProductVo productVo=new ProductVo();
        ProductInfoVo pv=new ProductInfoVo();
        productVo.setProductFoods(Arrays.asList(pv));
        resultVo.setCode(0);
        resultVo.setMessage("没毛病");
        resultVo.setData(Arrays.asList(productVo));
        return resultVo;
    }
}
