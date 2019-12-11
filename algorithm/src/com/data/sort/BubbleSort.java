package com.data.sort;

import java.util.Arrays;

/**
 * @PackageName: com.data.sort
 * @ClassName: BubbleSort
 * @Description: 冒泡排序
 * @author: cxz
 * @date 2019/12/11 16:19
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 2, 9, 4, 1, 0, 5, 7};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //arr[i] 大于 arr[j] 为升序排列,否则降序排列
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
