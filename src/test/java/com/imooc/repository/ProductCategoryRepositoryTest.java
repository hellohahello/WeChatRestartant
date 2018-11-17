package com.imooc.repository;

import com.imooc.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
@Autowired
private ProductCategoryRepository productCategoryRepository;
    @Test
    public void test1(){
        ProductCategory productCategory = productCategoryRepository.findOne(1);
        System.out.println(productCategory.toString());
    }
    @Test
    public void add(){
        ProductCategory productCategory=new ProductCategory("天龙八部",666);
       productCategoryRepository.save(productCategory);
        Assert.assertNotNull(productCategory);
    }
}