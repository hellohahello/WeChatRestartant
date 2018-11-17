package com.imooc.VO;

import lombok.Data;

/**
 * @author 学好java才能娶到徐邵丽
 * @create 2018-11-02 9:40
 * @desc
 * @Version 1.0
 **/
@Data
public class ResultVo<T> {
    private Integer code;
    private String message;
    private T data;
}
