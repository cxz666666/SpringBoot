package net.xdclass.demo;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Topic;

@SpringBootApplication
//@ServletComponentScan
//@EnableScheduling //定时任务
//@EnableAsync // 开启异步任务
@EnableJms //开启支持jms
public class DemoApplication {

    @Bean //交给spring进行管理,方便后续注入
    public Queue queue(){
        return new ActiveMQQueue("common.queue");
    }

    @Bean //交给spring进行管理,方便后续注入
    public Topic topic(){
        return new ActiveMQTopic("video.topic");
    }

    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory activeMQConnectionFactory){
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setPubSubDomain(true);
        bean.setConnectionFactory(activeMQConnectionFactory);
        return bean;
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
