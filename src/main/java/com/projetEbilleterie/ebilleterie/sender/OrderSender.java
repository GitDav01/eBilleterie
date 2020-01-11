package com.projetEbilleterie.ebilleterie.sender;

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
