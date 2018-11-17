package com.imooc.utils;

import java.util.Random;

/**
 * @author 往日云烟
 * @create 2018-11-14 20:00
 * @desc 主键生成工具
 * @Version 1.0
 **/

public class KeyUtil {
    public synchronized static String getKey(){
        Random random=new Random();
        Integer i=random.nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(i);
    }
}
