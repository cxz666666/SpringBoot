package com.data.sort;

import java.util.Arrays;

/**
 * @PackageName: com.data.sort
 * @ClassName: QuickSort
 * @Description: 快速排序
 * @author: cxz
 * @date 2019/12/11 16:34
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 2, 9, 4, 1, 0, 5, 7};
        System.out.println(arr.length);
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }

    /**
     * @param arr 需要排序的数组
     * @param start 开始下标
     * @param end 结束下标
     */
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            //把数组中的第0个作为标准数
            int stard = arr[start];
            //记录需要排序的下标
            int low = start; //低
            int high = end; //高
            //循环找比标准数大的数和比标准数小的数
            while (low < high) {
                //右边的数字比标准数大
                while (low < high && stard <= arr[high]) {
                    high--;
                }
                //使用右边的数字替换左边的数
                arr[low] = arr[high];
                //如果左边的数字比标准数小
                while (low < high && arr[low] < stard) {
                    low++;
                }
                //使用左边的数字替换右边的数字
                arr[high] = arr[low];
                //把标准数赋给低所在的位置
                arr[low] = stard;
            }
            //处理所有小的数字
            quickSort(arr, start, low);
            //处理所有大的数字
            quickSort(arr, low + 1, end);
        }
    }
}
