package com.data.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: com.data.util
 * @ClassName: ArrayUtil
 * @Description: 数组工具类
 * @author: cxz
 * @date 2019/12/4 16:06
 */
public class ArrayUtil {

    /**
     * 最后插入数组中一元素
     *
     * @param arr
     * @param des
     * @return
     */
    public static int[] addArray(int[] arr, int des) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i == arr.length) {
                newArr[i] = des;
            } else {
                newArr[i] = arr[i];
            }
        }
        return arr = newArr;
    }

    public static int[] addArray(int[] arr, int des, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++){
            if (i < index){
                newArr[i] = arr[i];
            } else if (i == index){
                newArr[i] = des;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }

    public static int[] set(int[] arr, int des, int index) {
        arr[index] = des;
        return arr;
    }

    /**
     * 删除数组中其中一元素
     *
     * @param arr
     * @param des
     * @return
     */
    public static int[] deleteArray(int[] arr, int des) {
        //删除中间元素
//        int[] arr = new int[]{9, 8, 7, 6, 5, 4};
//        int des = 3;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < des) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];
            }
        }
        return arr = newArr;
    }

    public static List<Integer> sortArray(int[] nums) {
        int[] newArr = nums;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < newArr.length; j++) {
                if(nums[i] > newArr[j]) {
                    int target = nums[i];
                    nums[i] = newArr[j];
                    newArr[j] = target;
                }
            }
        }
        List<Integer> list = new ArrayList();
        for (int i = 0; i < newArr.length; i++){
            list.add(newArr[i]);
        }
        return list;
    }
}
