package com.zhengxiaolong.springcloudeurekaconsumer80.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class MySelfRibbonRuleConfig {

    @Bean
    public IRule myRule() {
        // RandomRule 为随机策略
        //return  new RandomRule();
        return new MyRandomRule(); //自定义，随机选择某一个微服务，执行五次
    }

}
