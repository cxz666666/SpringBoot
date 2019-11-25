package net.xdclass.demo.controller;

import net.xdclass.demo.service.ProducerService;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;

/**
 * @PackageName: net.xdclass.demo.controller
 * @ClassName: OrderController
 * @Description: 订单消息生产者
 * @author: cxz
 * @date 2019/11/20 16:45
 */
@RestController
@RequestMapping("/api/v1")
public class OrderController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("order")
    public Object order(String msg){
        Destination destination = new ActiveMQQueue("order.queue");
        producerService.sendMessage(destination, msg);
        return "成功";
    }

    @GetMapping("common")
    public Object common(String msg){
        producerService.sendMessage(msg);
        return "成功";
    }

    /**
     * 发布订阅消息
     * @param msg
     * @return
     */
    @GetMapping("topic")
    public Object topic(String msg){
        producerService.publish(msg);
        return "成功";
    }

}
