package net.xdclass.demo.service;

import javax.jms.Destination;

/**
 * @PackageName: net.xdclass.demo.service
 * @ClassName: ProducerService
 * @Description: 消息队列service
 * @author: cxz
 * @date 2019/11/21 10:08
 */
public interface ProducerService {

    //============点对点相关代码=============
    /**
     * 指定消息队列,还有消息
     * @param destination
     * @param message
     */
    public void sendMessage(Destination destination, final String message);

    /**
     * 使用默认消息队列发送消息
     * @param message
     */
    public void sendMessage(final String message);

    //=========发布订阅相关代码=============
    /**
     * 消息发布者
     * @param msg
     */
    public void publish(String msg);
}
