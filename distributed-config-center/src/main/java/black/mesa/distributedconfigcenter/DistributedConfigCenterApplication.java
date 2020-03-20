package black.mesa.distributedconfigcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DistributedConfigCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistributedConfigCenterApplication.class, args);
    }

}
