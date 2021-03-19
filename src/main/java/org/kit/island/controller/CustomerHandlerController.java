package org.kit.island.controller;

import lombok.RequiredArgsConstructor;
import org.kit.island.model.CustomerMessage;
import org.kit.island.service.CustomerHandlerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
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
//        return "forward:/static/index.html";
    }

    @GetMapping("/index")
//    @ResponseBody
    public String welcome() {
        return "/public_html/index.html";
    }

}
