# spring-cloud-micro-services

### hystrix-dashboard
要使用hystrix dashboard监控，运行项目并使用http://{host_name}:{port}/hystrix

### service-consumer 微服务调用方的主类上需要开启@EnableHystrix，而不是@@EnableCircuitBreaker.
@EnableHystrix内含@EnableCircuitBreaker标注.
开启后hystrix-dashboard运行首页输入 http://{service-consumer-host}:{service-consumer-port}/actuator/hystrix.stream

application.yml 开启以下actuator配置

management:
  endpoints:
    web:
      exposure:
        include: "*"
        
base-path: /
