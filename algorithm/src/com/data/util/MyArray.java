package com.data.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @PackageName: com.data.util
 * @ClassName: MyArray
 * @Description:
 * @author: cxz
 * @date 2019/12/5 16:48
 */
public class MyArray {

    //存储数组
    private int[] elements;

    //数组初始化
    public MyArray() {
        elements = new int[0];
    }

    //获取数组长度
    public int getLength() {
        return elements.length;
    }

    //往数组末尾添加一个元素
    public void addArray(int value) {
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = value;
        elements = newArr;
    }

    //返回数组内容
    public String seeArr() {
        return Arrays.toString(elements);
    }

    //删除其中元素
    public void delete(int index) {
        if (index < 0 || index < elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                newArr[i] = elements[i + 1];
            }
        }
        elements = newArr;
    }

    //获取数组中下标的元素
    public int get(int index) {
        if (index < 0 || index < elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        return elements[index];
    }

    //插入一个元素到指定位置
    public int[] insert(int index, int element) {
        int[] newArr = new int[elements.length + 1];
        if (index < 0 || index < newArr.length - 1) {
            throw new RuntimeException("下标越界");
        }
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = elements[i];
            } else if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = elements[i - 1];
            }
        }
        return newArr;
    }

    //替换元素
    public int[] set(int index, int element) {
        if (index < 0 || index < elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        elements[index] = element;
        return elements;
    }

    //排序
    public List<Integer> sortArray(int[] nums) {
        int[] newArr = nums;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < newArr.length; j++) {
                if (nums[i] < newArr[j]) {
                    int target = nums[i];
                    nums[i] = newArr[j];
                    newArr[j] = target;
                }
            }
        }
        List<Integer> list = new ArrayList();
        for (int i = 0; i < newArr.length; i++) {
            list.add(newArr[i]);
        }
        return list;
    }

    //线性查找
    public int search(int target) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //二分查找
    public int binarySearch(int target){
        int begin = 0;
        int end = elements.length - 1;
        int mid = (begin + end) / 2;
        while (true) {
            if (elements[mid] == target){
                return mid;
            } else {
                if (elements[mid] > target){
                    end = mid - 1;
                } else {
                    begin = mid + 1;
                }
                mid = (begin + end) / 2;
            }
            if (begin > end) {
                throw new RuntimeException("找不到此元素!");
            }
        }
    }
}
