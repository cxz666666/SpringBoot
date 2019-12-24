package com.data.tree;

/**
 * @PackageName: com.data.tree
 * @ClassName: TreeNode
 * @Description: 线索二叉树树节点的值
 * @author: cxz
 * @date 2019/12/23 10:09
 */
public class ThreadedTreeNode {
    //节点的权
    int value;
    //左儿子
    ThreadedTreeNode leftNode;
    //右儿子
    ThreadedTreeNode rightNode;
    //标识指针标识
    int leftType;
    int rightType;
    public ThreadedTreeNode(int value) {
        this.value = value;
    }

    //设置左儿子
    public void setLeftNode(ThreadedTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    //设置右儿子
    public void setRightNode(ThreadedTreeNode rightNode) {
        this.rightNode = rightNode;
    }

    //前序遍历
    public void frontShow() {
        //先遍历当前节点的内容
        System.out.println(value);
        //左节点
        if (leftNode != null) {
            leftNode.frontShow();
        }
        //右节点
        if (rightNode != null) {
            rightNode.frontShow();
        }
    }

    //中序遍历
    public void midShow() {
        //左子节点
        if (leftNode != null) {
            leftNode.midShow();
        }
        //当前节点
        System.out.println(value);
        //右子节点
        if (rightNode != null) {
            rightNode.midShow();
        }
    }

    //后序遍历
    public void afterShow() {
        //左子节点
        if (leftNode != null) {
            leftNode.afterShow();
        }
        //右子节点
        if (rightNode != null) {
            rightNode.afterShow();
        }
        //当前节点
        System.out.println(value);
    }

    public ThreadedTreeNode frontSearch(int i) {
        ThreadedTreeNode target = null;
        //对比当前节点的值
        if (this.value == i) {
            return this;
        } else {
            //左节点
            if (leftNode != null) {
                target = leftNode.frontSearch(i);
            }
            if (target == null) {
                //右节点
                if (rightNode != null) {
                    target = rightNode.frontSearch(i);
                }
            }
        }
        return target;
    }

    //删除一个子树
    public void delete(int i) {
        ThreadedTreeNode parent = this;
        //判断左儿子
        if (parent.leftNode != null && parent.leftNode.value == i) {
            parent.leftNode = null;
            return;
        }
        //判断右儿子
        if (parent.rightNode != null && parent.rightNode.value == i) {
            parent.rightNode = null;
            return;
        }
        //递归删除左儿子
        parent = leftNode;
        if (parent != null) {
            parent.delete(i);
        }
        //递归删除右儿子
        parent = rightNode;
        if (parent != null) {
            parent.delete(i);
        }
    }

    public int getValue() {
        return value;
    }

    public ThreadedTreeNode getLeftNode() {
        return leftNode;
    }

    public ThreadedTreeNode getRightNode() {
        return rightNode;
    }
}
