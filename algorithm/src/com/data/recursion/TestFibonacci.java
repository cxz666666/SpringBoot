package com.data.recursion;

/**
 * @PackageName: com.data.recursion
 * @ClassName: TestFibonacci
 * @Description: 斐波那契数列
 * @author: cxz
 * @date 2019/12/10 16:21
 */
public class TestFibonacci {

    public static void main(String[] args) {
//        System.out.println(fibonacci(5));
        System.out.println(addDigits(38));
    }

    public static int fibonacci(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }

//    给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
    public static int addDigits(int num) {
//        if (num <= 9) {
//            return num;
//        } else {
//            return addDigits((num / 10) + (num % 10));
//        }
        return (num-1)%9+1;
    }
}
