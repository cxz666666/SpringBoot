package com.data;

import com.data.tree.ArrayBinaryTree;

/**
 * @PackageName: com.data
 * @ClassName: TestArrayBinaryTree
 * @Description: 测试顺序存储二叉树
 * @author: cxz
 * @date 2019/12/23 16:15
 */
public class TestArrayBinaryTree {
    public static void main(String[] args) {
        int[] data = new int[] {1,2,3,4,5,6,7};
        ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(data);
        //前序遍历
        arrayBinaryTree.frontShow();
    }
}
