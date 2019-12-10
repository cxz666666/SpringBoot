package com.data.util;

/**
 * @PackageName: com.data.util
 * @ClassName: MyStack
 * @Description: 栈
 * @author: cxz
 * @date 2019/12/9 16:58
 */
public class MyStack {

    //栈的底层用数组存储数据
    int[] elements;

    public MyStack(){
        elements = new int[0];
    }

    //压入元素
    public void push(int element) {
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    //取出栈顶元素
    public int pop(){
        if (elements.length == 0){
            throw new RuntimeException("stack is empty");
        }
        //取出栈顶数据
        int element = elements[elements.length - 1];
        //删除取出的数据
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
        return element;
    }

    //查看栈顶元素
    public int peek(){
        if (elements.length == 0){
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length-1];
    }

    //查看栈是否为空
    public boolean isEmpty(){
        return elements.length == 0;
    }
}
