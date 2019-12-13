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
        int[] arr = new int[]{5, 3, 2, 9, 4, 1, 0, 6, 8, 7, 5};
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
            int stard = arr[start];
            int low = start;
            int high = end;
            while (high > low) {
                //stard <= arr[high],排序的数组中有相同数时必须加上等于号否则不成功
                while (high > low && stard <= arr[high]) {
                    high--;
                }
                arr[low] = arr[high];
                while (high > low && stard > arr[low]) {
                    low++;
                }
                arr[high] = arr[low];
                arr[low] = stard;
            }
            quickSort(arr, start, low);
            quickSort(arr, low + 1, end);
        }

//        if (start < end) {
//            //获取基准数
//            int stard = arr[start];
//            //开始值
//            int low = start;
//            int high = end;
//            while (low < high) {
//                while (low < high && stard <= arr[high]) {
//                    high--;
//                }
//                arr[low] = arr[high];
//                while (low < high && stard > arr[low]) {
//                    low++;
//                }
//                arr[high] = arr[low];
//                arr[low] = stard;
//            }
//            quickSort(arr, start, low);
//            quickSort(arr, low + 1, end);
//        }
//        if (start < end) {
//            //把数组中的第0个作为标准数
//            int stard = arr[start];
//            //记录需要排序的下标
//            int low = start; //低
//            int high = end; //高
//            //循环找比标准数大的数和比标准数小的数
//            while (low < high) {
//                //右边的数字比标准数大
//                while (low < high && stard <= arr[high]) {
//                    high--;
//                }
//                //使用右边的数字替换左边的数
//                arr[low] = arr[high];
//                //如果左边的数字比标准数小
//                while (low < high && arr[low] < stard) {
//                    low++;
//                }
//                //使用左边的数字替换右边的数字
//                arr[high] = arr[low];
//                //把标准数赋给低所在的位置
//                arr[low] = stard;
//            }
//            //处理所有小的数字
//            quickSort(arr, start, low);
//            //处理所有大的数字
//            quickSort(arr, low + 1, end);
//        }
    }
}
