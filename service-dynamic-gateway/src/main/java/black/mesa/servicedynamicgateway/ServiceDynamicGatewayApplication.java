package black.mesa.servicedynamicgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ServiceDynamicGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDynamicGatewayApplication.class, args);
    }

}
