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
        int[] arr = new int[]{5, 3, 2, 9, 4, 1, 0, 6, 8, 7};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {

//        for (int d = arr.length/2; d > 0; d/=2) {
//            for (int i = arr.length - d; i > 0; i--) {
//                for (int j = i - d; j >= 0; j-=d) {
//                    if (arr[i] < arr[j]) {
//                        int temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                    }
//                }
//            }
//        }

        //步长
//        for (int d = arr.length/2; d > 0; d/=2){
//            for (int i = d; i < arr.length; i++) {
//                for (int j = i - d; j >= 0; j-=d) {
//                    if (arr[j] > arr[j + d]){
//                        int temp = arr[j];
//                        arr[j] = arr[j + d];
//                        arr[j + d] = temp;
//                    }
//                }
//            }
//        }
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
