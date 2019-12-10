package com.data;

import com.data.util.DoubleNode;

/**
 * @PackageName: com.data
 * @ClassName: TestDoubleNode
 * @Description: 测试双向链表
 * @author: cxz
 * @date 2019/12/10 15:59
 */
public class TestDoubleNode {
    public static void main(String[] args){
        DoubleNode doubleNode1 = new DoubleNode(1);
        DoubleNode doubleNode2 = new DoubleNode(2);
        DoubleNode doubleNode3 = new DoubleNode(3);
        doubleNode1.after(doubleNode2);
        doubleNode2.after(doubleNode3);
        System.out.println(doubleNode2.pre().getData());
        System.out.println(doubleNode2.getData());
        System.out.println(doubleNode2.next().getData());
    }
}
