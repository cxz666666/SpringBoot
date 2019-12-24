package com.data;

import com.data.tree.ThreadedBinaryTree;
import com.data.tree.ThreadedTreeNode;

/**
 * @PackageName: com.data
 * @ClassName: TestBinaryTree
 * @Description: 测试线索二叉树
 * @author: cxz
 * @date 2019/12/23 10:07
 */
public class TestThreadedBinaryTree {
    public static void main(String[] args) {
        //创建树
        ThreadedBinaryTree binaryTree = new ThreadedBinaryTree();
        //创建一个根节点
        ThreadedTreeNode root = new ThreadedTreeNode(1);
        //把根节点赋给树
        binaryTree.setRoot(root);
        //创建左节点
        ThreadedTreeNode rootL = new ThreadedTreeNode(2);
        //把新创建的节点设置为根节点的子节点
        root.setLeftNode(rootL);
        //创建右节点
        ThreadedTreeNode rootR = new ThreadedTreeNode(3);
        root.setRightNode(rootR);
        //为第二层的左节点创建两个节点
        rootL.setLeftNode(new ThreadedTreeNode(4));
        ThreadedTreeNode fiveNode = new ThreadedTreeNode(5);
        rootL.setRightNode(fiveNode);
        //为第二层的右节点创建两个节点
        rootR.setLeftNode(new ThreadedTreeNode(6));
        rootR.setRightNode(new ThreadedTreeNode(7));
        //遍历树
        binaryTree.midShow();
        System.out.println("=======================");
        //中前线索化二叉树
        binaryTree.threadNodes();
        binaryTree.threadIterate();
    }
}
