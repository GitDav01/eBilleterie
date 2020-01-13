package com.projetEbilleterie.ebilleterie.application.consumer;

import com.projetEbilleterie.ebilleterie.application.ProviderService;
import com.projetEbilleterie.ebilleterie.domain.provider.Order;
import com.projetEbilleterie.ebilleterie.domain.provider.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Session;

import static com.projetEbilleterie.ebilleterie.ActiveMQConfig.ORDER_QUEUE;

@Component //activate the jms consumer
public class OrderConsumer {

    @Autowired
    ProviderService providerService;

    private static Logger log = LoggerFactory.getLogger(OrderConsumer.class);

    @JmsListener(destination = ORDER_QUEUE)
    public void receiveMessage(@Payload Order order,
                                    @Headers MessageHeaders headers,
                                    Message message,
                                    Session session) {

        log.info("received <" + order + ">");
        Provider provider=this.providerService.searchByNameQuery(order.getName());
        this.providerService.addOrder(provider.getId(),order );
    }

}
