package com.data.recursion;

/**
 * @PackageName: com.data.recursion
 * @ClassName: TestHanoi
 * @Description: 汉诺塔
 * @author: cxz
 * @date 2019/12/10 16:59
 */
public class TestHanoi {

    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }

    /**
     * @param n 共有n个盘子
     * @param from 开始的柱子
     * @param in 中间柱子
     * @param to 目标柱子
     * 无论有多少个盘子,都认为只有两个. 上面的所有盘子和下面一个盘子
     */
    public static void hanoi(int n, char from, char in, char to){
        //只有一个盘子
        if (n == 1) {
            System.out.println("第1个盘子从" + from + "移动到" + to);
        } else { // 无论有多少个盘子,都认为只有两个. 上面的所有盘子和下面一个盘子
            //移动上面所有盘子到中间位置
            hanoi(n - 1, from, to, in);
            //移动下面的盘子
            System.out.println("第" + n + "个盘子从" + from + "移动到" + to);
            //把上面所有盘子从中间位置移动到目标位置
            hanoi(n - 1, in, from, to);
        }
    }
}
