package net.xdclass.demo.jms;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

/**
 * @PackageName: net.xdclass.demo.jms
 * @ClassName: MsgProducer
 * @Description:
 * @author: cxz
 * @date 2019/11/28 10:00
 */
public class MsgProducer {
//
//    //生产者组名
//    @Value("${apache.rocketmq.producer.producerGroup}")
//    private String producerGroup;
//
//    //NameServer地址
//    @Value("${apache.rocketmq.namesrvAddr}")
//    private String namesrvAddr;
//
//    private DefaultMQProducer producer;
//
//    private DefaultMQProducer getProducer(){
//        return this.producer;
//    }
//
//    @PostConstruct
//    public void defaultMQProducer(){
//        //生产者组名
//        producer = new DefaultMQProducer(producerGroup);
//        //指定NameServer地址,多个地址以;隔开
//        producer.setNameServer(namesrvAddr);
//    }

}
