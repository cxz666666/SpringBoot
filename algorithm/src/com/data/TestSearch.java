package com.data;

/**
 * @PackageName: com.data
 * @ClassName: TestSearch
 * @Description: 线性查找
 * @author: cxz
 * @date 2019/12/9 10:37
 */
public class TestSearch {

    public static void main(String[] args){
        //线性查找
        int[] arr = new int[]{1, 8, 5, 6, 3, 8};
        int target = 8;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }

}
