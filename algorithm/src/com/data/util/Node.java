package com.data.util;

/**
 * @PackageName: com.data.util
 * @ClassName: Node
 * @Description: 单链表
 * @author: cxz
 * @date 2019/12/10 10:03
 */
public class Node {
    //此节点存储内容
    int data;
    //下一个节点
    Node next;

    public Node(int data) {
        this.data = data;
    }

    //追加节点
    public Node append(Node node) {
        //当前节点
        Node currentNode = this;
        while (true) {
            //取出下一个节点
            Node nextNode = currentNode.next;
            //如果下一个节点为空跳出循环
            if (nextNode == null) {
                break;
            }
            //不为空继续将下一个节点的值赋给当前节点
            currentNode = nextNode;
        }
        //将当前节点的值赋给当前节点的下一个节点
        currentNode.next = node;
        return this;
    }

    //删除下一个节点
    public void removeNext(){
        //获取当前节点的下下个节点
        Node newNode = this.next.next;
        //将下下个节点赋值给当前节点的next
        next = newNode;
    }

    //获取下一个节点
    public Node next(){
        return this.next;
    }

    //获取节点中的数据
    public int getData(){
        return this.data;
    }

    //当前节点是否为最后一个节点
    public boolean isLast(){
        return next == null;
    }

    //显示所有节点信息
    public void show(){
        Node currentNode = this;
        while (true) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
            if (currentNode == null){
                break;
            }
        }
    }

    //插入一个节点作为当前节点的下一个节点
    public void after(Node node) {
        //取出下一个节点,作为下下个节点
        Node nextNext = next;
        //把新节点作为当前节点的下一个节点
        this.next = node;
        //把下下个节点设置为新节点的下一个节点
        node.next = nextNext;
    }
}
