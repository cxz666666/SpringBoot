package com.data;

import com.data.util.Node;

/**
 * @PackageName: com.data
 * @ClassName: TestNode
 * @Description: 测试单链表
 * @author: cxz
 * @date 2019/12/10 10:18
 */
public class TestNode {

    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.append(n2).append(n3).append(new Node(4));
        n1.show();
        n1.next().after(new Node(5));
        n1.show();
//        n1.next().removeNext();
//        n1.show();
//        System.out.println(n1.next().next().getData());
    }
}
