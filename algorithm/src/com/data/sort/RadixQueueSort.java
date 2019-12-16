package com.data.sort;

import com.data.util.MyQuque;

import java.util.Arrays;

/**
 * @PackageName: com.data.sort
 * @ClassName: RadixSort
 * @Description: 基数排序 队列实现
 * @author: cxz
 * @date 2019/12/16 16:13
 */
public class RadixQueueSort {

    public static void main(String[] args) {
//        int[] arr = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] arr = new int[]{23, 6, 189, 45, 9, 287, 56, 1, 798, 34, 65, 652, 5};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int[] arr) {
        //存数组中最大的数字
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //计算最大数字是几位数
        int maxLength = String.valueOf(max).length();
        //用于临时存储数据的队列的数组
        MyQuque[] temp = new MyQuque[10];
        //为队列数组赋值
        for (int i = 0; i < temp.length; i++) {
            temp[i] = new MyQuque();
        }
        //根据最大长度决定比较次数
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            //把每一个数字分别计算余数
            for (int j = 0; j < arr.length; j++) {
                //计算余数
                int ys = arr[j] / n % 10;
                //把当前遍历的数据放入指定的数组中
                temp[ys].add(arr[j]);
            }
            //记录取出的元素需要放的位置
            int index = 0;
            //把所有队列中的数字取出来
            for (int k = 0; k < temp.length; k++) {
                //循环取出元素
                while (!temp[k].isEmpty()) {
                    //取出元素
                    arr[index] = temp[k].poll();
                    //记录下一个位置
                    index++;
                }
            }
        }
    }

}
