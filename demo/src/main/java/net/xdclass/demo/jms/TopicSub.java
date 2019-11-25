package net.xdclass.demo.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @PackageName: net.xdclass.demo.jms
 * @ClassName: TopicConsumer
 * @Description: 消息订阅者
 * @author: cxz
 * @date 2019/11/25 15:42
 */
@Component
public class TopicSub {

    @JmsListener(destination = "video.topic", containerFactory = "jmsListenerContainerTopic")
    public void receive1(String msg){
        System.out.println("video.topic 消费者: receive1=" + msg);
    }

    @JmsListener(destination = "video.topic", containerFactory = "jmsListenerContainerTopic")
    public void receive2(String msg){
        System.out.println("video.topic 消费者: receive2=" + msg);
    }

    @JmsListener(destination = "video.topic", containerFactory = "jmsListenerContainerTopic")
    public void receive3(String msg){
        System.out.println("video.topic 消费者: receive3=" + msg);
    }

}
