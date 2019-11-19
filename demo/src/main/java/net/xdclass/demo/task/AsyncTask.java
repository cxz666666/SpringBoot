package net.xdclass.demo.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @PackageName: net.xdclass.demo.task
 * @ClassName: AsyncTask
 * @Description: 异步任务类
 * @author: cxz
 * @date 2019/11/11 10:00
 */
@Component
@Async
public class AsyncTask {

    public void task1() throws InterruptedException {
        Long begin = System.currentTimeMillis();
        Thread.sleep(1000);
        Long end = System.currentTimeMillis();
        System.out.println("任务一耗时 = " + (end - begin));
    }

    public void task2() throws InterruptedException {
        Long begin = System.currentTimeMillis();
        Thread.sleep(1000);
        Long end = System.currentTimeMillis();
        System.out.println("任务二耗时 = " + (end - begin));
    }

    public void task3() throws InterruptedException {
        Long begin = System.currentTimeMillis();
        Thread.sleep(1000);
        Long end = System.currentTimeMillis();
        System.out.println("任务三耗时 = " + (end - begin));
    }
}
