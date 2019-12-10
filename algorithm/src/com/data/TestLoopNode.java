package com.data;

import com.data.util.LoopNode;

/**
 * @PackageName: com.data
 * @ClassName: TestLoopNode
 * @Description: 测试循环链表
 * @author: cxz
 * @date 2019/12/10 15:36
 */
public class TestLoopNode {
    public static void main(String[] args) {
        LoopNode loopNode1 = new LoopNode(1);
        LoopNode loopNode2 = new LoopNode(2);
        LoopNode loopNode3 = new LoopNode(3);
        LoopNode loopNode4 = new LoopNode(4);
        loopNode1.after(loopNode2);
        loopNode2.after(loopNode3);
        loopNode3.after(loopNode4);
//        loopNode4.after(loopNode1);
        System.out.println(loopNode1.next().getData());
        System.out.println(loopNode2.next().getData());
        System.out.println(loopNode3.next().getData());
        System.out.println(loopNode4.next().getData());
    }
}
