package net.xdclass.demo.service.impl;

import net.xdclass.demo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @PackageName: net.xdclass.demo.service.impl
 * @ClassName: ProducerServiceImpl
 * @Description: 消息队列service实现
 * @author: cxz
 * @date 2019/11/20 16:34
 */

@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate; //用来发送消息到broker的对象

    //============点对点相关代码=============
    @Autowired
    private Queue queue;

    /**
     * 发送消息
     * @param destination 发送到的队列
     * @param message 待发送的消息
     */
    @Override
    public void sendMessage(Destination destination, String message) {
        jmsMessagingTemplate.convertAndSend(destination, message);
    }

    /**
     * 发送消息
     * @param message 待发送的消息
     */
    @Override
    public void sendMessage(String message) {
        jmsMessagingTemplate.convertAndSend(this.queue, message);
    }

    //=========发布订阅相关代码=============
    @Autowired
    private Topic topic;


    @Override
    public void publish(String msg) {
        jmsMessagingTemplate.convertAndSend(this.topic, msg);
    }
}
