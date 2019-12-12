package com.data.sort;

import java.util.Arrays;

/**
 * @PackageName: com.data.sort
 * @ClassName: ShellSort
 * @Description: 希尔排序
 * @author: cxz
 * @date 2019/12/12 16:18
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 2, 9, 4, 1, 0, 5, 7};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {
        //遍历所有步长
        for (int d = arr.length/2; d > 0; d/=2){
            //遍历步长中的所有元素
            for (int i = d; i < arr.length; i++) {
                //遍历本组中所有元素
                for (int j = i - d; j >= 0; j-=d){
                    //如果当前元素大于加上步长后的那个元素
                    if (arr[j] > arr[j + d]) {
                        int temp = arr[j];
                        arr[j] = arr[j + d];
                        arr[j + d] = temp;
                    }
                }
            }
        }
    }
}
