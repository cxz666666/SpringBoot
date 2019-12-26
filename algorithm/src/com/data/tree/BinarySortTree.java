package com.data.tree;

/**
 * @PackageName: com.data.tree
 * @ClassName: BinarySortTree
 * @Description: 二叉排序树
 * @author: cxz
 * @date 2019/12/26 15:14
 */
public class BinarySortTree {
    BinarySortNode root;

    /**
     * 添加
     * @param node
     */
    public void add(BinarySortNode node) {
        //如果是一颗空树
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    /**
     * 中序遍历二叉树
     */
    public void midShow(){
        if (root != null) {
            root.midShow(root);
        }
    }

    /**
     * 节点的查找
     * @param value
     * @return
     */
    public BinarySortNode search(int value) {
        if (root == null){
            return null;
        }
        return root.search(value);
    }

    /**
     * 删除节点
     * @param value
     */
    public void delete(int value){
        if (root == null) {
            return;
        } else {
            //找到这个节点
            BinarySortNode target = search(value);
            if (target == null) {
                return;
            }
            //找到他的父节点
            BinarySortNode parent = searchParent(value);
            //要删除的节点是叶子节点
            if (target.left == null && target.right == null) {
                //要删除的节点是父节点的左子节点
                if (parent.left.value == value) {
                    parent.left = null;
                } else {//要删除的节点是父节点的右子节点
                    parent.right = null;
                }
            } else if (target.left != null && target.right != null) { //要删除的节点有两个子节点

            } else { //要删除的节点有一个左子节点或右子节点
                //有左子节点
                if (target.left != null) {
                    //要删除的节点是父节点的左子节点
                    if (parent.left.value == value) {
                        parent.left = target.left;
                    } else { //要删除的节点是父节点的右子节点
                        parent.right = target.left;
                    }
                } else {
                    //要删除的节点是父节点的左子节点
                    if (parent.left.value == value) {
                        parent.left = target.right;
                    } else { //要删除的节点是父节点的右子节点
                        parent.right = target.right;
                    }
                }
            }
        }
    }

    /**
     * 搜索父节点
     * @param value
     * @return
     */
    public BinarySortNode searchParent(int value) {
        if (root == null) {
            return null;
        } else {
            return root.searchParent(value);
        }
    }
}
