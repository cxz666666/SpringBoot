package com.data;

import com.data.util.MyQuque;

import java.util.Stack;

/**
 * @PackageName: com.data
 * @ClassName: TestMyStack
 * @Description: 测试队列
 * @author: cxz
 * @date 2019/12/9 17:09
 */
public class TestMyQuque {

    public static void main(String[] args) {
        MyQuque quque = new MyQuque();
        quque.add(9);
        quque.add(8);
        System.out.println(quque.poll());
        quque.add(7);
        System.out.println(quque.poll());
    }
}
