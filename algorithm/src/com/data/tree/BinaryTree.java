package com.data.tree;

/**
 * @PackageName: com.data.tree
 * @ClassName: BinaryTree
 * @Description: 二叉树
 * @author: cxz
 * @date 2019/12/23 10:06
 */
public class BinaryTree {
    TreeNode root;

    //获取根节点
    public TreeNode getRoot() {
        return root;
    }

    //设置根节点
    public void setRoot(TreeNode root) {
        this.root = root;
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

    public TreeNode frontSearch(int i) {
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
