package com.bjpowernode;

/**
 * @PROJECT_NAME: maven-course
 * @className: HeelloMaven
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-11-30 23:00
 **/

public class HeelloMaven {
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public static void main(String[] args) {
        HeelloMaven hello = new HeelloMaven();
        int res = hello.add(10, 20);
        System.out.println("10+20=" + res);
    }
}
