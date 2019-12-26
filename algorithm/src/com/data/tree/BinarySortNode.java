package com.data.tree;

/**
 * @PackageName: com.data.tree
 * @ClassName: BinarySortNode
 * @Description: 二叉排序树节点
 * @author: cxz
 * @date 2019/12/26 15:32
 */
public class BinarySortNode {
    int value;
    BinarySortNode left;
    BinarySortNode right;

    public BinarySortNode(int value) {
        this.value = value;
    }

    /**
     * 向子树添加节点
     *
     * @param node
     */
    public void add(BinarySortNode node) {
        if (node == null) {
            return;
        }
        //判断传入的节点的值比当前子树的根节点的值大还是小
        if (node.value < this.value) {
            //左子节点为空
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.add(node);
            }
        } else {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        }
    }

    /**
     * 中序遍历
     *
     * @param node
     */
    public void midShow(BinarySortNode node) {
        if (node == null) {
            return;
        }
        midShow(node.left);
        System.out.println(node.value);
        midShow(node.right);
    }

    public int getValue() {
        return value;
    }

    /**
     * 查找节点
     * @param value
     * @return
     */
    public BinarySortNode search(int value) {
        if (this.value == value) {
            return this;
        } else if (value < this.value) {
            if (left == null) {
                return null;
            }
            return left.search(value);
        } else {
            if (right == null) {
                return null;
            }
            return right.search(value);
        }
    }

    /**
     * 搜索父节点
     * @param value
     * @return
     */
    public BinarySortNode searchParent(int value) {
        if (this.left != null && this.left.value == value || this.right != null && this.right.value == value){
            return this;
        } else {
            if (value < this.value && this.left != null) {
                return this.left.searchParent(value);
            } else if (value > this.value && this.right != null){
                return this.right.searchParent(value);
            }
            return null;
        }
    }
}
