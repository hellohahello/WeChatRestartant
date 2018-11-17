package com.imooc.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 学好java才能娶到徐邵丽
 * @create 2018-10-30 20:24
 * @desc
 * @Version 1.0
 **/
//与数据库映射
@Entity
@Table(name = "product_category")
@DynamicUpdate  //动态的更新时间
@Data
public class ProductCategory {
    //主键
    @Id
    //自增长
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "category_type")
    private Integer categoryType;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_time")
    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {

        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
