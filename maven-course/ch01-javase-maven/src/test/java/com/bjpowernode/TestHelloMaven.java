package com.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @PROJECT_NAME: maven-course
 * @className: TestHelloMaven
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-11-30 23:05
 **/

public class TestHelloMaven {
    @Test
    public void testAdd(){
        System.out.println("===testAdd 测试Addd方法===");
        HeelloMaven hello = new HeelloMaven();
        int res = hello.add(10, 20);
        //判断结果是否正确
        Assert.assertEquals(30,res);
    }
     @Test
    public void testAdd2(){
        System.out.println("222===testAdd 测试Addd方法===");
        HeelloMaven hello = new HeelloMaven();
        int res = hello.add(10, 20);
        Assert.assertEquals(30,res);
    }

}
