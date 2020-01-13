package com.projetEbilleterie.ebilleterie.application;

import com.projetEbilleterie.ebilleterie.domain.order.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import static com.projetEbilleterie.ebilleterie.ActiveMQConfig.ORDER_QUEUE;

@Service
public class OrderSenderService {

    private static Logger log = LoggerFactory.getLogger(OrderSenderService.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendQueue(Order order) {
        log.info("sending with convertAndSend() to " + ORDER_QUEUE + " <" + order + ">");
        jmsTemplate.convertAndSend(ORDER_QUEUE, order);
    }

}
