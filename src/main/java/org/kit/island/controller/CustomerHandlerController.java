package org.kit.island.controller;

import lombok.RequiredArgsConstructor;
import org.kit.island.model.CustomerMessage;
import org.kit.island.service.CustomerHandlerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class CustomerHandlerController {

    private final CustomerHandlerService customerHandlerService;

    @PostMapping("/customer")
    public void handleCustomerMessage(@RequestParam Map<String, String> body) {
        CustomerMessage customerMessage = new CustomerMessage();
        customerMessage.setName(body.get("myname"));
        customerMessage.setPhone(body.get("phone"));
        customerMessage.setMessage(body.get("mytext"));
        customerHandlerService.handleCustomerMessage(customerMessage);
    }

}
