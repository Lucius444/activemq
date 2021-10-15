package com.id3.activemq.jms;
import lombok.AllArgsConstructor;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MessageReceiver {
    @JmsListener(destination = "cicek-queue")
    public void receiveQueue(String text){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Message Received: " + text);
    }
}