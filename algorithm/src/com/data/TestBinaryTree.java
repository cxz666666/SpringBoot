package com.data;

import com.data.tree.BinaryTree;
import com.data.tree.TreeNode;

/**
 * @PackageName: com.data
 * @ClassName: TestBinaryTree
 * @Description: 测试二叉树
 * @author: cxz
 * @date 2019/12/23 10:07
 */
public class TestBinaryTree {
    public static void main(String[] args) {
        //创建树
        BinaryTree binaryTree = new BinaryTree();
        //创建一个根节点
        TreeNode root = new TreeNode(1);
        //把根节点赋给树
        binaryTree.setRoot(root);
        //创建左节点
        TreeNode rootL = new TreeNode(2);
        //把新创建的节点设置为根节点的子节点
        root.setLeftNode(rootL);
        //创建右节点
        TreeNode rootR = new TreeNode(3);
        root.setRightNode(rootR);
        //为第二层的左节点创建两个节点
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        //为第二层的右节点创建两个节点
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
        //遍历树
        //前序遍历
        binaryTree.frontShow();
        System.out.println("=======================");
        //中序遍历
        binaryTree.midShow();
        System.out.println("=======================");
        //后序遍历
        binaryTree.afterShow();
        System.out.println("=======================");
        //前序查找
        TreeNode result = binaryTree.frontSearch(5);
        System.out.println(result);
        //删除一个子树
        binaryTree.delete(1);
        System.out.println("=======================");
        binaryTree.frontShow();
    }
}
