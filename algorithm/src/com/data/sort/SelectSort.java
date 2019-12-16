package com.data.sort;

import java.util.Arrays;

/**
 * @PackageName: com.data.sort
 * @ClassName: SelectSort
 * @Description: 选择排序
 * @author: cxz
 * @date 2019/12/16 9:41
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 2, 9, 4, 1, 0, 6, 8, 7};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        //遍历所有的数
        for (int i = 0; i < arr.length; i++){
            int minIndex = i;
            //把当前遍历的数和后面所有的数进行依次比较, 并记录下最下的数的下标
            for (int j = i + 1; j < arr.length; j++) {
                //如果后面比较的数比记录的最下的数小
                if (arr[minIndex] > arr[j]) {
                    //记录下最下的那个数的下标
                    minIndex = j;
                }
            }
            //如果最小数和当前遍历数的下标不一致, 说明下标为minIndex的数比当前遍历的数更小
            if (minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

}
