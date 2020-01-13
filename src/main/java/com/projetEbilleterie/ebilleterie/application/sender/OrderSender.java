package com.projetEbilleterie.ebilleterie.application.sender;

import com.projetEbilleterie.ebilleterie.domain.message.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

//import static com.projetEbilleterie.ebilleterie.ActiveMQConfig.ORDER_QUEUE;
import static com.projetEbilleterie.ebilleterie.ActiveMQConfig.ORDER_QUEUE;

@Service
public class OrderSender {

    private static Logger log = LoggerFactory.getLogger(OrderSender.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendQueue(Order order) {
        log.info("sending with convertAndSend() to " + ORDER_QUEUE + " <" + order + ">");
        jmsTemplate.convertAndSend(ORDER_QUEUE, order);
    }

}
/*
test sender

package com.projetEbilleterie.ebilleterie;
import com.projetEbilleterie.ebilleterie.domain.message.Order;
import com.projetEbilleterie.ebilleterie.sender.OrderSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class    EticketsApplication implements ApplicationRunner,WebMvcConfigurer {

    private static Logger log = LoggerFactory.getLogger(EticketsApplication.class);

    @Autowired
    private OrderSender orderSender;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        log.info("Spring Boot ActiveMQ Queue Point to Point Configuration Example");

        for (Long i = 0L; i < 5; i++){

            Order order = new Order(i, "order_prov_"+Long.toString(i), i, LocalDateTime.now());
            orderSender.sendQueue(order);
        }

  //      log.info("Waiting for all ActiveMQ JMS Messages to be consumed");
  //      TimeUnit.SECONDS.sleep(3);
  //      System.exit(-1);
    }

    public static void main(String[] args) {
        SpringApplication.run(EticketsApplication.class, args);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("GET","PUT","POST","DELETE");
    }
}
 */
