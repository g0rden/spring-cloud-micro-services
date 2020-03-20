package black.mesa.servicefeigns.controller;

import black.mesa.servicefeigns.service.FeignClientHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/feign-clients")
public class HelloFeignClientController {
    @Autowired
    FeignClientHelloService feignClientHelloService;

    @GetMapping("/feign-hello")
    public String feignHello() {
       return feignClientHelloService.hello();
    }

}
