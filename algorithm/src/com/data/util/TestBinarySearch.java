package com.data.util;

/**
 * @PackageName: com.data.util
 * @ClassName: TestBinarySearch
 * @Description: 二分查找
 * @author: cxz
 * @date 2019/12/9 16:04
 */
public class TestBinarySearch {

    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //目标元素
        int target = 8;
        //记录开始位置
        int begin = 0;
        //记录结束位置
        int end = arr.length - 1;
        //记录中间位置
        int mid = (begin + end) / 2;
        //记录找到的元素下标
        int index = -1;
        while (true) {
            //查找元素与中间元素刚好一致
            if (arr[mid] == target) {
                index = mid;
                break;
            } else { //查找元素与中间元素不一致
                //判断中间元素是不是比目标元素大
                if (arr[mid] > target) {
                    //把结束位置调整到中间位置前一个位置
                    end = mid - 1;
                } else { //中间元素比目标元素小
                    //把开始位置调整到中间位置后一个元素
                    begin = mid + 1;
                }
                //取出新的中间位置
                mid = (begin + end) / 2;
            }
            if (begin > end) {
                System.out.println("找不到此元素!");
                break;
            }
        }
        System.out.println(index);
    }
}
