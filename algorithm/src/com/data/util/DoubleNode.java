package com.data.util;

/**
 * @PackageName: com.data.util
 * @ClassName: DoubleNode
 * @Description: 双向链表
 * @author: cxz
 * @date 2019/12/10 15:45
 */
public class DoubleNode {

    //上一个节点
    DoubleNode pre = this;
    //下一个节点
    DoubleNode next = this;
    //节点内容
    int data;

    public DoubleNode(int data) {
        this.data = data;
    }

    //插入节点
    public void after(DoubleNode node){
        //原来的下一个节点
        DoubleNode nextNext = next;
        //把新节点作为当前节点的下一个节点
        this.next = node;
        //把当前节点作为新节点的前一个节点
        node.pre = this;
        //让原来的下一个节点作为新节点的下一个节点
        node.next = nextNext;
        //让原来的下一个节点的上一个节点为新节点
        nextNext.pre = node;
    }

    //获取下一个节点
    public DoubleNode next(){
        return this.next;
    }

    //获取上一个节点
    public DoubleNode pre(){
        return this.pre;
    }

    //获取数据
    public int getData(){
        return this.data;
    }
}
