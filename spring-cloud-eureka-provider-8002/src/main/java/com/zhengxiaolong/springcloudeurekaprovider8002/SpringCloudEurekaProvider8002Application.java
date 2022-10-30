package com.zhengxiaolong.springcloudeurekaprovider8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaProvider8002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaProvider8002Application.class, args);
    }

}
