package black.mesa.servicefeigns.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-producer")
public interface FeignClientHelloService {
    @RequestMapping("/api/v1/hello")
    String hello();
}
