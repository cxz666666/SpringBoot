package com.data;

import com.data.tree.BinarySortNode;
import com.data.tree.BinarySortTree;

/**
 * @PackageName: com.data
 * @ClassName: TestBinarySortTree
 * @Description: 测试二叉排序树
 * @author: cxz
 * @date 2019/12/26 16:34
 */
public class TestBinarySortTree {
    public static void main(String[] args) {
        int[] arr = new int[]{7,3,10,12,5,1,9};
        //创建树
        BinarySortTree binarySortTree = new BinarySortTree();
        //循环添加
        for (int i : arr) {
            binarySortTree.add(new BinarySortNode(i));
        }
        //查看树中值
        binarySortTree.midShow();
        //查找
        System.out.println(binarySortTree.search(10).getValue());
        System.out.println(binarySortTree.search(20));
        System.out.println("==================");
        //删除叶子节点
        binarySortTree.delete(12);
        binarySortTree.midShow();
        System.out.println("==================");
        //删除只有一个子节点的节点
        binarySortTree.delete(10);
        binarySortTree.midShow();
    }
}
