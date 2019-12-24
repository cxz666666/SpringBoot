package com.data.tree;

/**
 * @PackageName: com.data.tree
 * @ClassName: BinaryTree
 * @Description: 线索二叉树
 * @author: cxz
 * @date 2019/12/23 10:06
 */
public class ThreadedBinaryTree {
    ThreadedTreeNode root;
    //用于临时存储前驱节点
    ThreadedTreeNode pre = null;

    //遍历线索二叉树
    public void threadIterate(){
        //用于临时存储当前遍历节点
        ThreadedTreeNode node = root;
        while (node!=null) {
            //循环找到最开始的节点
            while (node.leftType==0) {
                node=node.leftNode;
            }
            //打印当前节点的值
            System.out.println(node.value);
            //如果当前节点的右指针指向的是后继节点，可能后继节点还有后继节点
            while (node.rightType==1){
                node=node.rightNode;
                System.out.println(node.value);
            }
            //替换遍历的节点
            node=node.rightNode;
        }
    }

    //获取根节点
    public ThreadedTreeNode getRoot() {
        return root;
    }

    //设置根节点
    public void setRoot(ThreadedTreeNode root) {
        this.root = root;
    }

    //中序线索化二叉树
    public void threadNodes(){
        threadNodes(root);
    }
    public void threadNodes(ThreadedTreeNode node){
        //如果当前节点为null，直接返回
        if (node == null) {
            return;
        }
        //处理左子树
        threadNodes(node.leftNode);
        //处理前驱节点
        if (node.leftNode==null) {
            //让当前节点的左指针指向前驱节点
            node.leftNode = pre;
            //改变当前节点左指针的类型
            node.leftType=1;
        }
        //处理前驱节点的右指针，如果前驱节点的右指针是null（没有指向右子树）
        if (pre!=null && pre.rightNode==null){
            //让前驱节点的右指针指向当前节点
            pre.rightNode=node;
            //改变一下前驱节点的右指针类型
            pre.rightType=1;
        }
        //每处理一个节点，当前节点是下一个节点的前驱节点
        pre = node;
        //处理右子树
        threadNodes(node.rightNode);
    }

    public void frontShow() {
        if (root != null) {
            root.frontShow();
        }
    }

    public void midShow() {
        if (root != null) {
            root.midShow();
        }
    }

    public void afterShow() {
        if (root != null) {
            root.afterShow();
        }
    }

    public ThreadedTreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }

    public void delete(int i) {
        if (root.value == i) {
            root = null;
        } else {
            root.delete(i);
        }
    }
}
