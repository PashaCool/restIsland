package org.kit.island.controller;

import lombok.RequiredArgsConstructor;
import org.kit.island.model.CustomerMessage;
import org.kit.island.service.CustomerHandlerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class CustomerHandlerController {

    private final CustomerHandlerService customerHandlerService;

    @PostMapping("/customer")
    public void handleCustomerMessage(@RequestBody @Valid CustomerMessage customerMessage) {
        customerHandlerService.handleCustomerMessage(customerMessage);
    }

}
