package com.data.recursion;

/**
 * @PackageName: com.data.recursion
 * @ClassName: TestRecursion
 * @Description: 递归
 * @author: cxz
 * @date 2019/12/10 16:12
 */
public class TestRecursion {
    public static void main(String[] args) {
        print(3);
    }
    public static void print(int i){
        if (i > 0){
            System.out.println(i);
            print(i - 1);
        }
    }
}
