package com.data.util;

/**
 * @PackageName: com.data.util
 * @ClassName: Node
 * @Description: 循环链表
 * @author: cxz
 * @date 2019/12/10 10:03
 */
public class LoopNode {
    //此节点存储内容
    int data;
    //下一个节点
    LoopNode next = this;

    public LoopNode(int data) {
        this.data = data;
    }

    //删除下一个节点
    public void removeNext(){
        //获取当前节点的下下个节点
        LoopNode newNode = this.next.next;
        //将下下个节点赋值给当前节点的next
        next = newNode;
    }

    //获取下一个节点
    public LoopNode next(){
        return this.next;
    }

    //获取节点中的数据
    public int getData(){
        return this.data;
    }

    //插入一个节点作为当前节点的下一个节点
    public void after(LoopNode node) {
        //取出下一个节点,作为下下个节点
        LoopNode nextNext = next;
        //把新节点作为当前节点的下一个节点
        this.next = node;
        //把下下个节点设置为新节点的下一个节点
        node.next = nextNext;
    }
}
