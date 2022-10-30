package com.zhengxiaolong.springcloudeurekaprovider8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaProvider8001Application.class, args);
    }

}
