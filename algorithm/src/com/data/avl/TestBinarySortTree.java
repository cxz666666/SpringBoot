package com.data.avl;


/**
 * @PackageName: com.data.avl
 * @ClassName: TestBinarySortTree
 * @Description: 测试平衡二叉树
 * @author: cxz
 * @date 2019/12/26 16:34
 */
public class TestBinarySortTree {
    public static void main(String[] args) {
//        int[] arr = new int[]{8,9,6,7,5,4};
        int[] arr = new int[]{8,9,5,4,6,7};
        //创建树
        BinarySortTree binarySortTree = new BinarySortTree();
        //循环添加
        for (int i : arr) {
            binarySortTree.add(new BinarySortNode(i));
        }
        //查看高度
        System.out.println(binarySortTree.root.height());
        System.out.println(binarySortTree.root.value);
    }
}
