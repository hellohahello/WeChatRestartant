package com.imooc.inner;

import lombok.Data;

/**
 * 功能描述:每个内部类都能独立的继承一个接口的实现,无论外部类是否已经继承改接口,对于内部类来说没有影响
 *  @param: []
 * @return: void
 * @auther:学好java才能娶到徐邵丽
 * @date: 2018/11/2 15:31
 */
@Data
public class InnerClass  {
     private String name;
     private Integer age;
    void speak(){

    }
    public InnerClass() {
    }
    class Inner{
        void say(){
            name="李朋";
            age=21;
        }
        InnerClass ret(){
            return InnerClass.this;
        }
    }
    public static void main(String[] args) {
        InnerClass innerClass=new InnerClass();
        InnerClass.Inner inner=innerClass.new Inner();
        inner.ret().setAge(1);
    }
}
