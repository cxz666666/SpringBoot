package com.data.sort;

import java.util.Arrays;

/**
 * @PackageName: com.data.sort
 * @ClassName: InsertSort
 * @Description: 直接插入排序
 * @author: cxz
 * @date 2019/12/12 15:37
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 2, 9, 4, 1, 0, 6, 8, 7};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
       for (int i = 1; i < arr.length; i++) {
           if (arr[i] < arr[i - 1]){
               int temp = arr[i];
               int j;
               for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                   arr[j + 1] = arr[j];
//                   arr[j] = temp;
//                   int z = arr[j];
//                   arr[j] = arr[j + 1];
//                   arr[j + 1] = z;
               }
               arr[j + 1] = temp;
           }
       }
//        //遍历所有数字
//        for (int i = 1; i < arr.length; i++) {
//            //如果当前数字比前一个数字小
//            if (arr[i] < arr[i - 1]) {
//                //把当前遍历数字存起来
//                int temp = arr[i];
//                int j;
//                //遍历当前数字前的所有数字
//                for (j = i - 1; j >= 0&&temp < arr[j]; j--){
//                    //把前一个数字赋给后一个数字
//                    arr[j + 1] = arr[j];
//                }
//                //把临时变量(外层for循环的当前元素)赋给不满足条件的最后一个元素
//                arr[j + 1] = temp;
//            }
//        }
    }
}
