package org.kit.island.service;

import lombok.RequiredArgsConstructor;
import org.kit.island.model.CustomerMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerHandlerService {

    private static final String TO = "777pashka@tut.by";
    private static final String TEMPLATE = "Пользователь %s, номер телефона %s, написал обращение: %s";
    private static final String SUBJECT = "Обращение пользователя";
    private final JavaMailSender emailSender;

    public void handleCustomerMessage(CustomerMessage customerMessage) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(TO);
        message.setSubject(SUBJECT);
        message.setText(String.format(TEMPLATE, customerMessage.getName(), customerMessage.getPhone(), customerMessage.getMessage()));
        emailSender.send(message);
    }

}
