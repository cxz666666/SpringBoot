package net.xdclass.demo.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @PackageName: net.xdclass.demo.jms
 * @ClassName: OrderConsumer
 * @Description: 订单消息消费者
 * @author: cxz
 * @date 2019/11/25 10:44
 */
@Component
public class OrderConsumer {

    /**
     * 实时监听对应的队列是否有新消息到来
     * @param text
     */
    @JmsListener(destination = "order.queue")
    public void receiveQueue(String text){
        System.out.println("OrderConsumer收到的报文是:" + text);
    }

}
