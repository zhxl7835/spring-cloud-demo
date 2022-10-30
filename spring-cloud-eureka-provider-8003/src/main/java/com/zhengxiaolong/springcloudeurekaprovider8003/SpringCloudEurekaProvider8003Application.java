package com.zhengxiaolong.springcloudeurekaprovider8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaProvider8003Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaProvider8003Application.class, args);
    }

}
