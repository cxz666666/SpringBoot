package com.data;

import com.data.util.MyStack;

import java.util.Stack;

/**
 * @PackageName: com.data
 * @ClassName: TestMyStack
 * @Description:
 * @author: cxz
 * @date 2019/12/9 17:09
 */
public class TestMyStack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(9);
        stack.push(8);
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

//        MyStack myStack = new MyStack();
//        myStack.push(9);
//        myStack.push(8);
//        myStack.push(7);
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
////        System.out.println(myStack.peek());
//        System.out.println(myStack.isEmpty());
    }
}
