package org.kit.island.service;

import lombok.RequiredArgsConstructor;
import org.kit.island.model.CustomerMessage;
import org.kit.island.repository.CustomerMessageRepository;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerHandlerService {

    private static final String TO = "evg.bor.dip@gmail.com";
    private static final String TEMPLATE = "Пользователь %s, номер телефона %s, написал обращение %s";
    private static final String SUBJECT = "Обращение пользователя";
    private final JavaMailSender emailSender;
    private final CustomerMessageRepository customerMessageRepository;

    @Async
    public void handleCustomerMessage(CustomerMessage customerMessage) {
        customerMessageRepository.save(customerMessage);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(TO);
        message.setSubject(SUBJECT);
        message.setText(String.format(TEMPLATE, customerMessage.getName(), customerMessage.getPhone(), customerMessage.getMessage()));
        emailSender.send(message);
    }

}
