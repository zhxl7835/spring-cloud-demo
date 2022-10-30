package com.zhengxiaolong.springcloudeurekaservice7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启 Eureka server,接受其他微服务的注册
public class SpringCloudEurekaService7001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaService7001Application.class, args);
    }

}
